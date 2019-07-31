import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

import javax.sql.DataSource;
import javax.sql.PooledConnection;
import java.sql.*;

/**
 * Package: PACKAGE_NAME
 * User: 李鹏程
 * Date: 2019-07-30
 * Time: 21:27
 * Description:
 */
public class MainWithDataSource {
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        // 在 com.mysql.cj.jdbc.Driver 类的静态代码块中进行了DriverManager的注册。
        MysqlConnectionPoolDataSource ds = new MysqlConnectionPoolDataSource();
        ds.setUser("lpc_test");
        ds.setPassword("12345aA)");
        ds.setUrl("jdbc:mysql://104.248.236.89:3306/learn");
        // 连接数之类的再看

        PooledConnection p = ds.getPooledConnection();
        Statement statement = p.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery("select * from form");
        while (resultSet.next()){
            String x= resultSet.getString(1);
            System.out.println("x="+x);
        }
    }
}
