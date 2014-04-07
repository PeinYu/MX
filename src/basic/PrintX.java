package basic;

public class PrintX {
	public static void main(String[] args){
	
		for(int k=0; k<5; k++){
			for(int i=0; i<k+1; i++) System.out.print(" ");
			System.out.print("$$");
			for(int i=0; i<2*(5-k-1); i++) System.out.print(" ");
			System.out.println("$$");
		}
		
		for(int i=0; i<6; i++)System.out.print(" ");
			System.out.println("$$");
			
		for(int k=0; k<5; k++){
			for(int i=0; i<5-k; i++)System.out.print(" ");
			System.out.print("$$");
			for(int i=0 ;i<2*k; i++)System.out.print(" ");
			System.out.println("$$");
		}
	}
}

//     $$      $$ 1 2 4 2 0	
//	    $$    $$  2 2 3 2 1
//		 $$  $$   3 2 2 2 2
//		  $$$$    4 2 1 2 3
//		   $$   
//	      $$$$  
//	  	 $$  $$
//$$	    $$
// $$	   $$
//$$	  $$

/*
for(int i=0; i<?; i++) System.out.println(" ");
for(int i=0; i<?; i++) System.out.println("$$");*/

/*for(int i=0; i<9-k; i++) System.out.print(" ");
for(int i=0; i<k+1; i++) System.out.print("$$");*/