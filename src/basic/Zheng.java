package basic;

public class Zheng {
	public static void main(String[] args)
	{
		String s = "abc1234xyz667kkmd764tttt";
		
		s = s.replaceAll("([a-zA-Z])([0-9])", "$1,$2");
		s = s.replaceAll("([0-9])([a-zA-Z])", "$1,$2");
		
		System.out.println(s);
		
	}
}
