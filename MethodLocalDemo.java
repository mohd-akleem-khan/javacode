class MethodLocalDemo{
	int age=20;
	public void caller(){
		class LocalDemo{
			String name="Mohd Akleem khan";
			public void display(){
				System.out.print(name);
				System.out.println(age);
			}
		}
		LocalDemo ld=new LocalDemo();
		ld.display();
	}
}
