package nthplusone;

import java.util.*;

public class PTriangle {

	/**
	 *  Method that returns the nth plus 1 row of Pascal's Triangle and 
	 *  edits the in put in place
	 *  
	 * @param nrow The input row value
	 * @return The nth plus one row edited input row value
	 */
	
	public static ArrayList<Integer> inPlaceNthRow (ArrayList<Integer> nrow){
		
		int current; // The current value
		int previous = 0; // The previous value
		
		for (int i = 0; i < nrow.size(); i++){
			current = nrow.get(i);
			nrow.set(i, previous + current);
			previous = current;
		}
		
		nrow.add(1);
		
		return nrow;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> nrow = new ArrayList<Integer>(Arrays.asList(1, 3, 3, 1));
		System.out.println(nrow);
		System.out.println(inPlaceNthRow(nrow));	
	}

}
