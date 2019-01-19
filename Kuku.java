package training;

public class Kuku {
	/*
	public class Kuku{
	    public static void main(String[] args){
	        System.out.println("| 1 2 3 4 5 6 7 8 9 ");
	        System.out.println("--+-----------------");
	        for(int i = 1; i < 10; i++){
	            System.out.print(i + "|");
	            for(int j = 1; j < 10; j++){
	                System.out.print(i*j);
	            }
	            System.out.println("");
	        }
	    }
	}

	System.out.print((j*q>9)? (""+ i*j) : (i*j) );
	                

	*/


	/*  三項演算子ver
	public class Kuku{
	    public static void main(String[] args){
	        System.out.println(" |  1  2  3  4  5  6  7  8  9  ");
	        System.out.println("-+-----------------------------");
	        for(int i = 1; i < 10; i++){
	            System.out.print(i + "|");
	            for(int j = 1; j < 10; j++){
	                System.out.print((i*j)>9? " "+(i*j) : "  "+(i*j));
	            }
	            System.out.println("");
	        }
	    }
	}

	*/
	/* if else ver
	public class Kuku{
	    public static void main(String[] args){
	        System.out.println(" |  1  2  3  4  5  6  7  8  9  ");
	        System.out.println("-+-----------------------------");
	        for(int i = 1; i < 10; i++){
	            System.out.print(i + "|");
	            for(int j = 1; j < 10; j++){
	                if(i*j>9){
	                    System.out.print(" " + (i*j));
	                }else{
	                    System.out.print("  " + (i*j));
	                }
	            }
	            System.out.println("");
	        }
	    }
	}

	*/

	/* 拡張for文
	public class Kuku{
	    public static void main(String[] args){
	        System.out.println(" |  1  2  3  4  5  6  7  8  9  ");
	        System.out.println("-+-----------------------------");
	        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	        for(int num1 : numbers){
	            System.out.print(num1 + "|");
	            for(int num2 : numbers){
	                if(num1*num2>9){
	                  System.out.print(" " + num1*num2);
	                }else{
	                  System.out.print("  " + num1*num2);
	                }
	            }
	            System.out.println("");
	        }
	    }
	}
	*/
	    public static void main(String[] args){
	        System.out.println(" |  1  2  3  4  5  6  7  8  9  ");
	        System.out.println("-+-----------------------------");
	        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	        for(int num1 : numbers){
	            System.out.print(num1 + "|");
	            for(int num2 : numbers){
	                System.out.print((num1*num2)>9? " "+(num1*num2) : "  "+(num1*num2));
	            }
	            System.out.println("");
	        }
	    }
	}
