package basic;

public class API {
	public static void main(String[] args){
		String s ="c:\\xyz\\bak\\x.ini";
//		for(int i=0; i<s.length(); i++){
//			char c = s.charAt(i);
			if(s.startsWith("c:")||s.startsWith("C:")||s.endsWith("ini")||s.endsWith("INI"))
				System.out.println("符合标准");
			else
				System.out.println("不符合");
		}
	}

