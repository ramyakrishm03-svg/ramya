import java.util.ArrayList;
import java.util.Scanner;

class Incident {
    int id;
    String type;

    Incident(int id, String type) {
        this.id = id;
        this.type = type;
    }
}

public class CyberSecurityIncidentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Incident> incidents = new ArrayList<>();

        while (true) {
            System.out.println("\n1.Insert");
            System.out.println("2.Update");
            System.out.println("3.Delete");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Incident ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Incident Type: ");
                    String type = sc.nextLine();
                    incidents.add(new Incident(id, type));
                    System.out.println("Incident Added!");
                    break;

                case 2:
                    System.out.print("Enter ID to Update: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    for (Incident i : incidents) {
                        if (i.id == id) {
                            System.out.print("Enter New Type: ");
                            i.type = sc.nextLine();
                            System.out.println("Updated Successfully!");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to Delete: ");
                    id = sc.nextInt();
                    incidents.removeIf(i -> i.id == id);
                    System.out.println("Deleted Successfully!");
                    break;

                case 4:
                    System.out.println("\nIncident Records:");
                    for (Incident i : incidents) {
                        System.out.println("ID: " + i.id + " | Type: " + i.type);
                    }
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}