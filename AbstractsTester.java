
abstract class AbstractDemo{
	public void display(){
		System.out.println("Display method");
	}
	public abstract void show();
}
class abstractDemo extends AbstractDemo{
	public void show(){
		System.out.println("Show method");
	}
}
class AbstractTester{
	public static void main(String[]args){
		AbstractDemo ad=new AbstractDemo();
		ad.display();
		ad.show();
	}
}
