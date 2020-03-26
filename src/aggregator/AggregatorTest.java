package aggregator;

public class AggregatorTest {
	
	public static void main(String[] args) {
		Aggregator testObj = new Aggregator(2);
		
		boolean passed = true;
		
		// test initial size
		if(testObj.getSize() != 0) {
			System.err.println("ERROR: failed initial size!");
			passed = false;
		}
		
		// test sum
		int first = 5;
		int second = 12;
		testObj.add(first);
		testObj.add(second);
		if(first+second != testObj.getSum()) {
			System.err.println("ERROR: failed sum test!");
			passed = false;
		}
		
		// test mean
		if((first+second)/2.0 != testObj.getMean()) {
			System.err.println("ERROR: failed mean test!");
			passed = false;
		}
		
		if(passed) {
			System.out.println("Passed all tests!");
		}
	}
}
