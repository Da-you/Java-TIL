package org.example.mid.object.equals;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        UserV2 userV2 = (UserV2)obj;
        return id.equals(userV2.id);
    }

    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-001");
        UserV2 user2 = new UserV2("id-001");

        System.out.println("identity = " + (user1 == user2)); // false
        System.out.println("equality = " + (user1.equals(user2))); // true
    }
}