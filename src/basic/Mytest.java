package basic;

public class Mytest {
	public static String encode(String x)
	{
		StringBuffer s = new StringBuffer();
		
		int n0 = 0;  // 0连续的次数
		int n1 = 0;  // 1连续的次数
		for(int i=0; i<x.length(); i++)
		{
			char c = x.charAt(i);
			s.append(c);
			
			if(c=='0')
			{
				n0++;
				n1=0;
			}
			else
			{
				n1++;
				n0=0;
			}
			
			if(n0==3) 
			{
				s.append('1');
				n0 = 0;
			}
			if(n1==3)
			{
				s.append('0');
				n1 = 0;
			}
		}
		
		return s.toString();
	}
	
	public static String decode(String x)
	{
		StringBuffer s = new StringBuffer();
		
		int n0 = 0;  // 0连续的次数
		int n1 = 0;  // 1连续的次数		
		
		for(int i=0; i<x.length(); i++)
		{
			char c = x.charAt(i);

			s.append(c);
			
			if(c=='0')
			{
				n0++;
				n1=0;
			}
			else
			{
				n1++;
				n0=0;
			}
			
			if(n0==3 || n1==3)
			{
				i++;  // 越过1个字符不收集
				n0 = n1 = 0;
			}
		}
		
		return s.toString();
	}
	
	
	public static void main(String[] args)
	{
		// 通信编码问题
		//String s = "1010100100100001011110100010101010100001010101111";
		// 连续的3个0，后需要插入一个1
		// 连续的3个1，后需要出入一个0
		// 10101001001000101011101010001101010
		//               *      *      *  
		
		String s = "1010100100100001011110100010101010100001010101111";
		String s2 = encode(s);
		System.out.println(s2);
		String s3 = decode(s2);
		System.out.println(s3);
	
	}
}
