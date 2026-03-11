public abstract class AbstractDemo{
	public abstract void show();
}
//public class NonAbstractDemo extends AbstractDemo{
//	public void show(){
//		System.out.println("Show method");
//	}
//}
//public class Factory{
//	public static AbstractDemo getInstance(){
//		return new NonAbstractDemo();
//	}
//}
class MainClass{
	public static void main(String[]args){
		AbstractDemo ad=Factory.getInstance();
		ad.show();
	}
}
