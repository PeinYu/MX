package basic;

public class Test01 {
	public static void main(String[] args) {
		int age;
		//System.out.println(age);
		age = 16;
		age = 15;
		System.out.println(age);
		int score = 100;
		System.out.println(score);
		score = 200;
		System.out.println(score);
		if (score > 80) {
			int iq = 100;
			System.out.println(iq);
		}
		// System.out.println(iq);
		int iq = 200;
		System.out.println(iq);

		int Breath;
		Breath = 78;
		if (Breath > 0) {
			System.out.println("thinkingMX");

			int i = 15;
			System.out.println(Integer.toBinaryString(i));

			i = 'A';
			System.out.println(Integer.toBinaryString(i));
		
			i = 192;
			System.out.println(Integer.toBinaryString(i));
			
			i = 0xc0;
			System.out.println(Integer.toBinaryString(i));
			
			i = 0xaaaa;
			System.out.println(Integer.toBinaryString(i));
			
			i = 0xffff;
			System.out.println(Integer.toBinaryString(i));
			
			i = 'жа';
			System.out.println(Integer.toBinaryString(i));
			
			int size = 1024*1024*1024*2;
			System.out.println(size);
		}
	}
}
