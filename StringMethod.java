class StringMethod{
	public static void main(String[]args){
		String s1="Lucknow";
		System.out.println(s1.length());
		int len=s1.length();
		String s2=s1.concat("Junction");
		System.out.println(s2);
		String s3=s2.toLowerCase();
		System.out.println(s3);
		String s4=s2.toUpperCase();
		System.out.println(s4);
		String si=" Lucknow Junction ";
		String s7="Lucknow Junction";
		String s8="Lucknow junction";
		System.out.println(si.equals(si));
		System.out.println(si.equals(s7));
		System.out.println(si.equalsIgnoreCase(s2));
		String s9=si.trim();
		System.out.println(si.length());
		System.out.println(s9.length());
		System.out.println(s1.charAt(1));
		System.out.println(s1.indexOf('n'));
		String st="Lucknow Junction";
		System.out.println(s1.lastIndexOf('n'));
		char[] ch=s1.toCharArray();
		System.out.println(ch.length);
		String s10=new String(ch);
		System.out.println(s10);
		String s11=s1.substring(0,4);
		System.out.println(s11);
		String s12=s1.substring(4,7);
		System.out.println(s12);
		String s13=s1.substring(2);
		System.out.println(s13);
		String s14="Lucknow-Junction-Banaras";
		String[] sa=s14.split("-");
		for(int i=0;i<sa.length;i++){
			System.out.print(sa[i]);
		}
	}
} 
