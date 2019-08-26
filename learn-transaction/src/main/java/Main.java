import java.sql.*;

/**
 * Package: PACKAGE_NAME
 * User: 李鹏程
 * Date: 2019-07-30
 * Time: 21:06
 * Description:
 */
public class Main {
    public static String sql_a = "INSERT INTO learn.form (creator, is_deleted, modifier, business_id, form_name, template_id, creation_code) VALUES (?,?,?,?,?,?,?)";
    public static String sql_b = "";

    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        // 在 com.mysql.cj.jdbc.Driver 类的静态代码块中进行了DriverManager的注册。
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://104.248.236.89:3306/learn", "lpc_test", "12345aA)");
        // 设置事务
        connection.setAutoCommit(false);
        PreparedStatement statement = connection.prepareStatement(sql_a);
        statement.setString(1,"lpc create 2");
        statement.setInt(2,1);
        statement.setString(3,"lpc modify2");
        statement.setLong(4,123L);
        statement.setString(5,"form name2");
        statement.setLong(6,123L);
        statement.setString(7,"aaaaa2");

        statement.execute();

        Savepoint savepoint = connection.setSavepoint();

        PreparedStatement statement1 = connection.prepareStatement(sql_a);
        statement1.setString(1,"lpc create 1");
        statement1.setInt(2,1);
        statement1.setString(3,"lpc modify 1");
        statement1.setLong(4,123L);
        statement1.setString(5,"form name 1");
        statement1.setLong(6,123L);
        statement1.setString(7,"aaaaa 1");

        statement1.execute();

        connection.rollback(savepoint);
        connection.commit();
        statement.close();
        connection.close();
    }

}
