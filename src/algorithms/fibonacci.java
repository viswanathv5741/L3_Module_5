package algorithms;

import java.util.ArrayList;

public class fibonacci {
	private int fib;
	private int times;
	private ArrayList<Integer> fibs;
	
	public fibonacci(int nums) {
		fib = 1;
		times = nums;
		fibs = new ArrayList<Integer>();
		fibs.add(fib);
	}
	
	public ArrayList<Integer> generate(){
		for (int i=0; i<times; i++) {
			if (fibs.size() == 1) {
				fibs.add(1);
			}
			else {
				fibs.add(fibs.get(i-1) + fibs.get(i));
			}
		}
		return fibs;
	}
	
	public String toString() {
		return fibs.toString();
	}
}
