import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("how old is your dog?");
    int dogsAge = scan.nextInt();

    System.out.println("my dog is " + dogsAge);

    System.out.println("What color is yor dog?");
    String dogColor = scan.next();

    System.out.println("my dog's color is " + dogColor);

    System.out.println("do you want puppies?");
    String noPuppies = scan.next();
    System.out.println("true or false");
    boolean puppers = scan.nextBoolean();
    
    if (puppers) {
      System.out.println("how many?");
      int dogs = scan.nextInt();

    }else {
     System.out.println("why not?");
    }

    

  }
}