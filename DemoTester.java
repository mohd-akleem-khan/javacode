class DemoTester{
	int age;
	private DemoTester(){
		age=20;
	}
	public void display(){
		System.out.println("Display method");
	}
	public static void DemoTester getInstance(){
		return new DemoTester();
	}
}
