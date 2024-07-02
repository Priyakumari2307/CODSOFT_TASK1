import java.util.*;
public class numbergame  {
  public static void main(String[] args) {
    int rand = 1 + (int)(Math.random()*100);
    int k = 3;
    Scanner sc = new Scanner(System.in);
    boolean answer = false ;
    System.out.println("Hello !");
    System.out.println("In this game you can guess any number in between 1 to 100");
    System.out.println("you have 3 tries to guess the number");
    while (k>0) {
        System.out.println("enter your guess");
        int guess = sc.nextInt();
        if (guess == rand) {
            System.out.println("congratuation you guess the correct answer");
           answer = true;
            break;
        }else if (guess > rand) {
            System.out.println("your answer to large , only"+(k-1)+"  tires are left");
        }else {
            System.out.println("your answer to small , only "+(k-1)+" tires are left");
        }
        k--;
    }
    if(!answer){
        System.out.println("you can out of tries");
        System.out.println("the answer is "+ rand);
    }
  }
}