import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * Package: PACKAGE_NAME
 * User: 李鹏程
 * Date: 2019-07-31
 * Time: 20:42
 * Description:
 */
public class UserTemplate {

    private JdbcTemplate jdbcTemplate;

    private static String sql = "INSERT INTO learn.form (creator, is_deleted, modifier, business_id, form_name, template_id, creation_code) VALUES (?,?,?,?,?,?,?)";


    public Long saveUser(User user) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        int result = jdbcTemplate.update(
                con -> {
                    PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                    ps.setString(1, user.getCreator());
                    ps.setBoolean(2, user.isDeleted());
                    ps.setString(3, user.getModifier());
                    ps.setLong(4, user.getBusinessId());
                    ps.setString(5, user.getFormName());
                    ps.setLong(6, user.getTemplateId());
                    ps.setString(7, user.getCreationCode());
                    return ps;
                }, keyHolder);
        if (result != 0) {
            System.out.println("插入数据成功");
            return keyHolder.getKey().longValue();
        }
        return null;
    }

    public void updateUserById(User user) {

    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<User> getByCreator(String creator) {
        return jdbcTemplate.query("select * from form where creator = '" + creator + "'", new UserRowMapper());
    }


}
