class FibonacciSeries{
	public int fib(int n){
		if(n==1||n==2)return 1;
		return fib(n-1)+fib(n-2);
	}
}
class Tester1{
	public static void main(String[]args){
		Fibonacci ft=new FibonacciSeries();
		int result 
