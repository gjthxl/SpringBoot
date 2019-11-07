package com.baizhi.dao;

import com.baizhi.entity.Admin;
import com.baizhi.entity.User;
import org.apache.ibatis.annotations.Param;

import javax.annotation.security.PermitAll;
import java.util.List;

public interface UserDAO {
    Admin loginAdmin(String admin);
    User loginUser(String user);
    void addUser(User user);
    List<User> showAllUser(@Param("0") Integer begin,@Param("1") Integer size);
    void updateUser(User user);
    void deleteUser(User user);
    Integer queryAllCount();
}
