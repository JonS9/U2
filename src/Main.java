import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<String> flowerData = ASCIIDEPOSITORY.getFileData("src/flower");

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.println(flowerData.get(i));
            }
        }
        ArrayList<String> flowerDataBase = ASCIIDEPOSITORY.getFileData("src/flowerbase");

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.println(flowerData.get(i));
            }
        }


      ASCIIDEPOSITORY flower = new ASCIIDEPOSITORY("flower", true, 5, "Bedroom");
      flower.PrintBasicAscii();
    }


}