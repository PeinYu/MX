package NeXT;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

import ORC.CompressionCodec;

public class OrcEncodingRead {
	static java.util.Calendar c=java.util.Calendar.getInstance();    
	static java.text.SimpleDateFormat f=new java.text.SimpleDateFormat("yyyy年MM月dd日hh时mm分ss秒"); 
	//public static  int fileLong ;
	public static  int fileLong =0 ,count =0 ,runcount=0 ;
	public static   long startTime ,encodingReadTime ,encodingTime,encodingWriteTime, RencodingReadTime ,RencodingTime,RencodingWriteTime, finalTime;
	public static   long DeltaencodingReadTime=0 ,DeltaencodingTime,DeltaencodingWriteTime=0, DeltaRencodingReadTime=0 ,DeltaRencodingTime=0,DeltaRencodingWriteTime=0;
	
	//public static void runSeekTest(String[] s ,CompressionCodec codec) throws Exception {
		
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
		
		//}
}


