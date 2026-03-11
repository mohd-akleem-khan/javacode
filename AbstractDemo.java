abstract class AbstractDemo{
	public void display(){
		System.out.println("Display method");
	}
	public abstract void show();
	AbstractDemo(){
		System.out.println("Abstractdemo");
	}
}
class abstractDemo extends AbstractDemo{
	public void show(){
		System.out.println("Show method");
	}
	NonAbstractDemo(){
		System.out.println("Non Abstract")
}
class AbstractTester{
	public static void main(String[]args){
		AbstractDemo ad=new NonAbstractDemo();
		ad.display();
		ad.show();
	}
}
