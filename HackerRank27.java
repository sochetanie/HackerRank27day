import java.util.*;

public class Day27 {
	public static void main(String args[]){
		ArrayList<Integer> arr = new ArrayList<>();
		Random generator = new Random();
		int n = generator.nextInt(5)+1;
		  
		System.out.println(n);
	       
	    if(n<=5){
	        while(n-->0){	        		
	        	int counter = 0;
		        int no_of_students = generator.nextInt(200)+1;
		        int threshold = generator.nextInt(no_of_students)+1;
		        int attendance=0;
		        	
		        for(int i=0; i<no_of_students; i++){
		        	attendance = generator.nextInt(1000+1+1000)-1000;
		        	arr.add(attendance);
		        }

		        StringBuilder builder = new StringBuilder();
		        String str=null;
		        	
		        for(int i=0; i<no_of_students; i++){
		        	str = arr.get(i)+" ";		        		
		        	builder.append(str);
		        }
		        	
		        Scanner scan = new Scanner(builder.toString());
		        	 
		        while(scan.hasNextInt()){	        	
		        	int prob = scan.nextInt();
		        	if(prob<=0){
		        		counter+=1;
		        	}
		        }

		        System.out.println();

		        if(counter>=threshold)
		        	System.out.println("NO");
		        else
		        	System.out.println("YES");
		    }	        	
		}	        
	}
}
