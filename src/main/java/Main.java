
public class Main {
    public static void main(String[] args) {
       CustomerDB customers = new CustomerDB();
        System.out.println("-----------------1-----------------");
       customers.sqlQuery();
       System.out.println("------------------2----------------");
       customers.sqlQuery2();
       System.out.println("------------------3----------------");
       customers.sqlQuery3();
       /* System.out.println("-----------------4-----------------");
        customers.sqlQuery4();
        System.out.println("-----------------5-----------------");
        customers.sqlQuery();
*/
        OrdersDB orders = new OrdersDB();
        System.out.println("-----------------6------------------");
        orders.sqlQuery6();

        PaymentsDB payments = new PaymentsDB();
        System.out.println("-----------------7------------------");
        payments.sqlQuery7();
    }
}
