
public class seventeen {

	public seventeen(int high){
		for(int i=0;i<high;i++) {
	         for(int j=0;j<high-i;j++) {
	             System.out.print(" ");
	         }
	        for(int k=0;k<=i;k++) {
	            System.out.print("* ");
	        }
	        System.out.println();  
	    }
	}
}
