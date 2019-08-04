import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
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

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Long saveUser(User user){
        String sql = "INSERT INTO learn.form (create_time, creator, is_deleted, modifier, update_time, business_id, form_name, template_id, creation_code) VALUES (?,?,?,?,?,?,?,?,?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        int result =  jdbcTemplate.update(
                new PreparedStatementCreator() {
                    public PreparedStatement createPreparedStatement(Connection con) throws SQLException
                    {
                        PreparedStatement ps = getJdbcTemplate().getDataSource()
                                .getConnection().prepareStatement(sql);
                        ps.setString(1,user.getCreateTime().toString());
                        ps.setString(2,user.getCreator());
                        ps.setBoolean(3,user.isDeleted());
                        ps.setString(4,user.getModifier());
                        ps.setString(5,user.getUpdateTime().toString());
                        ps.setLong(6,user.getBusinessId());
                        ps.setString(7,user.getFormName());
                        ps.setLong(8,user.getTemplateId());
                        ps.setString(9,user.getCreationCode());
                        return ps;
                    }
                }, keyHolder);
        if (result != 0){
            System.out.println("插入数据成功");
            return keyHolder.getKey().longValue();
        }
        return null;
    }

    public void updateUserById(User user){

    }

    public List<User> getByCreator(String creator){
        return jdbcTemplate.query("select * from form where creator = '"+creator+"'",new UserRowMapper());
    }


}
