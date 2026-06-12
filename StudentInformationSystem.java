import java.util.Scanner;

public class StudentInformationSystem {
    private static  Scanner sc = new Scanner(System.in);
    private static  SchoolSystem system = new SchoolSystem();
    
    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            printMenu();
            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1":
                    addStudent();
                    break;
                case "2":
                    addStudent();
                    break;
                case "3":
                    addStudent();
                    break;
                case "4":
                    addStudent();
                    break;
                case "5":
                    addStudent();
                    break;
                case "6":
                    addStudent();
                    break;
                case "0":
                    running = false;
                    System.out.println("Exiting student information system");
                    break;
            
                default:
                    break;
            }
        }
    }
}
