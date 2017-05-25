package voidblog.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import voidblog.domain.User;

import java.util.List;

/**
 * Created by lingdeqin on 17-5-24.
 */
@Repository
public interface UserDao {

    User selectUserById(@Param("userId") Long userId);

//    User selectUserByName(@Param("userName") String username);
//
//    User selectUserByNameAndPassword(@Param("userName") String username,@Param("userPassword") String password);

    List<User> selectAllUser();
}
