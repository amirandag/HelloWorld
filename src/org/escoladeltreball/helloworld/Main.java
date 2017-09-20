/**
 * 
 */
package org.escoladeltreball.helloworld;

/**
 * @author iaw46490689
 *
 */
public final class Main implements Utils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println("Hello World");
		//int[] values = {0,1,3,5,-2,5};
		//Main m = new Main();
		//System.out.println(m.findSmallest(values));
		//System.out.println(m.sum(values));
		//System.out.println(m.frequency(values,5));
		//System.out.println(m.frequencyPercentage(values, 5));
	}
	
	/*
	 * (non-Javadoc)
	 * This method returns the smallest value from an integer array.
	 * @see org.escoladeltreball.helloworld.Utils#findSmallest(int[])
	 */
	@Override
	public int findSmallest(int[] values) {
		int smallest = values[0];
		for (int i = 1; i < values.length; i++) {
			if (smallest > values[i]) {
				smallest = values[i];
			}
		}
		return smallest;
	}

	@Override
	public int sum(int[] values) {
		int sum = 0;
		for (int value:values) {
			sum = sum + value;
		}
		return sum;
	}

	@Override
	public int frequency(int[] values, int n) {
		int freq = 0;
		for (int value : values ) {
			if (n == value) {
				freq += 1;
			}
		}
		return freq;
	}

	@Override
	public double frequencyPercentage(int[] values, int n) {
		double freq = (double) frequency(values,n);
		return freq / values.length * 100.0;
	}
	
	
	
}
