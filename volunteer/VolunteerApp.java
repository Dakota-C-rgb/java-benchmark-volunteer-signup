package volunteer;

import java.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class VolunteerApp {

    final static String checkinsFilePath = "checkins.ser";

    public static void main(String[] args) {

        ArrayList<Volunteer> submissions = loadSubmissions();

        Volunteer sub = startPaper();

        submissions.add(sub);

        saveSubmissions(submissions);
    }

    private static void saveSubmissions(ArrayList<Volunteer> sub) {
        try {
            FileOutputStream fileStream = new FileOutputStream("orders.ser");
            ObjectOutputStream os = new ObjectOutputStream(fileStream);
            os.writeObject(sub);
            os.close();
        } catch (IOException ex) {
            System.out.println("Could not save :'( ");
    }
}

    public static Volunteer startPaper() {
        Scanner input = new Scanner(System.in);
        String start = "One does make a difference...\n"
        + "Your involvement matters because your service makes a difference. \n"
        + "1. Complete your contact information. \n"
        + "2. Select your areas of interest.";
        
        System.out.println(start);
        System.out.println("First Name: ");
        String firstName = input.nextLine();
        System.out.println("Last Name: ");
        String lastName = input.nextLine();
        System.out.println("Phone Number: ");
        String phoneNumber = input.nextLine();
        System.out.println("Email: ");
        String email = input.nextLine();
        System.out.println("Would you be interested in Worship (yes/no): ");
        String worshipChoice = input.nextLine();
        System.out.println("Would you be interested in welcoming members (yes/no): ");
        String welcomeChoice = input.nextLine();
        System.out.println("Are you interested in production (yes/no): ");
        String productionChoice = input.nextLine();
        System.out.println("Are you interested in Community Groups (yes/no): ");
        String commsChoice = input.nextLine();
        System.out.println("Are you interested in Children's Ministry (yes/no): ");
        String childrenChoice = input.nextLine();
        System.out.println("Are you interested in Student Ministry (yes/no): ");
        String studentChoice = input.nextLine();
        System.out.println("Would you like to recieve more information on other volunteer opportunities? (yes/no): ");
        String moreInfo = input.nextLine();
        if (moreInfo.equals("yes")) {
            System.out.println("You will recieve additional information via text and email.");
        }
        input.close();
        System.out.println("Have a blessed day, " + firstName + ".");
        return new Volunteer(firstName, lastName, phoneNumber, email, worshipChoice, welcomeChoice, productionChoice, 
            commsChoice, childrenChoice, studentChoice, moreInfo);
    }

    public static ArrayList<Volunteer> loadSubmissions() {
        try {
            FileInputStream fileStream = new FileInputStream("orders.ser");
            ObjectInputStream os = new ObjectInputStream(fileStream);
            ArrayList<Volunteer> submissions = (ArrayList<Volunteer>) os.readObject();
            os.close();
            return submissions;
        } catch (IOException | ClassNotFoundException ex) {
            return new ArrayList<Volunteer>();
        }
    }
}