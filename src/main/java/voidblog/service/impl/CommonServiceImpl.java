package voidblog.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import voidblog.dao.UserDao;
import voidblog.domain.User;
import voidblog.service.CommonService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lingdeqin on 17-5-24.
 */

@Service
@Transactional(rollbackFor = Exception.class)
public class CommonServiceImpl implements CommonService{
    @Resource
    private UserDao userDao;

    public User getUserById(Long userId) {
        return userDao.selectUserById(userId);
    }

    public List<User> getAllUser() {
        return userDao.selectAllUser();
    }

}
