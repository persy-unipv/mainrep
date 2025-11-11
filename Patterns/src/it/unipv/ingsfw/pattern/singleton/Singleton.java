package it.unipv.ingsfw.pattern.singleton;

public class Singleton {

	private static Singleton instance = null;

	// Hide the contructor
	private Singleton() {
		super();
		// ...
	}

	// Allow construction only once
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
			System.out.println("Create new instance");
		}
		else
			System.out.println("Instance already available");
		return instance;
	}

	public static void main(String[] args) {
		
		
		Singleton s=Singleton.getInstance();
		
		System.out.println("do something...");
		
		Singleton s1=Singleton.getInstance();
		
		System.out.println(s+"\n"+s1);

	}

}
