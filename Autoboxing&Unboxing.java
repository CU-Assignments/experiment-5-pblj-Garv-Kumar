import java.util.*;

public class AutoboxingSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        
        System.out.println("Enter numbers separated by space:");
        String[] input = scanner.nextLine().split(" ");
        for (String num : input) {
            numbers.add(Integer.parseInt(num));  // Autoboxing
        }

        int sum = 0;
        for (Integer num : numbers) {
            sum += num;  // Unboxing
        }
        
        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
