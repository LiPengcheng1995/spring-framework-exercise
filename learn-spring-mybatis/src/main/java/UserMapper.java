/**
 * Package: PACKAGE_NAME
 * User: 李鹏程
 * Date: 2019-08-06
 * Time: 15:26
 * Description:
 */
public interface UserMapper {
    Long  insertUser(User user);
    User getById(Long id);
}
