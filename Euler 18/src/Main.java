import java.util.*;

public class Main {
	public static void main(String []args) {
		int a [][] = {{1},
				     {3,2}};
		// ignore the first and last row while looping
	   for (int i = a.length-2; i >= 0; i--){
	        for (int j = 0; j < a[i].length; j++){
	        	// sum max numbers at each respective spot
	            a[i][j] += Math.max(a[i+1][j],a[i+1][j+1]);
	            System.out.println(a[i][j]);
	       }
	   }
	}
}
