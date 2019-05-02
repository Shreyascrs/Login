package com.bridgeit.Dao;

import javax.transaction.HeuristicMixedException;

import com.bridgeit.pojo.User;

public interface IDao {
 String userRegister(User user) throws HeuristicMixedException;
 public boolean loginUser(String username,String password);
 public void changepassword(String username,String newpassword);
}
