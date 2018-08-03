package com.base.java;

public class Singleton {

	private static Singleton sing_instance = null;
	public String str;

	private Singleton() {

		str = "name";

	}

	public static Singleton getInstance() {
		if (sing_instance == null)
			sing_instance = new Singleton();
		return sing_instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		
		x.str = (x.str).toUpperCase();
		
		System.out.println(x.str);
		System.out.println(y.str);

		System.out.println(z.str);
	}

}
