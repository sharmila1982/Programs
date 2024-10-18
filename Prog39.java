import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
public class Prog39 {
    public static void main(String[] args) {
        try (BufferedReader bf = new BufferedReader(new FileReader("/home/sharmila/Documents/names.txt"))) {
            Set<String> marks=new LinkedHashSet<>();
            String line;
            while ((line = bf.readLine()) != null) {
                marks.add(line.toLowerCase());
            }      
            System.out.println(marks);
        }
        catch (IOException e) {
            e.printStackTrace();
        } 
    }
}
