class FactorialTest{
	public int fact(int n){
		if(n==0||n==1)return 1;
		return n*fact(n-1);
	}
	class Tester{
		public static void main(String[]args){
			FactorialTest ft=FactorialTest();
			int result=ft.fact(5);
			System.out.print(result);
		}
	}
}
