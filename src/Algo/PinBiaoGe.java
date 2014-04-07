package Algo;

class MyCell
{
	private char leftUp = '┌';
	private char up = '┬';
	private char rightUp = '┐';
	private char left = '├';
	private char center = '┼';
	private char right = '┤';
	private char leftDown = '└';
	private char down = '┴';
	private char rightDown = '┘';
	private char ver = '│';
	private char hor = '─';
	
	private int row = 2;  // 行数
	private int col = 2;  // 列数
	
	public void setRow(int x)
	{
		if(row>=1 && row <=20) row = x;
	}
	
	public void setCol(int x)
	{
		if(col>=1 && col <=10) col = x;
	}
	
	public void show()
	{
		printBeginRow();  //首行特殊
		for(int i=0; i<row-1; i++)
		{
			printRow1();  // 空格+竖线
			printRow2();  // 横线+转角
		}
		printRow1();
		printEndRow();  // 末行特殊
	}
	
	private void printBeginRow()
	{
		System.out.print(leftUp);
		for(int i=0; i<col-1; i++)
		{
			System.out.print(hor);
			System.out.print(up);
		}
		System.out.print(hor);
		System.out.print(rightUp);
		System.out.println();
	}
	
	private void printEndRow()
	{
		System.out.print(leftDown);
		for(int i=0; i<col-1; i++)
		{
			System.out.print(hor);
			System.out.print(down);
		}
		System.out.print(hor);
		System.out.print(rightDown);
		System.out.println();
	}
	
	private void printRow1()
	{
		System.out.print(ver);
		for(int i=0; i<col; i++)
		{
			System.out.print("  ");
			System.out.print(ver);
		}
		System.out.println();
	}
	
	private void printRow2()
	{
		System.out.print(left);
		for(int i=0; i<col-1; i++)
		{
			System.out.print(hor);
			System.out.print(center);
		}
		System.out.print(hor);
		System.out.print(right);
		System.out.println();
	}
	
	
}	
	
public class PinBiaoGe
{
	public static void main(String[] args)
	{
		// 在字符界面用特殊符号拼图形
		/*		
		┌─┬─┐
		│  │  │
		├─┼─┤
		│  │  │
		└─┴─┘		
		*/
		
		MyCell a = new MyCell();
		a.setRow(1);
		a.setCol(1);		
		a.show();
		
		a.setRow(1);
		a.setCol(4);		
		a.show();
		
		a.setRow(4);
		a.setCol(1);		
		a.show();
		
		a.setRow(5);
		a.setCol(5);		
		a.show();
		
		a.setRow(10);
		a.setCol(18);		
		a.show();
		
		
		// 如何设置行距离和列距离
		
	
	}
} 

