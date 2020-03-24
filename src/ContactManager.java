import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {
    public ArrayList<User> contactList;
    private Scanner scanner;
    private ContactIO contactIO;

    public ContactManager() {
        contactList = new ArrayList<>();
        scanner = new Scanner(System.in);
        contactIO = new ContactIO(contactList);
    }

    public void showContact() {
        if (contactList.isEmpty()) {
            System.out.println("contact is empty !");
            return;
        }
        int count = 1;
        for (User user : contactList) {
            System.out.println(count + "." + user.toString());
        }
    }

    public void addNewContact() {
        String name;
        String phoneNumber;
        String address;
        String gender;
        String facebook;
        String email;
        System.out.println("Please enter the name of new contact: ");
        name = scanner.nextLine();
        System.out.println("Please enter phone number of contact: ");
        phoneNumber = scanner.nextLine();
        System.out.println("Please enter the address: ");
        address = scanner.nextLine();
        System.out.println("Enter the gender ");
        gender = scanner.nextLine();
        System.out.println("Enter email: ");
        email = scanner.nextLine();
        System.out.println("Enter facebook: ");
        facebook = scanner.nextLine();
        User user = new User(name, phoneNumber, address, gender, email, facebook);
        contactList.add(user);
        System.out.println("add complete !");
    }

    //--------------------------------
    public void searchContact(){
        System.out.println("Enter the phone number you want search: ");
        String phoneNumber = scanner.nextLine();
        int index = searchContact(phoneNumber);
        if (index == -1) {
            System.out.println("didn't find");
            return;
        }
        System.out.println("Phone info: ");
        System.out.println(contactList.get(index).toString());
    }
    public int searchContact(String phoneNumber) {
        for (User user : contactList) {
            if (user.getPhoneNumber().equals(phoneNumber)) {
                System.out.println(" Find complete !");
                return contactList.indexOf(user);
            }
        }
        return -1;
    }


    public void chooseUpdate(int indexContact) {
        String choose;
        System.out.println("1. change name");
        System.out.println("2. change phone number");
        System.out.println("3. change address");
        System.out.println("4. change gender");
        System.out.println("5. change email");
        System.out.println("6. change facebook");
        choose = scanner.nextLine();
        switch (choose) {
            case "1":
                String newName;
                System.out.println("Enter new name: ");
                newName = scanner.nextLine();
                contactList.get(indexContact).setName(newName);
                System.out.println("change complete: ");
                return;
            case "2":
                String newPhoneNumber;
                System.out.println("Enter new phone number: ");
                newPhoneNumber = scanner.nextLine();
                contactList.get(indexContact).setName(newPhoneNumber);
                return;
            case "3":
                String newAddress;
                System.out.println("Enter new name: ");
                newAddress = scanner.nextLine();
                contactList.get(indexContact).setName(newAddress);
                return;
            case "4":
                String newGender;
                System.out.println("Enter new gender: ");
                newGender = scanner.nextLine();
                contactList.get(indexContact).setName(newGender);
                return;
            case "5":
                String newEmail;
                System.out.println("Enter new name: ");
                newEmail = scanner.nextLine();
                contactList.get(indexContact).setName(newEmail);
                return;
            case "6":
                String newFaceBook;
                System.out.println("Enter new facebook: ");
                newFaceBook = scanner.nextLine();
                contactList.get(indexContact).setName(newFaceBook);
                return;
            default:
                System.out.println("Invalid choose !");
                chooseUpdate(indexContact);
        }
    }

    public void update() {
        String phoneNumber;
        System.out.println("Enter the phone number of contact you want change info: ");
        phoneNumber = scanner.nextLine();
        int indexContact = searchContact(phoneNumber);
        if (indexContact == -1) {
            System.out.println("Phone Number doesn't existed !");
            return;
        }
        chooseUpdate(indexContact);
        System.out.println("Change complete !");
    }

    public void delete() {
        String phoneNumber;
        System.out.println("Enter the phone number of contact you want delete: ");
        phoneNumber = scanner.nextLine();
        int indexContact = searchContact(phoneNumber);
        if (indexContact == -1) {
            System.out.println("Phone Number doesn't existed !");
            return;
        }
        contactList.remove(indexContact);
    }

    public void readFromFile() throws IOException {
        contactIO.readFile();
        System.out.println("Read complete !");
    }

    public void writeToFile() throws IOException {
        contactIO.writeFile();
    }
}
