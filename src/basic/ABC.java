package basic;

public class ABC {
	public static void main(String[] args){
		//一刀切
		String s = "abcde";
		String s2 = "";
		
		for(int i=0; i<s.length(); i++){
			s2 += "," + s.charAt(i);
		}
		s2 = s2.substring(1);
		System.out.println(s2);
		
		
		
		
		
		
		
		
		
		
		
		/*//一刀切(上式)
		String s = "abc ttt,kmd,uuu xyz";
		String s2 = "";
		
		s += ",";//一刀切
		for (int i=0;i<s.length(); i++){
			char c = s.charAt(i);
			if(c==' ' || c==','){
				System.out.println(s2);
				s2 = "";
			}
			else 
				s2+= c;
		//String s = "abc ttt,kmd";
		*/
		}
	}
