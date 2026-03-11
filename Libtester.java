class Libtester{
	public static void main(String[]args){
		LibClass ls=new LibClass();
		ls.caller(()->{System.out.println("Hello");});
	}
}
