package basic;

interface Computer{
	void work(String s);
}
class People implements Computer{
	public void work(String s){
		System.out.println("父类实现了接口方法 work()！"+this.getClass().getName()+s);
	}
}
class Students extends People{}
class Teachers extends People{}

public class Demo {
	public static void main(String[] args){
		Students s = new Students();
		Teachers t = new Teachers();
		s.work("学");t.work("教");
		}
	}
