class Parent{
	public void show(){
		System.out.println("Show of Parent");
	}
	private void display(){
		System.out.println("Display of Parent");
	}
	Parent(int x){
		System.out.println("Constructor of parent");
	}
}
class Child{
	void printer(){
		System.out.println("Printer of child");
	}
	Child(){
		super(5);
		System.out.println("Constructor of child");
	}
}
class Inheritance{
	public static void main(String[]args){
		Parent p=new Parent();
//		p.show();
//		p.display();
		Child ch=new Child();
		ch.show();
//		ch.display();
		ch.printer();
	}
}
