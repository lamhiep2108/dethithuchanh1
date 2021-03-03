import java.util.Scanner;

public class Menus {
static Scanner scanner=new Scanner(System.in);
 public static Customer hotelManagement(){
  System.out.println("---------------");
  System.out.println("nhập id");
  int id = Integer.parseInt(scanner.nextLine());
  System.out.println("nhập name");
  String name = scanner.nextLine();
  System.out.println("nhập ngày sinh");
  String dateOfBirth = scanner.nextLine();
  System.out.println("nhập CMND");
  int identity = Integer.parseInt(scanner.nextLine());
  System.out.println("nhập số ngày trọ");
  int numberOfDayRented= Integer.parseInt(scanner.nextLine());
  System.out.println("nhập loại phòng trọ");
  String roomType = scanner.nextLine();
  System.out.println("nhập giá phòng");
  int roomRate=Integer.parseInt(scanner.nextLine());
 return new Customer(id,name,dateOfBirth,identity, numberOfDayRented,roomType,roomRate);
 }
}
