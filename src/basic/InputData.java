package basic;

//需求：负责处理数据的类 要求输入的数据 必须满足一定格式。
class Factory{
	static Formater getConnection(){
		return new PerformData();
	}
}
class InputData {
	//类的方法
	public void intpur(Formater s){  			
		s.formater(); //使用方法
	}
	public static void main(String[] args){
		//Formater s = new PerformData();
		InputData i = new InputData();
		Formater s = Factory.getConnection();
			i.intpur(s);
	}
}
class PerformData implements Formater{
	public void formater(){
		System.out.println("这是PerformData定义的格式");
	}
/*	public void main(String[] args){
	//System.out.println
}*/
}

interface Formater{void formater();}




