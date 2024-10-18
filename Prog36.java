import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Prog36 {
    public static void main(String[] args) {
        try (BufferedReader bf = new BufferedReader(new FileReader("/home/sharmila/Documents/marks.txt"))) {
            StringBuilder marks=new StringBuilder();
            String line;

            System.out.println("Reading marks from marks.txt file :");
            while ((line = bf.readLine()) != null) {
                marks.append(line);
            }
                String []str=marks.toString().split(",");
                for(int i=0;i<str.length;i++)
                {
                System.out.println(str[i]);
                }
                int len = str.length;
                int[] arr = new int[len];
                int tot = 0;
                for (int i = 0; i < str.length; i++) {
                    arr[i] = Integer.parseInt(str[i]);
                    tot += arr[i]; 
                }
                System.out.println("The total marks are:"+tot);
            
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

}
