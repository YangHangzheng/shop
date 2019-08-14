package com.yanghz.shopuser.dao;

import com.yanghz.shopuser.mapper.UserMapper;
import com.yanghz.shopuser.model.User;
import com.yanghz.shopuser.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author yanghangzheng
 * @date 2019/6/28 9:32
 */

@Component
public class UserDao {

    @Autowired
    UserMapper userMapper;

    public User getUserInfo() {
        return userMapper.getUserInfo();
    }

    public void insertUserInfo(User user) {
        userMapper.insertUserInfo(user);
    }

    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }

    public void updateUserInfo(User user) {
        userMapper.updateUserInfo(user);
    }

    public List<User> queryUserByVo(UserVo userVo) {
        return userMapper.queryUserByVo(userVo);
    }

    public void deleteUser(int id) {
        userMapper.deleteUser(id);
    }

}
