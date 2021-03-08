package com.kodilla.exception.nullpointer;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        //User user = new User("user1");
        User user = null;
        Optional<User> optionalUser = Optional.ofNullable(user);
        String name = optionalUser.orElse(new User("dddkkk")).getName();
        System.out.println(name);

        optionalUser.ifPresent(x -> System.out.println(x.getName()));
    }
}
