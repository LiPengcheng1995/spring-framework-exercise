import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

import javax.sql.DataSource;
import javax.sql.PooledConnection;
import java.beans.PropertyVetoException;
import java.sql.*;

/**
 * Package: PACKAGE_NAME
 * User: 李鹏程
 * Date: 2019-07-30
 * Time: 21:27
 * Description:
 */
public class MainWithDataSource {
    public static void main(String args[]) throws ClassNotFoundException, SQLException, PropertyVetoException {
        // 在 com.mysql.cj.jdbc.Driver 类的静态代码块中进行了DriverManager的注册。
        ComboPooledDataSource ds = new ComboPooledDataSource();
        ds.setUser("lpc_test");
        ds.setPassword("12345aA)");
        ds.setDriverClass("com.mysql.cj.jdbc.Driver");
        ds.setJdbcUrl("jdbc:mysql://104.248.236.89:3306/learn");
        ds.setInitialPoolSize(3);
        ds.setMaxPoolSize(10);
        ds.setMaxStatements(100);
        ds.setAcquireIncrement(2);

        Statement statement = ds.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery("select * from form");
        while (resultSet.next()){
            String x= resultSet.getString(1);
            System.out.println("x="+x);
        }
    }
}
