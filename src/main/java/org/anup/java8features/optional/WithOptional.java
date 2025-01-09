package main.java.org.anup.java8features.optional;

import java.util.Optional;

class User1 {
    private Profile1 profile;

    // Constructor, getters, setters
    public User1(Profile1 profile) {
        this.profile = profile;
    }

    public Optional<Profile1> getProfile() {
        return Optional.ofNullable(profile);
    }
}

class Profile1 {
    private String name;

    // Constructor, getters, setters
    public Profile1(String name) {
        this.name = name;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }
}

class UserService1 {
    public String getUserName(User1 user) {
        return Optional.ofNullable(user)
                .flatMap(User1::getProfile)
                .flatMap(Profile1::getName)
                .orElse("Unknown");
    }
}

//Optional can help simplify code and reduce the need for multiple null checks, making the codebase cleaner and easier to maintain
//Avoiding NullPointerException: By using Optional, you explicitly handle the absence of values and avoid NullPointerException.
//Readable and Maintainable Code: Optional makes the code more expressive, indicating that a value might be absent and providing a clear way to handle that absence.
//Combining Multiple Operations: You can combine various operations on the Optional object, making complex value transformations more manageable.
public class WithOptional {
    public static void main(String[] args) {
        // Create instances
        Profile1 profile = new Profile1("John Doe");
        User1 user = new User1(profile);

        // Service instance
        UserService1 userService = new UserService1();

        // Get username
        String name = userService.getUserName(user);
        System.out.println("User Name: " + name);
    }
}
