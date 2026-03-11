class ThisDemo{
	private int x;
	ThisDemo(int a){
		x=a;
	}
	public void display(){
		System.out.println(this.x);
	}
}
class ThisTester{
	public static void main(String[]args){
		ThisDemo td=new ThisDemo(50);
		td.display();
	}
}
