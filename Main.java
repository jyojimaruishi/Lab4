/*
Lab 4
Jyoji Maruishi
9/15/2021
*/

import java.util.* ;
class Main {
  public static void main(String[] args) {
    Random r = new Random();

    int randomNum = r.nextInt(50) + 1;
    System.out.println("The Random number is: " + randomNum);

    int num = randomNum;
    int goal = 0;
      while (num > 0) {
        num --;
        System.out.println(num);
      }

    if (randomNum <= 5) {
      System.out.println("Ahoy mateys!");
    }

    else if (25 < randomNum && randomNum < 42) {
      System.out.println("Cannonball!");
    }

    else {
      System.out.println("Blast off!");
    }
  }
}