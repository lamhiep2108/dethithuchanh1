
import java.util.Scanner;

public class Main {
    static Scanner input =new Scanner(System.in);
    static Hotel hotel=new Hotel();
    public static void main(String[] args) {
        do {
            System.out.println("--------------");
            System.out.println("1.add");
            System.out.println("2.update");
            System.out.println("3.delete");
            System.out.println("4.showAll");
            System.out.println("5.bill please");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    Customer customer=Menus.hotelManagement();
                    hotel.add(customer);
                    break;
                case 2:
                   Customer customer1=Menus.hotelManagement();
                    hotel.update(customer1);
                    break;
                case 3:
                    System.out.println("enter id");
                    int id = Integer.parseInt(input.nextLine());
                    hotel.delete(id);
                    break;
                case 4:
                    hotel.showAll();
                    break;
                case 5:
                    System.out.println("enter identity");
                    int identity =Integer.parseInt(input.nextLine());
                    hotel.billPlease(identity);
            }
        }while (true);

    }
}
