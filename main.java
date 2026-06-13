import java.util.Scanner;

public class main {
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

    public static void printMenu() {
        System.out.println("===== STUDENT INFORMATION SYSTEM ======");
        System.out.println("1. Add Student:             ");
        System.out.println("2. Add Teacher:             ");
        System.out.println("3. Add Grade to Student:    ");
        System.out.println("4. Display all Records:     ");
        System.out.println("5. Search Person by ID:     ");
        System.out.println("5. Remove Person by ID:     ");
        System.out.println("6. Exit:                    ");
        System.out.println("Enter Choice:               ");
    }

    //  for Student
    public static void addStudent() {
        System.out.println("Enter Student ID: ");
        String id = sc.nextLine().trim();
        System.out.println("Enter Name: ");
        String name = sc.nextLine().trim();
        int age = readInt("Enter Age: ");
        System.out.println("Enter Course: ");
        String course = sc.nextLine().trim();
        System.out.println("Enter Year Level (1-6): ");
        int yearLevel= sc.nextInt();

    }

    //  for Teacher 
    public static void  addTeacher() {
        System.out.println("Enter Teacher ID: ");
        String id = sc.nextLine().trim();
        System.out.println("Enter Name: ");
        String name = sc.nextLine().trim();
        int age = readInt("Enter Age: ");
        System.out.println("Enter Department: ");
        String department = sc.nextLine().trim();
        double salary = readDouble("Enter Salary: ");

    }
    
    //  for grade
    public static void addGradeToStudent() {
        System.out.println("Enter Student ID: ");
        String id = sc.nextLine().trim();
        Person p = system.findById(id);

    }
    


// Utilities
    public static int readInt(String prompt) {
        while (true) {
            System.out.println(prompt);
            String input = sc.nextLine().trim();

            try {
                return Integer.parseInt(input);
            }
            catch(NumberFormatException e) {
                System.out.println("Please Enter Valid Number");
            }
        }
    }

    public static double readDouble(String prompt) {
        while (true) {
            System.out.println(prompt);
            String input = sc.nextLine().trim();

            try {
                return Double.parseDouble(input);
            }
            catch(NumberFormatException e) {
                System.out.println("Please Enter Valid Number");
            }
        }
    }



}
