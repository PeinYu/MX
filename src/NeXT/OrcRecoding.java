package NeXT;

import java.nio.ByteBuffer;

import ORC.DynamicByteArray;
import ORC.InStream;
import ORC.RunLengthIntegerReader;

public class OrcRecoding {

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

}
