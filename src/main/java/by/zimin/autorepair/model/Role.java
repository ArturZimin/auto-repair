package by.zimin.autorepair.model;

public enum Role {
    USER("The User which authenticated."),
    ADMIN("The site Administrator."),
    GUEST("Default , the User is not authenticated."),
    MANAGER("The site Manager.");

    private final String role;



    private Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
