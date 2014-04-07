package Algo;

	
class Cell
{
	private int x;
	private int y;
	private int width;
	private int height;
	
	public Cell(int x, int y,int width, int height)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public void draw(char[][]  a)
	{
		for(int i=0; i<width;i++){
			a[y][x+i]  = '$';
			a[y+height-1][x+i]  = '$';
		}
		
		for(int i=0;i<height; i++){
			a[i+y][x] = '$';
			a[i+y][x+width-1] = '$';
		}
	}
}

public class Cellx
{
	static void print(char[][] a)
	{
		for(int i=0; i<a.length;i++){
			for(int )
		}
	}
}