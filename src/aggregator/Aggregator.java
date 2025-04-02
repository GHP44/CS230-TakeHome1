package aggregator;

public class Aggregator {
	private int[] storage;
	private int current;
	
	public Aggregator(int size) {
		storage = new int[size];
		current = 0;
	}
	
	public void add(int value) {
		if(current==storage.length) {
			throw new ArrayIndexOutOfBoundsException("Too many values!");
		}
		else {
			storage[current] = value;
			current++;
		}
	}
	
	public int getSize() {
		return current;
	}
	
	public int getSum() {
		int sum = 0;
		for(int i : storage)
			sum += i;
		return sum;
	}
	
	public double getMean() {
		double sum = 0;
		for(int i : storage)
			sum += i;
		return sum / getSize();
	}
}
