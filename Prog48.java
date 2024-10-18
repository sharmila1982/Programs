import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Customer {
    private String name;
    private String mobileNo;
    public Customer(String name, String mobileNo) {
        this.name = name;
        this.mobileNo = mobileNo;
    }
    public String getName() {
        return name;
    }
    public String getMobileNo() {
        return mobileNo;
    }
    @Override
    public String toString() {
        return name + ": " + mobileNo;
    }
}

public class Prog48 {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        String regex = "^(.*?): (\\d{10})$";
        Pattern pattern = Pattern.compile(regex);
        try (BufferedReader reader = new BufferedReader(new FileReader("/home/sharmila/Documents/customers.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.matches()) {
                    String name = matcher.group(1).trim();
                    String mobileNo = matcher.group(2).trim();
                    customers.add(new Customer(name.toUpperCase(), mobileNo));
                } else {
                    System.out.println("Invalid entry: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(customers, Comparator.comparing(Customer::getName));
        System.out.println("Sorted Customer List:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}

