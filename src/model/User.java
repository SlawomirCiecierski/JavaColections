package model;

import java.time.LocalDate;

public class User {

    private String login, password;

    private LocalDate data;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.data=LocalDate.now();


    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", data=" + data +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
