package basic;

public class HorseX {
	public static void main(String[] args){
	
		for(int i=0;i<33;i++)
			for(int j=0;j<50;j++){
				for(int k=0; k<100; k++){
					if(30*i + 20*j + 5*k ==1000 && i + j + k == 100){
						System.out.println("���� = "+ i +"С�� = " + j + "��� = " + k );
						/*System.out.println("���� = "+ i);
						System.out.println("С�� = "+ j);
						System.out.println("��� = "+ k);*/
					}
				}
			}
		}
}
	