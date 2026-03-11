class Stringtest{
	public static void main(String[]args){
		String s1="Lucknow";
		String s2=new String("Lucknow");
		System.out.println(s1);
		System.out.println(s2);
		String s3="Lucknow";
		String s4=new String("Lucknow");
		System.out.print(s1==s3);
		System.out.print(s2==s4);
		System.out.print(s1==s2);
	}
}
