package NeXT;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class OrcRecodingWrite {

	FileOutputStream    revrseencodingFis=new  FileOutputStream(new File(s[2])) ;
	DataOutputStream  revrseencodingDos=new DataOutputStream(revrseencodingFis) ;
	for(int i=0; i < fileLong; ++i) {

		//int x = (int) in.next();
		revrseencodingDos.writeInt(result[i]);
		//count ++ ;
	}
	revrseencodingFis.close();
	revrseencodingDos.close();

}
