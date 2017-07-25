package com.test.accountInfo;

import java.util.ArrayList;

/**
 * Created by Travis Brindley on 7/23/2017.
 */
public interface UserAccounts {

    //Create User Accounts
    public void addUser(String firstName, String lastName, String userName, String password);

    //Read User Account
    public Users Read(String userName, String password);

    //Update User Accounts
    public void UpdateUser(String firstName, String lastName, String userName, String password);

    //Delete User Account
    public void DeleteUser();
}
