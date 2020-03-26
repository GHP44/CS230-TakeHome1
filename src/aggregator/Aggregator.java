package aggregator;

/**
 * I think this class adds things up sometimes.
 * 
 * @author Alice and Bob
 */
public class Aggregator {
	private int[] storage;
	private int current;
	
	/**
	 * Build a thing.
	 * 
	 * @param size the initial size of the thing
	 */
	public Aggregator(int size) {
		storage = new int[size];
		current = 0;
	}
	
	/**
	 * Probably add something.  I'm not sure.
	 * 
	 * @param value the value to add, I guess
	 */
	public void add(int value) {
		if(current==storage.length) {
			throw new ArrayIndexOutOfBoundsException("Too many values!");
		}
		else {
			storage[current] = value;
			current++;
		}
	}
	
	/**
	 * Get the size.
	 * 
	 * @return the size of this aggregator thing
	 */
	public int getSize() {
		return current;
	}
	
	/**
	 * Get the sum of the stuff in here.
	 * 
	 * @return all the things added up
	 */
	public int getSum() {
		int sum = 0;
		for(int i : storage)
			sum += i;
		return sum;
	}
	
	/**
	 * Get the average of all the stuff in here.
	 * 
	 * @return the things averaged together
	 */
	public double getMean() {
		double sum = 0;
		for(int i : storage)
			sum += i;
		return sum / getSize();
	}
}
