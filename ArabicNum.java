package training;

import java.util.Scanner;

public class ArabicNum {
	public static void main(String[] args) {
		int arabicNum = 0;
		String romanNum = "";
		System.out.println("1〜5までの数字を入力してください");
		Scanner scanner = new java.util.Scanner(System.in);
		arabicNum = scanner.nextInt();
		scanner.close();

		switch(arabicNum) {
		case 1:
			romanNum = "I";
			break;
		case 2:
			romanNum = "II";
			break;
		case 3:
			romanNum = "Ⅲ";
			break;
		case 4:
			romanNum = "Ⅳ";
			break;
		case 5:
			romanNum = "Ⅴ";
			break;
		default:
			romanNum = "unknown";
			break;
		}

		System.out.println(arabicNum + " -> " + romanNum);
	}
}
