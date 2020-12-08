import java.util.Scanner;

public class Prob1 {
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  System.out.println("Please enter an integer: ");
  int num = scan.nextInt();

// if the num is 5 or higher and if the num was 76 and lower , it will print false. This is because any number between 5-76 is false and 5 and 76 are inclusive. That means if you type 5 or 76 it will still be false.

  if ( num >= 5 && num <= 76)
  System.out.println("false");

// if the num is below 5 or higher than 76 , it will print true
  else{
  System.out.println("True");
  } 




  }
  }