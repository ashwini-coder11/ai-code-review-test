public class NullHandlingDemo {
    static class User {
        Address address;
        Address getAddress() { return address; }
    }

    static class Address {
        String city;
        String getCity() { return city; }
    }

    public static void main(String[] args) {
        User user = null;
        String city = user.getAddress().getCity().toUpperCase();
        System.out.println(city);
    }
}

// Null dereference occurs when the user object is absent.
