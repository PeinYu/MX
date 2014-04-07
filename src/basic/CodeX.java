package basic;
		
public class CodeX
{
	public static void main(String[] args)
	{		
		int n = 75383;  
		final int W = 10;
		final int H = 10;
		int[][] pw = new int[W][H];
		
		for(int i=0; i<W; i++)
		for(int j=0; j<H; j++)
		{
			pw[i][j] = (int)(Math.random() * 10);
		}
		
		String s = n + "";
		if(Math.random()>0.5)  
		{
			int begin_pos = (int)(Math.random() * (W-s.length()));  
			int row = (int)(Math.random() * H);  
			
			for(int i=0; i<s.length(); i++)
			{
				pw[row][i+begin_pos] = s.charAt(i) - '0';
			}
		}
		else 
		{
			int begin_pos = (int)(Math.random() * (H-s.length()));  
			int col = (int)(Math.random() * W);  
			
			for(int i=0; i<s.length(); i++)
			{
				pw[begin_pos+i][col] = s.charAt(i) - '0';
			}			
		}
		
		for(int i=0; i<W; i++)
		{
			for(int j=0; j<H; j++)
			{
				System.out.print(pw[i][j] + " ");
			}
			System.out.println();
		}		
	
	}
}
