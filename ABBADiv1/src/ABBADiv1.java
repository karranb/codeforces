/**
 * 
 * @author karran
 * 
 *         Explanation to the problem will be here
 * 
 */

public class ABBADiv1 {

	public String canObtain(String initial, String target) {
		return _canObtain(initial, target) ? "Possible" : "Impossible";
	}

	private boolean _canObtain(String initial, String target) {
		if (initial.length() == target.length())
			return initial.equals(target);
		String testA = initial + "A";
		if (target.indexOf(testA)!=-1 || target.indexOf(new StringBuffer(testA).reverse().toString())!=-1)
			if (_canObtain(testA, target))
				return true;
		String testB = new StringBuffer(initial + "B").reverse().toString();
		if (target.indexOf(testB)!=-1 || target.indexOf(new StringBuffer(testB).reverse().toString())!=-1)
			return _canObtain(testB, target);
		return false;
	}

	public static void main(String[] args) {

	}

}
