class FactoryDemo{
	public static FactoryDemo fd;
	public int age;
	static{
		fd=new FactoryDemo();
	}
	private FactoryDemo(){ age=20;}
	public void show(){
		System.out.println("show method");
	}
}
class FactoryTester1{
	public static void main(String[]args){
		FactoryDemo.fd.show();
		System.out.println(FactoryDemo.fd.age);
		FactoryDemo.fd.age=30;
		System.out.println(FactoryDemo.fd.age);
	}
}
