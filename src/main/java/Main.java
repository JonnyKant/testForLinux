import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("new.txt");
        FileWriter fileWriter = new FileWriter(file);
        String s = new String("0 1 2 3 4 5" + System.lineSeparator());
        fileWriter.write(s);
        fileWriter.close();
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] d = fileInputStream.readAllBytes();
        for(byte a : d) {
            System.out.printf("%02x",a);
            System.out.println("");
            System.out.println(a);
        }
    }
}
