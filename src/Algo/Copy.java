package Algo;

import java.io.*;
import java.util.*;

public class Copy
{
	public static boolean toFind(String s1, String s2)
	{
		boolean tag = false;
		int p1 = -2;
		int p2 = -2;
		for(int i=0; i<s2.length()-20+1; i++)
		{
			String s = s2.substring(i,i+20);
			int n = s1.indexOf(s);
			if(n>=0)
			{
				if(!(i==p2+1 && (n==p1+1 || n==p1)))
				{
					System.out.println("貌似抄袭：" + s + "  " + n + "   " + i);
					tag = true;
				}
				p1 = n;
				p2 = i;
			}
		}
		
		return tag;
	}
	
	public static void main(String[] args) throws Exception
	{	
		String s1 = "";
		String s2 = "";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("a.txt")));
		for(;;)
		{
			String s = br.readLine();
			if(s==null) break;
			s1 += s;
		}
		br.close();
		
		br = new BufferedReader(new InputStreamReader(new FileInputStream("b.txt")));
		for(;;)
		{
			String s = br.readLine();
			if(s==null) break;
			s2 += s;
		}
		br.close();
		
		if(!toFind(s1, s2))
			System.out.println("找不到貌似抄袭部分");
	}
}

