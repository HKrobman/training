package training;

public class Count {
	public static void main(String[] args) {
		int[] ary = {1, 3, 4, 4, 5, 5, 5, 5, 9, 9, 9};
		int[] copy = new int[ary.length];
		for(int num : ary) {
			copy[num]++;
		}

		for(int i = 0; i < copy.length; i++) {
			if(copy[i] > 0) {
				System.out.println(i + ":count=" + copy[i]);
			}
		}
	}
}
