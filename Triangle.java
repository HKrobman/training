package training;
public class Triangle {
	public static void main(String[] args) {
//4段の三角形
		int n = 4;
		for(int i = 0; i < n; i++) {
			circlePlot(i, n);
			System.out.println();
		}
	}

		static void circlePlot(int i, int n) {
			for(int j = 0; j < n; j++) {
				if(j > i) {
					System.out.print(" ");
				}else {
					System.out.print("●");
				}
			}
		}

/*
		int n = 4;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j > i) {
					System.out.print(" ");
				}else {
					System.out.print("●");
				}
			}
			System.out.println();
		}
	}
*/

}
