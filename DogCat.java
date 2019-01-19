package training;
import java.util.StringTokenizer;

public class DogCat {
 public static void main(String[] args) {
    int count = 0;
    String winner = "";
    String s = "dog_cat_cat_dog_cat_dog";
    StringTokenizer st = new StringTokenizer(s, "_");
    while(st.hasMoreTokens()){
      String t = st.nextToken();
      if(t.equals("cat")) count++;
      if(t.equals("dog")) count--;
    }
    winner = (count > 0) ? "cat" : "dog" ;
    System.out.println(winner);
  }
}

/*
    String animals = "dog_cat_cat_dog_cat";
    int count = 0;
    String[] animals = animals.split("_");
    for(String animal : animals){
      if(animal.equals("cat")){
        count++;
      }else{
        count--;
      }
    }

    if(count > 0){
      System.out.println("cat");
    }else{
      System.out.println("dog");
    }
  }
}


    String text = "dog_cat_cat_dog_cat";
    int count = 0;
    String winner = "";

    String[] animals = text.split("_");
    for(String animal : animals){
      count = animal.equals("cat")?  1 : -1;
    }

    winner = (count > 0)? "cat" : "dog";
    System.out.println(winner);
  }
}
*/
