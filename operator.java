class Operator{
	public static void main(String[]args){
		int x=10,y=20,z=30;
		boolean b=(++x<++y)||(++y<++z);
		System.out.print(x);
		System.out.print(y);
		System.out.print(z);
		System.out.print(b);
	}
}
