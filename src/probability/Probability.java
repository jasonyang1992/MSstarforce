package probability;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Probability {

	private Random rand = new Random();
	private List<Integer> myBag = new ArrayList<Integer>();
	
	public void addProb(int success, int fail) {
	// Success rate	
		for(int i = 1; i < success; i++) {
			myBag.add(0);
		}
	// Fail rate	
		for(int i = 1; i < (fail); i++) {
			myBag.add(1);
		}
	}
	
	public void addProb(int success, int fail, int dest) {
	// Success rate	
		for(int i = 0; i < success; i++){
			myBag.add(0);
		}
	// Fail rate	
		for(int i = 0; i < fail; i++) {
			myBag.add(1);
		}
	// Destroy rate
		for(int i = 0; i < dest; i++) {
			myBag.add(2);
		}
		
	}
	
	public void clearBag() {
	// Empty Bag	
		myBag.clear();
	}
	
	public int checkBag() {
		return myBag.size();
	}
	
	public String getProb() {
		// Shuffle the list to create more random
		Collections.shuffle(myBag);
		
		int x = myBag.get(rand.nextInt(myBag.size()));
		
		if(x == 0) {
			return "Success";
		}
		else if(x == 1) {
			return "Fail";
		}
		else {
			return "Destroyed";
		}
	}
}
