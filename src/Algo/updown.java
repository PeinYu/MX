package Algo;


/*class B implements IB{	
}

interface IB{
}

class A
{
	private IB x;
	
	public A(IB x){
		this.x = x;
	}
}
*/

interface IB
{
	void f();
	int g();
}

class B implements IB
{
	public void f(){}
	public int g(){return 100;}
}

class A implements IB
{
	private B prox = new B();
	
	public void f(){
		prox.f();
	}
	public int g(){
		return prox.g();
	}
}
public class updown {
	public static void main (String[] args){
		//new A(new B());
	}
}

