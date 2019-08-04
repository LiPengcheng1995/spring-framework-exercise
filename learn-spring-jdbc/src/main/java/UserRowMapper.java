import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author lipengcheng1995 Created date 2019-08-04 20:23
 **/
public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setFormId(resultSet.getLong("form_id"));
        user.setCreateTime(resultSet.getTime("create_time"));
        user.setUpdateTime(resultSet.getTime("update_time"));
        user.setCreator(resultSet.getString("creator"));
        user.setModifier(resultSet.getString("modifier"));
        user.setBusinessId(resultSet.getLong("business_id"));
        user.setFormName(resultSet.getString("form_name"));
        user.setTemplateId(resultSet.getLong("template_id"));
        user.setCreationCode(resultSet.getString("creation_code"));
        user.setDeleted(resultSet.getBoolean("is_deleted"));
        return user;
    }
}
