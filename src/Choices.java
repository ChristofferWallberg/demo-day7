import java.util.Scanner;

public class Choices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vad vill du göra?");
        System.out.println("1. Gå hem");
        System.out.println("2. Stanna kvar i skolan");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Du går hem.");
        } else if (choice == 2) {
            System.out.println("Snyggt, du stanna kvar i skolan!");
        } else {
            System.out.println("Det är inte ett giltigt val.");
        }
    }
}
