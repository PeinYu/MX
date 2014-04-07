package basic;

public class Str {
	public static void main(String[] args){
		String s1 = "零一二三四五六七八九";
		String s2 = "0123456789";
		
		String src = "一零四六";
		String dst = "";
		for(int i=0; i<src.length(); i++){
			dst += s2.charAt(s1.indexOf(src.charAt(i)));
		} 
		System.out.println(dst);
	}
}
