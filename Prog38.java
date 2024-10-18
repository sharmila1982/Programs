import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Prog38 {
    public static void main(String[] args) {
        System.out.println("Enter file name:");
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();
        try (BufferedReader bf = new BufferedReader(new FileReader(filename))) {
            String line;
            while((line=bf.readLine())!=null)
            {
                System.out.print(line.toUpperCase());
              System.out.println();
            }
            bf.close();

        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    
}
}
