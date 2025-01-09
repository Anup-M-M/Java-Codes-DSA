package main.java.org.anup.java8features.optional;

class User {
    private Profile profile;

    // Constructor, getters, setters
    public User(Profile profile) {
        this.profile = profile;
    }

    public Profile getProfile() {
        return profile;
    }
}

class Profile {
    private String name;

    // Constructor, getters, setters
    public Profile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class UserService {
    public String getUserName(User user) {
        if (user != null) {
            if (user.getProfile() != null) {
                if (user.getProfile().getName() != null) {
                    return user.getProfile().getName();
                }
            }
        }
        return "Unknown";
    }
}

public class WithOutOptional {
    public static void main(String[] args) {
        // Create instances
        Profile profile = new Profile("John Doe");
        User user = new User(profile);

        // Service instance
        UserService userService = new UserService();

        // Get username
        String name = userService.getUserName(user);
        System.out.println("User Name: " + name);
    }
}
