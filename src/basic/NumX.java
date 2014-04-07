package basic;

public class NumX {
	 public static void main(String[] args){
		 
		 System.out.println("  @@@@"); 		//2 4 2 
		 System.out.println("       @ ");	//0
		 System.out.println("       @");
		 System.out.println("  @@@@");
		 System.out.println("       @");
		 System.out.println("       @");
		 System.out.println("  @@@@");
		 
		  String s3 ="0,2,3,5,6";
		  String s6 ="0,1,4,6,5,3";

		  char[] q = {};
		  int j=0;
		  char c =' ';
//		  String m3 ="02356";
//		  String m6 ="013456";
//		  String p1 = "";
//		  String p2 = "";
		  
//		  char[] b = {}; 
//		  int k=0;
//		  for(int i=0; i<7; i++){
		  boolean b1= false;
		  boolean b2= false;
		  boolean b3= false;
		  boolean b4= false;
		  boolean b5= false;
		  boolean b6= false;
		  boolean b7= false;
	  
		  for(int i=0; i<s3.length(); i++){
			  char c = s3.charAt(i);
			  if(c==',' ||c==' '){
				  j += 1;
				  q[j] = c; 
				 }
			  else
				  //for(int j=0; j<7; j++){
				  //j += 1;
				  q[j] = c;
				  }
		  
		  for(int i=0; i<s6.length(); i++){
			  char d = s6.charAt(i);
			  for(j=0; j<7; j++){
				  if(d!=q[j]) 
					  b3 = true;
				  else 
					  ;
			  }
			  
			  if(d==',' ||d==' '){
				  j += 1;
				  q[j] = c; 
				 }
			  else
				  //for(int j=0; j<7; j++){
				  //j += 1;
				  q[j] = c;
				  }
		  }
	 }
	 
		 
