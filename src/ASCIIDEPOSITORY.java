import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ASCIIDEPOSITORY {
    private String type;
    private boolean Sleeping;
    private int howmany;
    private String where;

    public ASCIIDEPOSITORY (String t,boolean S, int h, String w){
        type = t;
        Sleeping = S;
        howmany = h;
        where = w;
    }

    public void PrintBasicAscii() {
       if (type.equals("flower")) {
           System.out.println("           _/)");
           System.out.println("        .-(_(=:");
           System.out.println("   (\\_  |   \\)");
           System.out.println("  :=)_)-|");
           System.out.println("   (/   |   ");
           System.out.println("        |   __   ");
           System.out.println("  ____  |  /  \\  ");
           System.out.println(" /    \\ | /    \\");
           System.out.println("/   ___\\|/___   \\");
           System.out.println("   [_________]");
           System.out.println("    \\       /");
           System.out.println("     \\     /");
           System.out.println("      _____   ");
           System.out.println("");
           System.out.println("");
       }
    }

    public static void PrintModifiedFlower() {

    }

    public static ArrayList<String> getFileData(String fileName) {
        ArrayList<String> fileData = new ArrayList<String>();
        try {
            File f = new File(fileName);
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String line = s.nextLine();
                if (!line.equals(""))
                    fileData.add(line);
            }
            return fileData;
        }
        catch (FileNotFoundException e) {
            return fileData;
        }
    }
}
