import java.util.ArrayList;
import java.util.List;
public class Hotel {
    List<Customer>customers=new ArrayList<>();
    public void add(Customer c){
        customers.add(c);
    }
    public void update(Customer customer){
        for (Customer c:customers) {
          if (customer.getId()==c.getId()){
              c.setName(customer.getName());
              c.setDateOfBirth(customer.getDateOfBirth());
              c.setIdentity(customer.getIdentity());
              c.setNumberOfDayRented(customer.getNumberOfDayRented());
              c.setRoomType(customer.getRoomType());
              c.setRoomRate(customer.getRoomRate());
          }
        }
    }
    public void delete(int id){
        customers.removeIf(c -> c.getId() == id);
    }
    public void showAll(){
        for (Customer c: customers) {
        System.out.println(c.toString());
    }
    }
    public void billPlease(int identity){
        for (Customer c:customers) {
            if (c.getIdentity()==identity){
                int a= c.getNumberOfDayRented() *c.getRoomRate();
                System.out.println("số tiền phải trả :"+a);
            }
        }
    }

}
