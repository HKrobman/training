package training;

public class HairetsuSum {
	public static void main(String[] args){
		int[] data = {54, 17, 27, 38, 45, -1, 12, 8};
		int sum = 0;
		for(int i = 0; i < data.length; i++){
			if(data[i] == -1){
				continue;
			}
			sum += data[i];
		}
		System.out.println("sum = " + sum);
	}
}
