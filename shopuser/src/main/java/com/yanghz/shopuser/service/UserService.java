package com.yanghz.shopuser.service;

import com.yanghz.shopuser.dao.UserDao;
import com.yanghz.shopuser.mapper.UserMapper;
import com.yanghz.shopuser.model.User;
import com.yanghz.shopuser.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yanghangzheng
 * @date 2019/6/27 16:30
 */

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public User getUserInfo() {
        return userDao.getUserInfo();
    }

    public void insertUserInfo(User user) {
        userDao.insertUserInfo(user);
    }

    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    public void updateUserInfo(User user) {
        userDao.updateUserInfo(user);
    }

    public List<User> queryUserByVo(UserVo userVo) {
        return userDao.queryUserByVo(userVo);
    }

    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

}
