package com.yanghz.shopuser.controller;

import com.yanghz.shopuser.model.User;
import com.yanghz.shopuser.service.UserService;
import com.yanghz.shopuser.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author yanghangzheng
 * @date 2019/6/27 17:36
 */

@Controller
@RequestMapping(value = "/shop")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    public User getUserInfo() {
        return userService.getUserInfo();
    }

    @GetMapping("/touserregistration")
    public String toUserRegistration() {
        return "/shop/userregistration";
    }

    @PostMapping("/userregistration")
    public void insertUserInfo(User user) {
        userService.insertUserInfo(user);
    }



    @GetMapping("/getuserbyid")
    public String getUserById(int id, Model model) {
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "/shop/getuserbyid";
    }

    @GetMapping("/toupdateuserinfo")
    public String toUpdateUserInfo(int id, Model model) {
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "/shop/updateuserinfo";
    }

    @PostMapping("/updateuserinfo")
    public void updateUserInfo(User user){
        userService.updateUserInfo(user);
    }

    @GetMapping("/userlist")
    public String queryUserByVo(Model model) {
        UserVo userVo = new UserVo();
        List<User> listuser = userService.queryUserByVo(userVo);
        model.addAttribute("listuser", listuser);
        return "/shop/userlist";
    }

    @GetMapping("/deleteuser")
    public void deleteUser(int id) {
        userService.deleteUser(id);
    }
}
