package basic;


import java.util.Random;
public class Test02 {
	public static void main(String[] args) {
		int age = 5;
		age = age + 1;
		System.out.println(age);
		// int max = Integer.MAX_VALUE;
		// System.out.println(max);
		// ֱ������������������ֱ�Ӹ��������� ��ֱ���� == ������
		// Ĭ�ϵ�ֱ���� ��10 ���� �����֣�01234~9
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

		// main�����в���ִ�У��������в���ִ��
		boolean open = true;
		boolean used = false;
		if (used) {
			System.out.println("���ְ��� ");
		} else {
			System.out.println("�»�����");
		}

		char d = 20013;
		System.out.println(d);

		// str = '';

		// System.out.println(Integer.toBinaryString("�ڶ�")); // ??

		System.out.println((int) '��');

		System.out.println('��');

		// ��� ��0�� ~ ��9�� ��A��~'Z' 'a'~'Z' , 0

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

		// ���������� 'A'~'Z'
		// ������������ 65~90
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
		
		
		//�������ַ�ת��Ϊ��Ӧ������ 
		//'6'ת��Ϊ 6  
		
		d = '6';
		b = d-'0';
		System.out.println(b);
		
		//�ַ���������
		
		//��������ת��
		//1.java����������ȷ���������ͣ�ǿ��������,��������ĳ�������Ͳ������ת���� 
		//2.��ͬ�������ݸ�ֵ������Ҫ����ת�� 
		//3.��������ת����Ϊ���Զ�����ת�� ǿ������ת��
		
		
		int i = -2;
		//long l = i;
		System.out.println(l); //64λ��-2 

		//������� 
		l = -6L;
		//i = k;
		i = (int)l;
		System.out.println(i); //-6 32λ��-6
		l = 0x12abcf00000005L; //��ȥ�ߵ�32λ 
		i = (int)l;
		System.out.println(i);
		System.out.println(l);
		System.out.println(Long.toBinaryString(l));
		
		
		//������ʧ
		float p = 3.141592431242144F * 
						1000000000000000000F;
		System.out.println(p);
		float f = Long.MAX_VALUE;
		System.out.println(f);
		
		double e = 3.1346707846890D;
		float x = (float)e;
		System.out.println(e);
		System.out.println(x);
		
		
		//ʵ��С��������������������4���5��  doubleת������Ҫ��long���ͽ���  IEEE754
		double price = 4.56;
		long val = (long) (price +0.5);
		System.out.println(val);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
