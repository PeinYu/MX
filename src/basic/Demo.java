package basic;

interface Computer{
	void work(String s);
}
class People implements Computer{
	public void work(String s){
		System.out.println("����ʵ���˽ӿڷ��� work()��"+this.getClass().getName()+s);
	}
}
class Students extends People{}
class Teachers extends People{}

public class Demo {
	public static void main(String[] args){
		Students s = new Students();
		Teachers t = new Teachers();
		s.work("ѧ");t.work("��");
		}
	}
