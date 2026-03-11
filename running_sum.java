class running_sum{
	public static void main(String[]args){
		int[] arr={3,5,7,6,8,4,1};
		System.out.print("original array"+arr[]);
		for(int i=1;i<arr.len;i++){
			arr[i]=arr[i]+arr[i-1];
		}
		for(int i=0;i<arr.len;i++){
			System.out.print(arr[i]+"");
		}
		System.out.println();
	}
}
