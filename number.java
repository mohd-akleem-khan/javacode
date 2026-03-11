class Number{
	public static void main(String[]args){
		int num=16;
		if((num&(num-1))==0){
			System.out.print("power number");
		}else{
			System.out.print("not a power number");
		}
	}
}
