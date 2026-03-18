package model.users;

public class GuestUser {
	//1.mainigie
	protected long id;
	
	private static long counter = 1;
	
	//2.getters
	public long getId() {
		return id;
	}
	
	//3.setters
	public void setId() {
		id = counter++;
	}
	
	//4.abi konstruktori
	public GuestUser() {
		setId();
	}
	//argumenta kosntruktors saja klase nav nepieciesams, jo nav dati no lietotaja puses
	
	//5. toString
	public String toString()
	{
		String result = "" + id;
		return result;
	}
	
	
	//6. parejas funkcijas (ja nepieciesams)
	//TODO papildinat velak
	
}
