import java.util.ArrayList;
import java.util.Scanner;

public class Prog10 {
        public static ArrayList<Integer> findfact(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }
        System.out.println("factors are: "+factors);
        return factors;

    }
    public static ArrayList<Integer> findCommonFactors(ArrayList<ArrayList<Integer>> factorsList) {
        ArrayList<Integer> commonFactors = new ArrayList<>(factorsList.get(0));
                for (int i = 1; i < factorsList.size(); i++) {
            commonFactors.retainAll(factorsList.get(i));
        }
        return commonFactors;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to input: ");
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> factors= new ArrayList<>();
                for (int i = 0; i < n; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            int num = sc.nextInt();
            factors.add(findfact(num));
        }
        ArrayList<Integer> commonfacts = findCommonFactors(factors); 
        System.out.println("Common factors are : " + commonfacts);
    }
}
