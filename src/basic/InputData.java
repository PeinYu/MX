package basic;

//���󣺸��������ݵ��� Ҫ����������� ��������һ����ʽ��
class Factory{
	static Formater getConnection(){
		return new PerformData();
	}
}
class InputData {
	//��ķ���
	public void intpur(Formater s){  			
		s.formater(); //ʹ�÷���
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
		System.out.println("����PerformData����ĸ�ʽ");
	}
/*	public void main(String[] args){
	//System.out.println
}*/
}

interface Formater{void formater();}




