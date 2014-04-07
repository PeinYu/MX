package ORC;

import java.io.*;
import java.nio.ByteBuffer;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import ORC.CompressionCodec;
import ORC.DynamicByteArray;
import ORC.InStream;
import ORC.OutStream;
import ORC.RunLengthIntegerReader;
import ORC.RunLengthIntegerWriter;
import ORC.TestInStream;

public class TestCal {

	static java.util.Calendar c=java.util.Calendar.getInstance();    
	static java.text.SimpleDateFormat f=new java.text.SimpleDateFormat("yyyy年MM月dd日hh时mm分ss秒"); 
	
	public static  int fileLong =0 ,count =0 ,runcount=0 ;
	public static   long startTime ,encodingReadTime ,encodingTime,encodingWriteTime, RencodingReadTime ,RencodingTime,RencodingWriteTime, finalTime;
	public static   long DeltaencodingReadTime=0 ,DeltaencodingTime,DeltaencodingWriteTime=0, DeltaRencodingReadTime=0 ,DeltaRencodingTime=0,DeltaRencodingWriteTime=0;
	public static void runSeekTest(String[] s ,CompressionCodec codec) throws Exception {
		
		encodingReadTime=System.currentTimeMillis() ;
		
		File file=new File(s[0]) ;
		FileInputStream  fis =new FileInputStream(file);
		DataInputStream  dis=new   DataInputStream(fis);
		fileLong=(int) file.length()/4;
		//	System.out.println("fileLong  "+fileLong);
		int[] initValues=new int[fileLong] ;

		for (int i = 0; i < fileLong; i++) {
			//cw.writeInteger(dis.readInt());
			initValues[i]=dis.readInt() ;
		}
		dis.close();
		
		encodingTime=System.currentTimeMillis() ;
		DeltaencodingReadTime=DeltaencodingReadTime+encodingTime-encodingReadTime ;
		
		TestInStream.OutputCollector collect = new TestInStream.OutputCollector();
		RunLengthIntegerWriter out = new RunLengthIntegerWriter(
				new OutStream("test", 1000, codec, collect), true);
		for (int i = 0; i < fileLong; i++) {
			//cw.writeInteger(dis.readInt());

			out.write(initValues[i]);
		}
		out.flush();
		
		encodingWriteTime=System.currentTimeMillis() ;
		DeltaencodingTime=DeltaencodingTime+encodingWriteTime-encodingTime ;
		
		FileOutputStream fos=new FileOutputStream(new File(s[1]));
		DataOutputStream  dos =new DataOutputStream(fos);
		collect.buffer.write(dos, 0, collect.buffer.size());
		dos.close();
		
		RencodingReadTime=System.currentTimeMillis() ;
		DeltaencodingWriteTime=DeltaencodingWriteTime+RencodingReadTime-encodingWriteTime;
		
		File readfile=new File(s[1]);
		FileInputStream  readfis=new FileInputStream(readfile);
		DataInputStream  readdis =new DataInputStream(readfis);
		byte[] bytes=new byte[(int)readfile.length()];			
		readdis.readFully(bytes);
		readdis.close();
		
		RencodingTime=System.currentTimeMillis() ;
		DeltaRencodingReadTime=DeltaRencodingReadTime+RencodingTime-RencodingReadTime;
		
		DynamicByteArray  dynamicBuffer = new DynamicByteArray();
		dynamicBuffer.add(bytes, 0, bytes.length);

		ByteBuffer inBuf = ByteBuffer.allocate(dynamicBuffer.size());
		//  System.out.println("56  "+inBuf.getInt());
		dynamicBuffer.setByteBuffer(inBuf, 0, dynamicBuffer.size());

		inBuf.flip();

		RunLengthIntegerReader in = new RunLengthIntegerReader(InStream.create
				("test", inBuf, codec, (int)readfile.length()), true);
		//	int  count=0 ;
		int[]  result=new  int[fileLong] ;
		for(int i=0; i < fileLong; ++i) {

			result[i]= (int) in.next();
			count ++ ;
		}
		inBuf.clear();
		RencodingWriteTime=System.currentTimeMillis() ;
		DeltaRencodingTime=DeltaRencodingTime+RencodingWriteTime-RencodingTime;
		FileOutputStream    revrseencodingFis=new  FileOutputStream(new File(s[2])) ;
		DataOutputStream  revrseencodingDos=new DataOutputStream(revrseencodingFis) ;
		for(int i=0; i < fileLong; ++i) {

			//int x = (int) in.next();
			revrseencodingDos.writeInt(result[i]);
			//count ++ ;
		}
		revrseencodingFis.close();
		revrseencodingDos.close();
		finalTime=System.currentTimeMillis() ;
		DeltaRencodingWriteTime=DeltaRencodingWriteTime+finalTime-RencodingWriteTime;
		
	}
	
/*	@Test*/
	public static void testUncompressedSeek(String[] s) throws Exception {
		runSeekTest(s,null);
	}

	/*@Test*/
	public static void testCompressedSeek(String[] s) throws Exception {
		//   runSeekTest(new ZlibCodec());
		runSeekTest(s,new SnappyCodec());
	}
	
	public static void main(String[] args) throws Exception{
		File sourcefileDirectory =new File(args[0]);
		File[]  sourcefiles=    sourcefileDirectory.listFiles() ;
		int length=sourcefiles.length;
		String[] sourcestr=new String[length];
		String[] encodinstr=new String[length];
		String[]  revrseEncodingstr=new String[length];
		for (int i=0;i<sourcefiles.length;i++){
			sourcestr[i]=sourcefiles[i].getAbsolutePath() ;
			encodinstr[i]=args[1]+"/"+i  ;
			revrseEncodingstr[i]=args[2]+"/"+i  ;
			//	System.out.println(finalstr[i]);
		}
		String[]  runstr=new String[3] ;
		startTime=System.currentTimeMillis() ;
		System.out.println("ORCRLE :  begin ORCRLE :  " +new java.text.SimpleDateFormat("yyyy年MM月dd日hh时mm分ss秒").format(java.util.Calendar.getInstance().getTime())); 
		for (int i=0;i<length;i++){
			runstr[0]=sourcestr[i];
			runstr[1]=encodinstr[i] ;
			runstr[2]=revrseEncodingstr[i] ;
			testUncompressedSeek(runstr) ;
			runcount++ ;
		}
		/*System.out.println("ORCRLE:begin ORCRLE:" +f.format(java.util.Calendar.getInstance().getTime())); 
		System.out.println("ORCRLE:begin ORCRLE:" +f.format(java.util.Calendar.getInstance().getTime()));*/
		
		System.out.println("ORCRLE :  finish  ORCRLE :  " +new java.text.SimpleDateFormat("yyyy年MM月dd日hh时mm分ss秒").format(java.util.Calendar.getInstance().getTime())); 
		System.out.println("totoal run :"+runcount+"  times");
		System.out.println("totoal valuecount :"+count);
		//DeltaencodingReadTime=0 ,DeltaencodingTime,DeltaencodingWriteTime=0, DeltaRencodingReadTime=0 ,DeltaRencodingTime=0,DeltaRencodingWriteTime=0;
		System.out.println("DeltaencodingReadTime   :"+DeltaencodingReadTime+"  mis");
		System.out.println("DeltaencodingTime   :"+DeltaencodingTime+"  mis");
		System.out.println("DeltaencodingWriteTime   :"+DeltaencodingWriteTime+"  mis");
		System.out.println("DeltaRencodingReadTime   :"+DeltaRencodingReadTime+"  mis");
		System.out.println("DeltaRencodingTime   :"+DeltaRencodingTime+"  mis");
		System.out.println("DeltaRencodingWriteTime   :"+DeltaRencodingWriteTime+"  mis");
		System.out.println("total  time :  "+(finalTime-startTime)+"  mis");
		
	}
}
