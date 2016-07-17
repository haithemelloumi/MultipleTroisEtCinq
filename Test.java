package com.comdev.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		displayMagicalNumber(0,50);
	}
	
	
	static void displayMagicalNumber(int pIMin, int pIMax) {
	    int i = pIMin;
	    
	    while (i < pIMax) {
	    	
	    	if (i % 3 == 0 && i % 5 == 0){
	    		System.out.println("le nombre actuel est "+i+", H S");
	    	}
	    	
	    	else if (i % 3 == 0){
	    		System.out.println("le nombre actuel est "+i+", H");
	    	}
	    	
	    	else if (i % 5 == 0){
	    		System.out.println("le nombre actuel est "+i+", S");
	    	}
	    	
            i++;
        }
	        
	   
	}


}
