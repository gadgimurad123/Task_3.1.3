package com.gaz.web.spring_boot_v1.dao;

import com.gaz.web.spring_boot_v1.entity.Role;
import com.gaz.web.spring_boot_v1.entity.User;

import java.util.List;

public interface UserDao {
    public User getUserByName(String username);

    public List<User> getAllUsers();

    public void saveUser(User user);

    public void deleteUser(Long id);

    public Role getRoleByName(String username);

    public User getUserById(Long id);

    public List<Role> getListRole();
}
