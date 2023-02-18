package com.example.cateye.services.user_management;

import com.example.cateye.entity.user_management.User;
import com.example.cateye.pojo.user_management.UserPojo;

import java.io.IOException;
import java.util.List;

public interface UserService {

    UserPojo save(UserPojo userPojo) throws IOException;

    List<User> fetchAll();

    User fetchById(Integer id);

    void deleteById(Integer id);

   // void sendEmail();
}
