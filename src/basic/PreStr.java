package basic;

public class PreStr {
	public static void main(String[] args){
		String s = "5364";
		
		int n = s.charAt(0) - '0';
		n = n * 10 + (s.charAt(1) -'0');
		n = n * 10 + (s.charAt(2) -'0');
		
		System.out.println(n);
	}
}
