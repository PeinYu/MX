package basic;

public class Bhole {
	public static void main(String[] main){
		
		int n = 5346;
		//n = 3482;
		
		for(;;){
		System.out.println(n);
		char[] cc = (n + "").toCharArray();
		java.util.Arrays.sort(cc);
		
		int min = 0;
		for(int i=0; i<cc.length; i++) min = min * 10 + (cc[i] - '0');
		//System.out.println(min);
		
		int max = 0;
		for(int i=cc.length-1; i>=0; i--) max = max * 10 + (cc[i] - '0');
		//System.out.println(max);
		
		int n2 = max - min ;
		if(n==n2) break;
		n = n2;
		}
	}
}
		
		
	