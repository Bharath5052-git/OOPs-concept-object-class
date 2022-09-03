package java_programming;

//public class Polymorphism {

// runtime polymorphism example code 	
class dress {
	void make() {
		System.out.println("making thred ");
	}
}

class shape extends dress {
	void make() {
		System.out.println("shaping the thred ");
	}
}

class cloths extends dress {
	void make() {
		System.out.println("make thread into clothos");
	}
}

class design extends dress {
	void make() {
		System.out.println("desing a clothos");
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		dress a;
		a = new shape();
		a.make();
		a = new cloths();
		a.make();
		a = new design();
		a.make();
	}
}
