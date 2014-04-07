package basic;
public class Tran {
		static String A1toRC(String x)
		{
			String x1 = ""; //列部分
			String x2 = ""; //行部分
			for(int i=0; i<x.length(); i++){
				char c = x.charAt(i);
				if(c>='0' && c <='9'){
					x1 = x.substring(0,i);
					x2 = x.substring(i);
					break;
				}
			}
			if(x1.length()==1) 
				return "R" + x2 + "C" + (x1.charAt(0) - 'A' + 1);
			else
				return "R" + x2 + "C" 
				+ ((x1.charAt(0)-'A') * 26 + (x1.charAt(1)-'A') + 27);
		}
		public static void main(String[] args)
		{
			System.out.println(A1toRC("Z5"));
			System.out.println(A1toRC("BC5"));
		}
	}
