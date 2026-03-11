class switch_statement1{
	public static void main(String[]args){
		int x=98;
		switch(x){
			case 'b':
				System.out.println("case1");
				break;
			case 1&2:
				System.out.println("case2");
				break;
			case 5%2:
				System.out.println("case3");
				break;
			default :
				System.out.println("no case");
				break;
		}
	}
}
