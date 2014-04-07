package basic;
public class CuttingX {
	public static void main(String[] args){
		String begin = "23:59:16";
		String end = "00:02:11";
		
		//begin.split(":");
		String[] ss = begin.split(":");
		int a = (Integer.parseInt(ss[0]) * 60 + Integer.parseInt(ss[1])) * 60
			+ Integer.parseInt(ss[2]);
		//Integer.parseInt(ss[0])
		ss = end.split(":");
		int b = (Integer.parseInt(ss[0]) * 60 + Integer.parseInt(ss[1])) * 60
			+ Integer.parseInt(ss[2]);

		int x = b - a;
		if(x<0) x += 24*60*60;
		System.out.println(x);
	}
}
		/*String s1 = "12:38:15";
		String s2 = "12:39:17";
		String hh = "";String mm = "";String ss = "";
		for(int i=0; i<s1.length(); i++){
			char c = s1.charAt(i);
			if(c==':'){
				//System.out.println();
				//s11 =  hh*60*60;
				String s = hh*60*60+ mm*60+ss; 
			}
			else  
				hh +=c;*/

