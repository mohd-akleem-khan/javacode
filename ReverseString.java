class ReverseString{
	public static void main(String[]args){
		String s="Lucknow";
		int i=0;
		int j=s.length-1;
		char temp;
		char[] ch=s.toCharArray();
		while(j>i){
				temp= char ch[i];
				char ch[i]=char ch[j];
				char ch[j]=temp;
			}
		}
	}
}
