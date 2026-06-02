import java.sql.*;

public class TransactionHandlingInJDBC {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/bankdb";
        String user = "root";
        String password = "root";

        try {

            Connection con =
                    DriverManager.getConnection(url, user, password);

            con.setAutoCommit(false);

            Statement st = con.createStatement();

            st.executeUpdate(
                    "UPDATE accounts SET balance=balance-500 WHERE id=1");

            st.executeUpdate(
                    "UPDATE accounts SET balance=balance+500 WHERE id=2");

            con.commit();

            System.out.println("Transaction Successful");

            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}