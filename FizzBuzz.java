package training;

public class FizzBuzz {
	public static void main(String[] args) {

		for(int i = 1; i <= 100; i++) {
			String ans = "";
			if(i%5==0) ans = ans + "Fizz";
			if(i%3==0) ans = ans + "Buzz";
			System.out.println(ans.equals("")? i : ans);
		}

		for(int i = 1; i <= 100; i++) {
			if(i%5==0 && i%3==0) {
				System.out.println("FizzBuzz");
			}else if(i%5==0) {
				System.out.println("Fizz");
			}else if(i%3==0) {
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
		}
	}
}
