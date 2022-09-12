import java.util.Scanner;

public class Roadway {

	public static void main(String[] args) {

	  Scanner scnr = new Scanner(System.in); 
	  int highwayNumber;
	  
	  System.out.println("Please enter highway number.");
	  
	  highwayNumber = scnr.nextInt();
	  
	  String highwayDirection;
	  String highwayType = "";
	  boolean incorrectInput = false;
	  	
	  
	  
	  //Determine Highway type
	  if(highwayNumber <= 99 && highwayNumber > 0){
		  	   
		  highwayType = "Primary";  
		  
	  }else if (highwayNumber <= 999 && highwayNumber > 0){
	     	
		  highwayType = "Auxiliary";
		  
	  }else{
	     	
	     incorrectInput = true;
	  }
	  
	  
	  
	  //Determine Highway direction
	  if(highwayNumber%2 == 0){
		  
	     highwayDirection = "east/west";
	     
	  }else{
	     		  
	     highwayDirection = "north/south";
	  }
	  
	  
	  
	 
	  if(incorrectInput) {
		  
		  System.out.println("Incorrect Input.");

	  }else {
		  
		  System.out.println("Highway " + highwayNumber + " is a " + highwayType + " highway and runs from " + highwayDirection);
	  }
	  
	  scnr.close();
		
	}
}
