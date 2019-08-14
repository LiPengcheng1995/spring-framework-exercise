import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Package: PACKAGE_NAME
 * User: 李鹏程
 * Date: 2019-07-31
 * Time: 20:42
 * Description:
 */
@Transactional(propagation = Propagation.REQUIRED)
public class UserTemplate {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public Long saveUser(User user){
        String sql = "INSERT INTO learn.form (creator, is_deleted, modifier, business_id, form_name, template_id, creation_code) VALUES (?,?,?,?,?,?,?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        int result =  jdbcTemplate.update(
                con -> {
                    PreparedStatement ps = getJdbcTemplate().getDataSource()
                            .getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                    ps.setString(1,user.getCreator());
                    ps.setBoolean(2,user.isDeleted());
                    ps.setString(3,user.getModifier());
                    ps.setLong(4,user.getBusinessId());
                    ps.setString(5,user.getFormName());
                    ps.setLong(6,user.getTemplateId());
                    ps.setString(7,user.getCreationCode());
                    return ps;
                }, keyHolder);
        if (result != 0){
            System.out.println("插入数据成功,结果是："+keyHolder.getKey().longValue());
            throw new RuntimeException();
//            return keyHolder.getKey().longValue();
        }
        return null;
    }

    public void updateUserById(User user){

    }

    public List<User> getByCreator(String creator){
        return jdbcTemplate.query("select * from form where creator = '"+creator+"'",new UserRowMapper());
    }


}
