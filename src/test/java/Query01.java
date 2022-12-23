import java.sql.*;

public class Query01 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1)Driver Yükle
        Class.forName("com.mysql.jdbc.Driver");


        //2) Create connection
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/techproed?serverTimezone=UTC","root","208817");

        //3) Statement: SQL kodlarimizi yazmak icin bir nesne oluştur
        Statement st= con.createStatement();

        //4)ResultSet
        ResultSet veri=st.executeQuery("SELECT * FROM students");



    }
}
