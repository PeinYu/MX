package NeXT;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class OrcRecodingRead {

	File readfile=new File(s[1]);
	FileInputStream  readfis=new FileInputStream(readfile);
	DataInputStream  readdis =new DataInputStream(readfis);
	byte[] bytes=new byte[(int)readfile.length()];			
	readdis.readFully(bytes);
	readdis.close();
	//readdis.
	RencodingTime=System.currentTimeMillis() ;

}
