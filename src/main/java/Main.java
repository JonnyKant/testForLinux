import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("new.txt");
        FileWriter fileWriter = new FileWriter(file);
        String s = new String("0 1 2 3 4 5");
        fileWriter.write(s);
        fileWriter.close();
        FileReader fileReader = new FileReader(file);
        System.out.println(file.length());
    }
}
