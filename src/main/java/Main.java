
public class Main {
    public static void main(String[] args) {
       CustomerDB customers = new CustomerDB();
       System.out.println("-----------------1. SELECT * FROM Customers--------------------------------------------------");
       customers.sqlQuery();
       System.out.println("------------------2. SELECT FirstName FROM Customers-----------------------------------------");
       customers.sqlQuery2();
       System.out.println("------------------3. SELECT FirstName FROM Customers WHERE CustomerID =1---------------------");
        customers.sqlQuery3();
       /*System.out.println("----------------4.UPDATE Customers SET FirstName = 'Lerato' WHERE CustomerID = 1-----------");
        customers.sqlQuery4();
        System.out.println("-----------------5. DELETE FROM Customers WHERE CustomerID = 2------------------------------");
        customers.sqlQuery();
*/
        OrdersDB orders = new OrdersDB();
        System.out.println("-----------------6. SELECT COUNT (DISTINCT Status) FROM \"information\".Orders--------------");
        orders.sqlQuery6();

        PaymentsDB payments = new PaymentsDB();
        System.out.println("-----------------7. SELECT MAX(Amount) FROM \"information\".Payments------------------------");
        payments.sqlQuery7();
        System.out.println("---------------------------------------END--------------------------------------------------");
    }
}
