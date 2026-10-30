package Activity5;

public abstract class User {
    private String username;
    private int yearJoined;

    public User(String username, int yearJoined) {
        this.yearJoined = yearJoined;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    // Normal method
    public void showNameandyear() {
        System.out.println(getUsername() + " have been a member since " + yearJoined + ".");
    }

    // Abstract method
    public abstract void showDashboard();
}
