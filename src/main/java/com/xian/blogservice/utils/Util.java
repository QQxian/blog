package com.xian.blogservice.utils;

import com.xian.blogservice.model.User;
import org.springframework.security.core.context.SecurityContextHolder;


public class Util {
    public static User getCurrentUser() {
        //获取TheadLocal保存的用户信息
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return user;
    }
}
