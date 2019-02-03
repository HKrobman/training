package training;

public class HairetsuCopy2 {
	public static void main(String[] args){
	//do whileを使った場合との違いを確認
		  int[] data = {54, 17, 27, 38, 45, -1, 12, 8};
		  int[] copy = new int[data.length];
		  int i = 0;
		  do{
		  	copy[i] = data[i];
		  }while(data[i++] != -1);

		  for(i = 0; i < copy.length; i++){
		  	System.out.println(copy[i]);
		  }

	}
}

