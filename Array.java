package integerarray;
//here we cretaed package as integerarray which that organizes a set of related classes and interfaces.
import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		//public : it can be called from anywhere.
		//static : doesn't belong to a specific object.
		//void : returns to no value.
		//main : is special because it will start the program.
		// TODO Auto-generated method stub
		int [] Array =   {84,12,04,78,10,96,76,71,67,97};   
		//here v created an array and initialized 10 e
	    int [] newArray =new  int [9];  
	    //here v have taken another array and declared an array size of 9
	    
	    for(int v=0;v<Array.length;v++)
	    	//taking 1 equal to zero,i less than array,i increment in for loop
	    {
	    	try{
	    		
	           newArray[v]=Array[v];
	           //initializing new array
	    }
	    	
	    
	    	catch (Exception e){
	    		//catch exception e
	    	
	    		System.out.println("ArrayIndexOutOfBoundsException");
	    		//system : is a class in java language pacakge.
	    		//out : static member of the system class.
	    		//println : to print what is output.
	    		
	    } }       
	    System.out.println(Arrays.toString(Array));
	    	//system : is a class in java language pacakge.
	  		//out : static member of the system class.
	  		//println : to print what is output.
	  		//exist array
	 
	    System.out.println(Arrays.toString(newArray));//copied array
	    	//system : is a class in java language pacakge.
	  		//out : static member of the system class.
	  		//println : to print what is output.
	  		
}

	}

