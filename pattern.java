class pattern{
	public static void main(String[]args){
		for(int n=1;n<=5;n++){
			for(int m=5;m>=1;m--){
				if(m==n){
					System.out.print("  ");
				}else{
					System.out.print("*  ");
				}
			}
			System.out.println();
		}
	}
}
