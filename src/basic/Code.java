package basic;

import java.util.*;

public class Code {
	public static void show(char[][] a)
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static String f(String key, String s)
	{
		char[][] A = new char[5][5];
		
		int len = key.length();
		for(char i='a'; i<='z'; i++)
		{
			if(key.indexOf(i)<0)
				key = key + i; 
		}
		
		char last = key.charAt(25);
		
		for(int i=0; i<25; i++)
		{
			A[i/5][i%5] = key.charAt(i);
		}
		
		show(A);
		
		String s2 = "";
		
		for(;;)
		{
			if(s.length()<2)
			{
				s2 += s;
				break;
			}
			
			char a = s.charAt(0);
			char b = s.charAt(1);
			s = s.substring(2);
			
			int n1 = key.indexOf(a);
			int n2 = key.indexOf(b);
			
			if(n1==25 || n2==25) 
			{
				s2 = s2 + a + b;
				continue; 
			}
			
			int row1 = n1 / 5;
			int col1 = n1 % 5;
			int row2 = n2 / 5;
			int col2 = n2 % 5;
			
			if(row1==row2 || col1==col2)
			{
				s2 = s2 + b + a;
				continue;
			}			
			char a1 = key.charAt(row1 * 5 + col2);
			char b1 = key.charAt(row2 * 5 + col1);
			s2 = s2 + a1 + b1;
		}
		
		return s2;
	}
	public static void main(String[] args)
	{
		String key = "az";
		String s = "adtxyabyy";
		System.out.println(f(key, s));
	}
}
