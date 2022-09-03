package java_programming;

 class inheritance {
	
	       String name = "Bharath";
		float sal = 15000;
		
	}
	
	class adress extends  inheritance{
		
		String adr = "usilamaptti";
		int pin = 625532;
		
	
		
	public static void main(String[] args) {
		
		
		adress abc = new adress(); // to create... name an object name  
		
		System.out.println(abc.sal);
	
	}
	}
	


