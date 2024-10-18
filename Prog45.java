import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.*;
import java.io.IOException;

public class Prog45 {
    public static void main(String[] args) {
        try {

            Path src = Paths.get("/home/sharmila/Documents/file.txt");
            BufferedReader reader = Files.newBufferedReader(src);
            Path trg = Paths.get("tempfile.txt");
            BufferedWriter writer = Files.newBufferedWriter(trg, StandardOpenOption.CREATE);
            String line;
            while ((line = reader.readLine()) != null) {
                String modifiedLine = line.replaceAll("\\s+", " ");
                writer.write(modifiedLine);
                writer.newLine();
            }

            writer.close();
            reader.close();
            Files.move(trg, src, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File processed successfully. Multiple spaces replaced with a single space.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
