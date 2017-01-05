/**
 * 
 * @author karran
 * 
 * Explanation to the problem will be here
 * 
 */

public class ABBADiv1 {

	/**
	 * 
	 * @param initial
	 * @param target
	 * @return
	 */
    public String canObtain(String initial, String target) {
    	return _canObtain(initial, target) ? "Possible" : "Impossible";
    }

	/**
	 * recursividade FTW!
	 * @param initial
	 * @param target
	 * @return
	 */
	private boolean _canObtain(String initial, String target) {
		
		int targetLenght = target.length();
		if (initial.length()==targetLenght)
			return initial.equals(target);
		String testA = initial+"A";
		if (_canObtain(testA, target))
			return true;
		String testB = new StringBuffer(initial + "B").reverse().toString();
		return _canObtain(testB, target);
	}


	public static void main(String[] args) {

	}

}
