package cases;
import java.io.InputStream;
import java.util.Scanner;// Import the Scanner class

public class ForBuckets {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);//Create a Scanner object
          try {
            //장바구니 3가지만 담게 선언
             String bucket_1= ""; //bucket_1 = ""
             String bucket_2 = ""; //bucket_2 =""
             String bucket_3 = ""; //bucket_3 ="" 
             String [] bucket = {"","",""}; //bucket = string

       
            for(int first =0;first< bucket.length;first = first +1 ){
             
               System.out.print((first+1)+"번째 담기:");
               bucket[first] = bucket //Read user input
            }   
            int a;
            int b;
            int c;
           
             System.out.println ("---담은 내용물---");
             System.out.println(bucket[0]+",");
             System.out.println(bucket[1]+",");
             System.out.println(bucket[2]+",");

        } catch (Exception e) {
            // TODO:handle exception
        } finally {

        }
        System.out.println();
        // reture 0;

    }
}
