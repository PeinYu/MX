package IO;

import java.io.*;
public class GetPath {
     
public static void main(String[] args){
	   File file1 = new File(".\\test1.txt");
       File file2 = new File("D:\\workspace\\test\\test1.txt");
	   System.out.println("-----Ĭ�����·����ȡ��·����ͬ------");
	   System.out.println(file1.getPath());
	   System.out.println(file1.getAbsolutePath());
	    System.out.println("-----Ĭ�Ͼ���·��:ȡ��·����ͬ------");
	    System.out.println(file2.getPath());
	    System.out.println(file2.getAbsolutePath());
    }

}