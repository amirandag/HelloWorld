/**
 * 
 */
package org.escoladeltreball.helloworld;

/**
 * @author iaw46490689
 *
 */
public interface Utils {
	
	/*
	 * This method returns the smallest value in an integer array.
	 */
	public abstract int findSmallest(int[] values);
	
	/*
	 * This method sums the values in an integer array.
	 */
	public abstract int sum(int[] values);
	
	/*
	 * This returns the frequency of n in values. 
	 */
	public abstract int frequency(int[] values, int n);
	
	/*
	 * This returns the frequency in percentage of n in values. 
	 */
	public abstract double frequencyPercentage(int[] values, int n);
	
	
}
