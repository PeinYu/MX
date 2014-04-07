package basic;

public class ObX {
	public static void main(String[] args){
		
		for(int i = 1; i<999; i++){
			if(i/100==0 && (i%100)/10==0 && i%10==0) break;
			for(int j = 11;j<99; j++){
				if(j/10!=0 && j%10!=0 && j !=i/100 && j !=(i%100)/10 && j!= i%10) continue;
				for(int k = 1111;k<9999; k++){
					if( k !=j/100 && k !=j/10 && k!= j%10 && k !=i/100 && k !=i/10 && k!= i%10 && i * j - k == 0)
						System.out.println(i+"*"+j+"="+k);
				}
			}
		}		//k/1000!=0 && (k%1000)/100!=0 && ((k%1000)%100)/10!=0 && (((k%1000)%100)%10)/10!=0 &&
	}
}
		

//{o = i/100;p = i/10;q = i%10;}