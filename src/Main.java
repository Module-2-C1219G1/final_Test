import org.omg.CORBA.DynAnyPackage.Invalid;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        ContactManager contactManager = new ContactManager();
        String choose;
        boolean exit = false;
        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    contactManager.showContact();
                    break;
                case "2":
                    contactManager.addNewContact();
                    break;
                case "3":
                    contactManager.update();
                    break;
                case "4":
                    contactManager.delete();
                    break;
                case "5":
                    contactManager.searchContact();
                case "6":
                    contactManager.readFromFile();
                    break;
                case "7":
                    contactManager.writeToFile();
                    break;
                case "0":
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choose, Please enter again !");
            }
            if (exit) {
                break;
            }
            showMenu();
        }

    }

    public static void showMenu() {
        System.out.println("--------------contact manager---------");
        System.out.println("1. xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Tìm kiếm");
        System.out.println("6. đọc từ file");
        System.out.println("7. ghi vào file");
        System.out.println("0. thoát ");
        System.out.println("---------------------------------------");
        System.out.println("chọn chức năng : ");
    }
}
