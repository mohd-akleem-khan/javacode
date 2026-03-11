class swap_2Darray{
	public static void main(String[]args){
		int[][] arr={{2,7,15},{3,9,4},{5,10,6}};
		int  temp;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<i;j++){
				temp=arr[i][j];
				arr[i][j]=a[j][i];
				arr[j][i]=temp;
			}
		}
		System.out.print(arr[j][i]+"");
	}
}
