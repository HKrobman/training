package training;
import java.util.Scanner;

public class Piramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n段のピラミッドを表示します");
		System.out.print("段数は：");
		int count = sc.nextInt();
		sc.close();

		for (int i = 1; i <= count; i++) {//段
			for (int j = 1; j < count + i ; j++) {//行
				if (j <= count - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}
	int a = Integer.parseInt("2");
}
