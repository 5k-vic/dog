import java.util.Scanner;

class Main {
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  

  System.out.println("how old is your dog?");
  int dogsAge = scan.nextInt();

  System.out.println("my dog is " + dogsAge);

  System.out.println("What color is yor dog?");
  String dogColor = scan.next();

  System.out.println("my dog's color is " + dogColor);

  }
}