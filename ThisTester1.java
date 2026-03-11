class ThisDemo{
	int age;
	String name;
	String collage;
	ThisDemo(int x){
		age=x;
	}
	ThisDemo(int x, String y){
		this(x);
		name=y;
	}
	ThisDemo(int x, String y,String z){
		this(x,y);
		collage=z;
	}
}
class ThisTester1{
	public static void main(String[]args){
		ThisDemo td=new ThisDemo(20);
		ThisDemo td1=new ThisDemo(30,"Ajay");
		ThisDemo td2=new ThisDemo(40,"Vijay","BBD");
		System.out.println(td.age);
		System.out.println(td1.name);
		System.out.println(td2.collage);
	}
}
