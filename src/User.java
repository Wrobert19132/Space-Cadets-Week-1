public class User {
    private final String name;
    private final String description;
    private final String phone;
    private final String email;

    User(String name, String description, String phone, String email) {
        this.name = name;
        this.description = description;
        this.phone = phone;
        this.email = email;
    }


    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
