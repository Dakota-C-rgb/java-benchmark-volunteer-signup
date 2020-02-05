package volunteer;

import java.io.Serializable;

public class Volunteer implements Serializable {
    String firstName;
    String lastName;
    String phoneNumber;
    String email;
    String worshipChoice;
    String WelcomeChoice;
    String productionChoice;
    String commsChoice;
    String childrenChoice;
    String studentChoice;
    String moreInfo;

    public Volunteer(String firstName, String lastName, String phoneNumber, String email,  String worshipChoice, String WelcomeChoice, String productionChoice, String commsChoice, String childrenChoice, String studentChoice, String moreInfo){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.worshipChoice = worshipChoice;
        this.WelcomeChoice = WelcomeChoice;
        this.productionChoice = productionChoice;
        this.commsChoice = commsChoice;
        this.childrenChoice = childrenChoice;
        this.studentChoice = studentChoice;
        this.moreInfo = moreInfo;
    }
}