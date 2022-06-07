package com.example.spendingmanagement.data;

import com.example.spendingmanagement.data.model.Account;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<Account> login(String username, String password) {

        try {
            // TODO: handle loggedInUser authentication
            Account fakeUser =
                    new Account(
                            java.util.UUID.randomUUID().toString(),
                            "Jane Doe",
                            "abcd");
            return new Result.Success<>(fakeUser);
        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}
