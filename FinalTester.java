public class FinalDemo{
	public final int x;
	FinalDemo(int a){
		x=a;
	}
	public final void display(){
		System.out.println("Display method");
	}
}
//class FinalChildDemo extends FinalDemo{
//	public void display(){
//		System.out.println("Display of child");
//	}
//}
class FinalTester{
	public static void main(String[]args){
		FinalDemo fd=new FinalDemo(10);
		System.out.println(fd.x);
//		fd.x=20;
		fd.display();
	}
}
