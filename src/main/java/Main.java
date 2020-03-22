
public class Main {
    public static void main(String[] args) {
       CustomerDB customers = new CustomerDB();
       customers.sqlQuery();
       System.out.println("----------------------------------");
       customers.sqlQuery2();
       System.out.println("----------------------------------");
       customers.sqlQuery3();
        System.out.println("----------------------------------");
        //customers.sqlQuery4();

        OrdersDB orders = new OrdersDB();
        orders.sqlQueryO();

        PaymentsDB payments = new PaymentsDB();
        payments.sqlQueryP();
    }
}
