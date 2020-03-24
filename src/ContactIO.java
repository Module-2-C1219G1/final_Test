import java.io.*;
import java.util.ArrayList;

public class ContactIO {
    public ArrayList<User> contactList;
    File contactFile;
    private static final String FILE_PATH = "C:\\Users\\Yuki Douji\\Desktop\\Final Test\\src\\Contact.csv";

    public ContactIO(ArrayList<User> contactList) {
        this.contactList = contactList;
        contactFile = new File(FILE_PATH);

    }

    public void readFile() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(contactFile));
        String line;
        int count = 1;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.print(count + ". ");
            printUser(parseCsvLine(line));
            count++;
        }
        bufferedReader.close();
    }

    private void printUser(ArrayList<String> parseCsvLine) {
        System.out.println("Name: " + parseCsvLine.get(0) + '\n' +
                "Phone Number: " + parseCsvLine.get(1) + '\n' +
                "Address: " + parseCsvLine.get(2) + '\n' +
                "Gender: " + parseCsvLine.get(3) + '\n' +
                "Email: " + parseCsvLine.get(4) + '\n' +
                "Facebook: " + parseCsvLine.get(5) + '\n');

    }

    private ArrayList<String> parseCsvLine(String csvLine) {
        ArrayList<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }

        }
        return result;
    }

    public void writeFile() throws IOException {
        FileWriter fileWriter = new FileWriter(contactFile);
        for (User user : contactList) {
            fileWriter.append(",");
            fileWriter.append(user.getName());
            fileWriter.append(',');
            fileWriter.append(user.getPhoneNumber());
            fileWriter.append(',');
            fileWriter.append(user.getAddress());
            fileWriter.append(',');
            fileWriter.append(user.getGender());
            fileWriter.append(',');
            fileWriter.append(user.getEmail());
            fileWriter.append(',');
            fileWriter.append(user.getFacebook());
            fileWriter.append('\n');
        }
        System.out.println("complete !");
        fileWriter.flush();
    }

}
