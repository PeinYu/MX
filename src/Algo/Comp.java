package Algo;

	public class Comp
	{
		static boolean compare(String a, String b)
		{
			if(a.length() != b.length()) return false;
			if(a.length()==0) return true;
			
			if(a.charAt(0) != b.charAt(0)) return false;
			return compare(a.substring(1), b.substring(1));
		}
		
		public static void main(String[] args)
		{
			String s1 = "bcde";
			String s2 = "abcde";
			
			System.out.println(compare(s1,s2));
		}
	}
