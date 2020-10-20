import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("how old is your dog?");
    //start of scanner with int
    int dogsAge = scan.nextInt();

    System.out.println("my dog is " + dogsAge);
 
    System.out.println("What color is yor dog?");
   //start of scanner with string
    String dogColor = scan.next();

    System.out.println("my dog's color is " + dogColor);

    System.out.println("do you want puppies?");
    System.out.println("true or false");
   //start of scanner with boolean
    boolean puppers = scan.nextBoolean();
   //start of if/else statements 
    if (puppers) {
      System.out.println("how many?");
      int puppies = scan.nextInt();
      if (puppies > 5){
        System.out.println("so manyyy");
      }

    }else {
     System.out.println("why not?");
    String noPuppies = scan.next();
    }
    int x = 5;
    while (x > 0)
    {
     x++;
     System.out.prinln( x + "did you feed the dog");

    }
    

  }
}