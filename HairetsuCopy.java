package training;

public class HairetsuCopy {
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

	/*
	public class lesson20{
	  public static void main(String[] args) {
		  int[] data = {54, 17, 27, 38, 45, -1, 12, 8};
		  int[] copy = new int[data.length];
		  int i = 0;
		  while(data[i] != -1){
		  	copy[i] = data[i];
		  	i++;
		  }

		  for(int num : copy){
		  	System.out.println(num);
		  }
	  }
	}


	public class lesson20{
	  public static void main(String[] args) {
		  int[] data = {54, 17, 27, 38, 45, -1, 12, 8};
		  int[] copy = new int[data.length];
		  int i = 0;
		  while(data[i] != -1){
		  	copy[i] = data[i];
		  	i++;
		  }

		  for(i = 0; i < copy.length; i++){
		  	System.out.println(copy[i]);
		  }
	  }
	}
	*/

	//break文
	/*
	public class lesson20{
	  public static void main(String[] args) {
		  int[] data = {54, 17, 27, 38, 45, -1, 12, 8};
		  int[] copy = new int[data.length];
		  for(int i = 0; i < data.length; i++){
		  	if(data[i] == -1){
		  		break;
		  	}
		  	copy[i] = data[i];
		  }

		  for(int i = 0; i < copy.length; i++){
		  	System.out.println(copy[i]);
		  }
	  }
	}
	*/


	/*
	public class lesson20{
	  public static void main(String[] args) {
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


	/*
	配列から配列へのコピー
	以下の配列の要素をwhile文を用い-1が現れるまで別の配列へコピーする。
	int[] data = {54, 17, 22, 36, 61, -1, 10, 5}
	最後にコピーした配列の中身を全て表示する。

	コピー先の配列名は自由は自由に決めてよい。
	コピー先の配列が格納できる値の数はint[] data配列が格納できる値の数と同じにすること。
	コピー先の配列を初期化する際、要素数を直接数字で指定しないこと。

	キーワード
	length, while, for

	*/
