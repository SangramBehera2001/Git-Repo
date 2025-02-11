import java.util.Scanner;

public class NameSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking name input
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        
        // Splitting the name by space
        String[] parts = name.split(" ");

        // Printing each part in a new line
        for (String part : parts) {
            System.out.println(part);
        }
        
        scanner.close();
    }
}
