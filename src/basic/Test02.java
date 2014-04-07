package basic;


import java.util.Random;
public class Test02 {
	public static void main(String[] args) {
		int age = 5;
		age = age + 1;
		System.out.println(age);
		// int max = Integer.MAX_VALUE;
		// System.out.println(max);
		// 直接量（常数）：就是直接给出的数据 ，直接量 == 字面量
		// 默认的直接量 是10 进制 ，数字：01234~9
		//

		int a = 5;
		String bin = Integer.toBinaryString(a);
		System.out.println(bin);

		int max = Integer.MAX_VALUE;
		// int max = Integer.MAX_VALUE;

		System.out.println(max);
		String hex = Integer.toHexString(max);
		bin = Integer.toBinaryString(max);
		System.out.println(bin);
		System.out.println(hex);

		String oct = Integer.toOctalString(max);
		System.out.println(oct);
		int b = 0x7fffffff;

		int c = 070;
		System.out.println(c);

		long l = 1292929299;
		// long l = 129299292929L;
		System.out.println(l);

		long now = System.currentTimeMillis();
		System.out.println(now);
		long year = now / 1000 / 60 / 60 / 24 / 365 + 1970;
		System.out.println(year);
		long end = Long.MAX_VALUE;
		year = end / 1000 / 60 / 60 / 24 / 365 + 1970;
		System.out.println(year);

		// double pi = 3.1415926535897932384626433832795;

		// main方法中才能执行，放在类中不能执行
		boolean open = true;
		boolean used = false;
		if (used) {
			System.out.println("二手八折 ");
		} else {
			System.out.println("新货八折");
		}

		char d = 20013;
		System.out.println(d);

		// str = '';

		// System.out.println(Integer.toBinaryString("馅儿")); // ??

		System.out.println((int) '中');

		System.out.println('中');

		// 输出 ‘0’ ~ ‘9’ ‘A’~'Z' 'a'~'Z' , 0

		System.out.println((int) '0'); // 48
		System.out.println((int) '8');
		System.out.println((int) '9');// 56

		System.out.println((int) 'A'); // 65
		System.out.println((int) 'B');
		// ..
		System.out.println((int) 'Z');

		System.out.println((int) 'a'); // 90
		System.out.println((int) 'b');
		System.out.println((int) 'z');

		// int

		c = 'A' + 1;
		System.out.println(c);

		// 如何随机生成 'A'~'Z'
		// 就是生成数： 65~90
		// = [65,91) = 65 + [0,26)
		// = 65 +random.nextint(26)
		// = 'A' +random.nextint(26)

/*		Random random = new Random();
		int n = random.nextInt(26);
		c = (char)('A'+n);
		System.out.println(n);
		System.out.println(c);
*/
		Random random = new Random(System.currentTimeMillis());
		int n = random.nextInt(26);
		//c = (char)('A'+n);
		System.out.println(n);
		n = random.nextInt(26);
		System.out.println(n);
		n = random.nextInt(26);
		System.out.println(n);
		n = random.nextInt(26);
		System.out.println(n);
		n = random.nextInt(26);
		
		
		//将数字字符转换为对应的数字 
		//'6'转化为 6  
		
		d = '6';
		b = d-'0';
		System.out.println(b);
		
		//字符的字面量
		
		//数据类型转换
		//1.java的数据有明确的数据类型（强类型语言,即定义了某数据类型不能随便转换） 
		//2.不同类型数据赋值，就需要类型转换 
		//3.数据类型转换分为：自动类型转换 强制类型转换
		
		
		int i = -2;
		//long l = i;
		System.out.println(l); //64位的-2 

		//溢出现象 
		l = -6L;
		//i = k;
		i = (int)l;
		System.out.println(i); //-6 32位的-6
		l = 0x12abcf00000005L; //削去高的32位 
		i = (int)l;
		System.out.println(i);
		System.out.println(l);
		System.out.println(Long.toBinaryString(l));
		
		
		//精度损失
		float p = 3.141592431242144F * 
						1000000000000000000F;
		System.out.println(p);
		float f = Long.MAX_VALUE;
		System.out.println(f);
		
		double e = 3.1346707846890D;
		float x = (float)e;
		System.out.println(e);
		System.out.println(x);
		
		
		//实现小数（浮点数）到整数的4舍得5入  double转到整数要用long类型接收  IEEE754
		double price = 4.56;
		long val = (long) (price +0.5);
		System.out.println(val);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
