package basic;

import java.util.regex.*;

public class zhenn {
	public static void main(String[] args)
	{
		String s = "c:/abc/[8]xyz/k[11..19].dat";
		
		Pattern pt = Pattern.compile("\\[([0-9]+)\\.\\.([0-9]+)\\]");
		Matcher mc = pt.matcher(s);
		if(mc.find()){
			int a = Integer.parseInt(mc.group(1));
			int b = Integer.parseInt(mc.group(2));
			
			String s1 = s.substring(0,mc.start()); 
			String s2 = s.substring(mc.end()); 
			
			for(int i=a; i<=b; i++)
				System.out.println(s1 + i + s2);
		}
	}
}
