import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Prog37 {
    public static void main(String[] args) {
        System.out.println("Enter 20 marks to enter into marks.txt:");
        int arr[]=new int[20];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<arr.length;i++)
        {
        arr[i]=sc.nextInt();
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/sharmila/Documents/marks.txt"))) {
            for (int i=0;i<arr.length;i++) {
                bw.write(String.valueOf(arr[i]));
                bw.newLine();
            }
            bw.close();
            System.out.println("Marks have been written to markss.txt successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
