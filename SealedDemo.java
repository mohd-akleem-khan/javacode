public sealed class SealedDemo permits Sealed1{
	public void printer(){
		System.out.print("printer method");
	}
}
