package projects.tc2r.UserLogins;

/**
 * Created by Tc2r on 4/5/2016.
 */
public class User {
    String name, username, password;
    int age;

    public User (String name, int age, String username, String password){
        this.name = name;
        this.age = age;
        this.password = password;
        this.username = username;

    }
    public User(String username, String password){
        this.name = "";
        this.age = -1;
        this.password = password;
        this.username = username;
    }
}
