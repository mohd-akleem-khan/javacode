public class SearchingAlgos{
	public int search(int[]a,int data){
		int result=-1;
		for(int i=0;i<a.length;i++){
			if(a[i]==data){
				result=i;
				break;
			}
		}
		return result;
	}
}
class Factory{
	public  static SearchingAlgos getIntance(){
		return new NewSearchingAlgos();
	}
}
class SearchClass{
	public static void main(String[]args){
		int[] arr={2,5,7,10,15,25,70,80};
		SearchingAlgos sc=Factory.getIntence();
		int result=sc.search(arr,25);
		if(result==-1){
			System.out.print("not found");
		}else{
			System.out.println("found at:"+result);
		}
	}
}
