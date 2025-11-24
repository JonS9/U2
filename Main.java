import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how big do you want your flower?");
        int h = scan.nextInt();
        scan.nextLine();
        System.out.println("where is your flower?");
        String w = scan.nextLine();

      ASCIIDEPOSITORY flower = new ASCIIDEPOSITORY("flower", true, h, w);
      flower.PrintModifiedFlower(h);
      flower.printLocation(w);
    }


}