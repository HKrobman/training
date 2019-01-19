package training;

import java.util.Scanner;

public class PositiveNegativeNum {
	public static void main(String[] args) {
		Scanner scanner = new java.util.Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();
/*						if-else	 三項演算子					*/
		if(num%2==0) {
			System.out.println((num >= 0)? "正の偶数" : "負の偶数");
		}else {
			System.out.println((num >= 0)? "正の奇数" : "負の奇数");
		}

/*						三項演算子only						*/
		System.out.println( (num%2==0)? (num >= 0)? "正の偶数" : "負の偶数" : (num >= 0)? "正の奇数" : "負の奇数");


/*						基本回答						*/
		if(num%2==0) {
			if(num >= 0) {
				System.out.println("正の偶数");
			}else {
				System.out.println("負の偶数");
			}
		}
		else {
			if(num >= 0) {
				System.out.println("正の奇数");
			}else {
				System.out.println("負の奇数");
			}
		}


	}
}
