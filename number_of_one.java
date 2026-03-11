class number_of_one{
	public static void main(String[]args){
		int n=10;
		int count=0;
		while(n!=0){
			count++;
			n=n&(n-1);
		}
		System.out.print(count);
	}
}
