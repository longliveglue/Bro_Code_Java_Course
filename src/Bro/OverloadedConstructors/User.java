package Bro.OverloadedConstructors;

public class User {

    private String username;
    private String email;
    private int age;

    public User(String username) {
        this.username = username;
        this.email = "Not Provided";
        this.age = 0;
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.age = 0;
    }

    public User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        String string = username;

        if (!email.isEmpty()) {
            string = string + "," + email;
        }

        if (age > 0) {
            string = string + "," + age;
        }


        return string;
    }
}
