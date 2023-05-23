package gr.aueb.cf.ch10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

/**
 * A contacts app that can:
 * CRUD
 * Print a menu of options and let the user pick their choice
 *
 * @author Ntirintis John
 */
public class MobileContactsApp {


    final static Scanner in = new Scanner(System.in);
    // 2d contacts array
    // 500 rows of contacts and 3 columns
    // the columns are: FirstName, LastName and PhoneNumber
    // rows are records of data
    final static String[][] contacts = new String[500][3];
    static int pivot = -1;
    final static Path PATH = Paths.get("C:\\tmp\\log-mobile.txt");

    public static void main(String[] args) {

        boolean quit = false;
        String s;
        int choice;
        String phoneNumber;

        do {
            printMenu();
            s = getChoice();
            if( s.matches("[qQ]")) quit = true;
            else{
                try{
                    choice = Integer.parseInt(s);
                    if(!isValid(choice)){
                        throw new IllegalArgumentException("Error - choice must be between 1 - 5");
                    }

                    switch (choice){
                        case 1:
                            printContactMenu();
                            insertController(getFirstName(), getLastName(), getPhoneNumber());
                            System.out.println("Successful Insertion");
                            break;
                        case 2:
                            phoneNumber = getPhoneNumber();
                            insertController(getFirstName(), getLastName(), getPhoneNumber());
                            deleteController(phoneNumber);
                            System.out.println("Successful Deletion");
                            break;
                        case 3:
                            phoneNumber = getPhoneNumber();
                            printContactMenu();
                            updateController(phoneNumber, getFirstName(), getLastName(), getPhoneNumber());
                            System.out.println("Successful Update");
                            break;
                        case 4:
                            phoneNumber = getPhoneNumber();
                            String[] contact = getOneController(phoneNumber);
                            System.out.println("Contact Found:");
                            printContact(contact);
                            break;
                        case 5:
                            String[][] allContacts = getAllContactsController();
                            printAllContacts(allContacts);
                            System.out.println("Printing");
                            break;
                    }
                } catch (IllegalArgumentException e) {

                }
            }
        } while(!quit);

    }

    public static void printContact(String[] contact){
        for (String s : contact) {
            System.out.println(s + " ");
        }
    }

    public static void printAllContacts(String[][] contacts){
        for (String[] contact : contacts) {
            //System.out.printf("%s\t%s\t%s\n", contact[0], contact[1], contact[2]);;
            printContact(contact);
        }
    }

    public static boolean isValid(int choice){
        return (choice >= 1 && choice <= 5);
    }

    public static void printMenu(){
        System.out.println("Choose one of the following:");
        System.out.println("1. Insert a Contact");
        System.out.println("2. Delete a Contact");
        System.out.println("3. Update a Contact");
        System.out.println("4. Search for a Contact");
        System.out.println("5. Print all the Contacts");
        System.out.println("Q/q. Exit");
    }


    public static String getChoice(){
        System.out.println("Enter your choice");
        return in.nextLine();
    }

    public static void printContactMenu(){
        System.out.println("Enter first name, last name and phone number");
    }
    // Can improve that later on?
    public static String getFirstName(){
        System.out.println("Enter first name");
        return in.nextLine();
    }

    public static String getLastName(){
        System.out.println("Enter last name");
        return in.nextLine();
    }

    public static String getPhoneNumber(){
        System.out.println("Enter phone number");
        return in.nextLine();
    }

    // Controllers

    public static void insertController(String firstName, String lastName, String phoneNumber){
        try {
            if(firstName == null || lastName == null || phoneNumber == null){
                throw new IllegalArgumentException("Nulls are not allowed");
            }

            if(firstName.length() < 2 || firstName.length() > 50){
                throw new IllegalArgumentException("FirstName is not valid");
            }
            if(lastName.length() < 2 || lastName.length() > 50){
                throw new IllegalArgumentException("Last Name is not valid");
            }
            if(phoneNumber.length() < 2 || phoneNumber.length() > 50){
                throw new IllegalArgumentException("Phone Number is not valid");
            }

            insertContactService(firstName.trim(), lastName.trim(), phoneNumber.trim());
        } catch (IllegalArgumentException e){
            e.printStackTrace();
            throw e;
        }
    }

    public static void updateController(String firstName, String lastName, String newPhoneNumber, String oldPhoneNumber){
        try {
            if(firstName == null || lastName == null || oldPhoneNumber == null || newPhoneNumber == null){
                throw new IllegalArgumentException("Nulls are not allowed");
            }
            if(oldPhoneNumber.length() < 2 || oldPhoneNumber.length() > 50){
                throw new IllegalArgumentException(" Old phone number is not valid");
            }
            if(firstName.length() < 2 || firstName.length() > 50){
                throw new IllegalArgumentException("FirstName is not valid");
            }
            if(lastName.length() < 2 || lastName.length() > 50){
                throw new IllegalArgumentException("Last Name is not valid");
            }
            if(newPhoneNumber.length() < 2 || newPhoneNumber.length() > 50){
                throw new IllegalArgumentException("New Phone Number is not valid");
            }

            updateContactService(oldPhoneNumber.trim(), firstName.trim(), lastName.trim(), newPhoneNumber.trim());
        } catch (IllegalArgumentException e){
            e.printStackTrace();
            throw e;
        }
    }

    public static String[] deleteController(String phoneNumber){
        try {
            if(phoneNumber.length() < 2 || phoneNumber.length() > 12){
                throw new IllegalArgumentException("Phone number is not valid");
            }
            return deleteContactService(phoneNumber);
        } catch (IllegalArgumentException e){
            e.printStackTrace();
            throw e;
        }
    }

    public static String[] getOneController(String phoneNumber){
        try {
            if(phoneNumber.length() < 2 || phoneNumber.length() > 12){
                throw new IllegalArgumentException("Phone number is not valid");
            }
            return getOneContactService(phoneNumber);
        } catch (IllegalArgumentException e){
            e.printStackTrace();
            throw e;
        }
    }

    public static String[][] getAllContactsController(){
        try {
            return getAllContactsService();
        } catch (IllegalArgumentException e){
            e.printStackTrace();
            throw e;
        }
    }

    // Service Layer
    public static String[] getOneContactService(String phoneNumber){
        try {
            String[] contact = getContactByPhoneNumber(phoneNumber);
            if (contact.length == 0){
                throw new IllegalArgumentException("Contact Not Found");
            }

            return contact;
        } catch (IllegalArgumentException e){
            log(e);
            throw e;
        }
    }

    public static String[][] getAllContactsService() throws IllegalArgumentException{

        try {
            String[][] contactsList = getAllContacts();

            if(contactsList.length == 0) {
                throw new IllegalArgumentException("List is empty");
            }
            return contactsList;
        } catch (IllegalArgumentException e){
            log(e);
            throw e;
        }
    }

    public static void insertContactService(String firstName, String lastName, String phoneNumber){
        try {
            if(!(insert(firstName, lastName, phoneNumber))){
                throw new IllegalArgumentException("Error in Insert");
            }
        } catch (IllegalArgumentException e){
            log(e);
            throw e;
        }
    }

    public static void updateContactService(String oldPhoneNumber, String firstName,
                                            String lastName, String newPhoneNumber){
        try {
            if(!(update(oldPhoneNumber, firstName, lastName, newPhoneNumber))){
                throw new IllegalArgumentException("Error in update!");
            }
        } catch (IllegalArgumentException e){
            log(e);
            throw(e);
        }
    }

    public static String[] deleteContactService(String phoneNumber){
        String[] contact;

        try {
            contact = delete(phoneNumber);
            if(contact.length == 0){
                throw new IllegalArgumentException("Error in delete");
            }
            return contact;
        } catch (IllegalArgumentException e){
            log(e);
            throw e;
        }
    }

    // CRUD

    public static int getIndexByPhoneNumber(String phoneNumber){
        for(int i = 0; i <= pivot; i++){
            if(contacts[i][2].equals(phoneNumber)) {
                return i;
            }
        }

        return -1;
    }

    public static boolean insert(String firstname, String lastname, String phoneNumber){

        // Checks to see if contacts list is full
        if(isFull(contacts)) return  false;

        // Didn't find the number
        if(getIndexByPhoneNumber(phoneNumber) != -1) return false;

        pivot++;
        contacts[pivot][0] = firstname;
        contacts[pivot][1] = lastname;
        contacts[pivot][2] = phoneNumber;

        return true;
    }

    public static boolean update(String oldPhoneNumber, String firstName, String lastName, String newPhoneNumber){

        // Checks to see if the phone number already exists using the function getIndexByPhoneNumber()
        int positionToUpdate = getIndexByPhoneNumber(oldPhoneNumber);

        String[] contact = new String[3];

        // Didn't find the number
        if (positionToUpdate == -1) return false;
            //return new String[] {};

//        contact[0] = contacts[positionToUpdate][0];
//        contact[1] = contacts[positionToUpdate][1];
//        contact[2] = contacts[positionToUpdate][2];

        contacts[positionToUpdate][0] = firstName;
        contacts[positionToUpdate][1] = lastName;
        contacts[positionToUpdate][2] = newPhoneNumber;

        return true;
    }

    public static String[] delete(String phoneNumber){
        int positionToDelete = getIndexByPhoneNumber(phoneNumber);
        String[] contact = new String[3];

        if (positionToDelete == -1) return new String[] {};

//        for(int i = 0; i < contact.length; i++){
//            contact[i] = contacts[positionToDelete][i];
//        }

        // What? Check later
        System.arraycopy(contacts[positionToDelete], 0, contact, 0, contact.length);

        if(!(positionToDelete == contacts.length - 1)) {
            // Check later
            // pivot will arr.len ?
            System.arraycopy(contacts, positionToDelete + 1, contacts, positionToDelete, pivot - positionToDelete);
        }

        pivot--;
        return contact;
    }

    public static String[] getContactByPhoneNumber(String phoneNumber){
        // Checks to see if the phone number exists
        int positionToReturn = getIndexByPhoneNumber(phoneNumber);

        if (positionToReturn == -1) return new String[] {};

        return contacts[positionToReturn];
    }

    public static String[][] getAllContacts(){
        return Arrays.copyOf(contacts, pivot + 1);
    }

    public static boolean isFull(String arr[][]){
        // Can also use contacts.length
        return pivot == arr.length - 1;
    }

    // Custom Logger
    // Varargs String[] message
    // log(exception)

    public static void log(Exception e, String... message){
        try (PrintStream ps = new PrintStream(new FileOutputStream(PATH.toFile(), true))) {
            ps.println(LocalDateTime.now() + "\n" + e.toString());
            // Check
            ps.printf("%s ", (message.length == 1) ? message[0] : "");
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }

    }
}
