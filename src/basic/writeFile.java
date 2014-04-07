package basic;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.*;
import java.util.Vector;
import java.util.*;

public class writeFile {
	public static void writeChar(String fileName , String fileContent){
	//写字符文件的方法
	FileWriter write;
	try
	{
	write = new FileWriter(fileName,true);
	write.write(fileContent);
	write.close();
	}catch(Exception ex){ex.printStackTrace();}	
}
	public static void writeByte(String fileName , byte[] fileContent){
	//写字节文件的方法
	FileOutputStream write;
	try{
		write = new FileOutputStream(fileName,true);
		write.write(fileContent);
		write.close();
	}catch(Exception e){e.printStackTrace();}
}
	public static void writeLine(String fileName,String fileContent){
	//通过缓冲流写字符文件的方法
	BufferedWriter write;
	try
	{
	write = new BufferedWriter(new FileWriter(fileName,true));
	write.write(fileContent);
	write.close();
	}catch(Exception ex){ex.printStackTrace();}
}
public static void writeObject(String fileName , Object fileContent){
	//写对象文件的方法
	FileOutputStream write;
	try{
		write = new FileOutputStream(fileName,true);
		ObjectOutputStream writeObj = new ObjectOutputStream(write);
		writeObj.writeObject(fileContent);
		write.close();
	}catch(IOException e){e.printStackTrace();}
}
public static void main(String[] args){
		writeChar("f:\charFile","hellomx310");
		writeByte("f:\byteFile","hellomx310".getBytes());
		wtiteLine("f:\charFileLine","hellomx310");
		Vector v = new Vector();
			v.add("笨笨");
			v.add("北京");
			v.add("房山");
		writeObject("f:\objV",v);
		writeObject("f:\objD",new Date());
		writeObject("f:\objM",new MySeriallizable(5,5));
		}
class MySerializable implements java.io.Serializable{
	int x,y;
	MySerializable(int x , int y){this.x = x ;this.y = y;}
	}
}