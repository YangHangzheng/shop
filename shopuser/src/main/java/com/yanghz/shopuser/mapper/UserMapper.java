package com.yanghz.shopuser.mapper;

import com.yanghz.shopuser.model.User;
import com.yanghz.shopuser.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * @author yanghangzheng
 * @date 2019/6/27 16:14
 */

@Mapper
public interface UserMapper {

    User getUserInfo();

    void insertUserInfo(User user);

    void updateUserInfo(User user);

    User getUserById(int id);

    List<User> queryUserByVo(UserVo userVo);

    void deleteUser(int id);

}
