class OuterTester{
	public static void main(String[]args){
//		Outer ot=new Outer("akleem");
		Outer.Inner it=new Outer.Inner(20);
		it.printer();
	}
}
