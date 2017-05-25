package voidblog.service;

import voidblog.domain.User;

import java.util.List;

/**
 * Created by lingdeqin on 17-5-24.
 */
public interface CommonService {

    List<User> getAllUser();

    User getUserById(Long userId);
}
