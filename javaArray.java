import java.util.Scanner;

public class javaArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] ID = {"2022-001", "2022-002", "2022-003", "2020-004"};
        String[] course = {"BSIT", "BSCS", "BSIS", "BSEMC"};
        String[] name = {"James Cooper", "Princess Smith", "Dianna Ross", "James Butler"};
        String[] sports = {"Basketball", "Badminton", "Swimming", "Baseball"};
        String[] contact = {"0920864756", "09178765454", "09167657382", "09108877635"};
        
        System.out.print("Students Name: ");
           for (int i = 0; i < name.length; i++) {
              System.out.print(name[i]);
           if (i < name.length - 1) {
            System.out.print(", ");
        }
    }

    System.out.print("\nEnter Student Index: ");
    int index = sc.nextInt();
    sc.nextLine();
    if (index >= 0 && index <= 3) {
        System.out.print("\nIndex Number\t: " + index);
        System.out.print("\nStudent ID\t: " + ID[index]);
        System.out.print("\nName of Student\t: " + name[index]);
        System.out.print("\nCourse\t\t: " + course[index]);
        System.out.print("\nSports\t\t: " + sports[index]);
        System.out.print("\nContact No.\t: " + contact[index]);
    } else {
        System.out.println("Student not found!");
    }
    sc.close();
    System.out.println();
}
}