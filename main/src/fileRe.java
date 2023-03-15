import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileRe {
    public static void main(String[] args) {
        //File file = new File("readMe.txt");

        //System.out.println(file.getAbsolutePath());


        try {
            FileWriter fileWriter = new FileWriter("WriteMe.txt");
            fileWriter.write("Roses are red");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
