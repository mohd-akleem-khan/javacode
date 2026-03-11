class swap_array{
	public static void main(String[]args){
		int[] arr={2,5,3,7,8,9};
		int i=0;
		int j=arr.length-1;
		while(i<j){
			int a=arr[i];
			arr[i]=arr[j];
			arr[j]=a;
		}
		for(int n=0;n<arr.length;n++){
			System.out.print(arr[n]+"");
		}
		System.out.println();
	}
}
