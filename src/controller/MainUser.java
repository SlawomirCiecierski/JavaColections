package controller;

public class MainUser {
    public static void main(String[] args) {
        UserController uc= new UserController();
        uc.addUser("wcc","wcc");
        uc.addUser("ccc","ccc");
        uc.addUser("ddd","ddd");
        //uc.addUser("wcc","aaa");
        uc.showUsers();
        //uc.deleteUser("wcc");
        uc.changePassword("ccc","ccc","nnn","nnn");
        uc.showUsers();

    }
}
