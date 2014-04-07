package basic;

public class Test03 {
	public static void main(String[] args) {
		int  i = 5;
		long l = 6;
		//int y = i+1;
		long x = i+ 1;
		System.out.println(x);
		
		byte b1 = 3;
		byte b2 = 4;
		//byte b3 = b1+b2 ;
		int b3 =b1+b2;
		System.out.println(b3);
		
		byte b4 = 3+4;//7 没超范围 
		//byte b5 = 3 +126;
		
		
		//运算溢出现象 
		i = Integer.MAX_VALUE;
		int n = i+1; //溢出了
		System.out.println(n);
		
		l = i+1; //溢出了 
		System.out.println(l);
		
		l = i +1L; //(long)i+1
		System.out.println(l);
	}
}
