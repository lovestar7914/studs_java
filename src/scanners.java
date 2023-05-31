import java.util.Scanner;// Import the Scanner class

public class scanners{
  public static void main(String[] args)throws InterruptedException{
     Scanner myObj = new Scanner(System.in); //Create aScanner object
     boolean t = true;
     String letter = null;
     int couny =0;
     while (t){
      System.out.println("Enter Keyword");
       //Thread.sleep(2000);
      letter = myObj.nextLine(); //Read user input
      switch(letter){
        case"p":
        System.out.println("letter Q");
         break;
        default:
         System.out.println("letter Default  ");   
         break;
      
        } count++;
        System.out.println("count:"+ "count"); //Output user input
      }
  }
}    


