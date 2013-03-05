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
	public static int[] randomArray(int length, int min, int max) {
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
	public static void print(int[] thingy) {
		System.out.print("[");
		for(int i = 0; i < thingy.length; i++) {
			System.out.print(thingy[i]);
			if(i!=thingy.length-1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}

	/**
	 * bubbleSort
	 */
	public static int[] bubbleSort(int[] rand) {
		int temp = 0;
		boolean switchcount = true;
		while(switchcount) {
			switchcount = false;
			for( int i = 0; i < rand.length-1; i++) {
				if(rand[i]>rand[i+1]) {
					switchcount = true;
					temp = rand[i];
					rand[i] = rand[i+1];
					rand[i+1] = temp;
				}
			}
		}
		return rand;
	}

	/**
	 * insertionSort
	 */
	public static int[] insertionSort(int[] rand) {
		for(int i = 0; i < rand.length; i++) {

		}
		return rand;
	}

	/**
	 * selectionSort
	 *
	 * 		sorts an Array
	 */
	public static int[] selectionSort(int[] rand) {
		int low = rand[0];
		int counter = 0;
		for(int i = 0; i < rand.length; i++) {
			low = rand[i];
			for(int j = i; j<rand.length; j++) {
				if(rand[j] < low) {
					low = rand[j];
					counter = j;
				}
			}
			rand[counter] = rand[i];
			rand[i] = low;
		}
		return rand;
	}

	/**
	 * main
	 *
	 * 		main method
	 */
	
	public static void main(String[] args) {
		int[] random = randomArray(10, 0, 10);
		print(random);
		int[] thingyToPrint = bubbleSort(random);
		//thingyToPrint = sortArray(thingy);
		
		System.out.println();
		print(thingyToPrint);
		System.out.println();
	}
}


