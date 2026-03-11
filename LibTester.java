class LibTester{
	public static void main(String[]args){
		LibClass ls=new LibClass();
//		MyInterface mi=(()->{System.out.println("Hello");});
		MyInterface mi=(x,y)->x+y;
//		ls.caller(mi);
		ls.caller(mi,10,20);
	}
}
