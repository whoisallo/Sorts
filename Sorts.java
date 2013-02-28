/**
 * Sorts
 *
 * 		Quadratic Sorts
 */
class Sorts {

	/**
	 * randomArray
	 *
	 * 		returns a random Array with given length
	 *
	 * @param  length - length of the returned array
	 * @param  min - the min for the randomly selected numbers
	 * @param  max - the max for the randomly selected numbers
	 */
	public int[] randomArray(int length, int min, int max) {
		int[] answer = new int[length];
		for(int i = 0; i < length; i++) {
			answer[i] = min + (int)(Math.random() * ((max - min) + 1));
		}
		return answer;
	}

	/**
	 * print
	 *
	 * 		prints a given int[] surrounded by square brackets and separated by commas
	 *
	 * @param thingy - the array to print
	 */
	public void print(int[] thingy) {
		System.out.print("[");
		for(int i = 0; i < thingy.length; i++) {
			System.out.print(thingy[i]+", ");
		}
		System.out.print("]");
	}

	/**
	 * main
	 *
	 * 		main method
	 */
	
	public static void main(String[] args) {
		int[] thingyToPrint = randomArray(4, 2, 6);
		print(thingyToPrint);
	}
}


