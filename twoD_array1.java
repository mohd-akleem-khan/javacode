class twoD_array1{
	public static void main(String[]args){
		int[][] arr={{1,4,6,8},{1,3,5,7},{10,20,30,40},{11,22,33,44,}};
		int sum=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<=arr[i].length;j++){
				if((i+j)==arr.length-1){
					sum+=arr[i][j];
				}
			}
		}
		System.out.println(sum);
	}
}
