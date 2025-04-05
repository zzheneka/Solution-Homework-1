package image;


public class User {
    private final String username;
    private final boolean isAgent;

    public User(String username, boolean isAgent) {
        this.username = username;
        this.isAgent = isAgent;
    }

    public boolean isAgent() {
        return isAgent;
    }

    public String getUsername() {
        return username;
    }
}
