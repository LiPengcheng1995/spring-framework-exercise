import java.sql.*;

/**
 * Package: PACKAGE_NAME
 * User: 李鹏程
 * Email: lipengcheng3@jd.com
 * Date: 2019-08-05
 * Time: 18:07
 * Description:
 */
public class MainWithPreparedStatement {
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        // 在 com.mysql.cj.jdbc.Driver 类的静态代码块中进行了DriverManager的注册。
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://104.248.236.89:3306/learn", "lpc_test", "12345aA)");
        PreparedStatement statement = connection.prepareStatement("select * from form");
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            String x = resultSet.getString(1);
            System.out.println("x=" + x);
        }
    }
}
