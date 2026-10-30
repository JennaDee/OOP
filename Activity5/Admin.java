package Activity5;

public class Admin extends User {
    private String adminAccess;

    public Admin(String username, int yearJoined, String adminAccess) {
        super(username, yearJoined);
        this.adminAccess = adminAccess;
    }

    @Override
    public void showDashboard() {
        System.out.println("======================================================");
        System.out.println("Good day " + getUsername() + "! you have " + adminAccess + " to Kargo.");
        System.out.println();
        System.out.println("In this dashboard you can: ");
        System.out.println("1. View audit logs");
        System.out.println("2. Manage users");
        System.out.println("3. View transaction history");
        System.out.println("4. Override status of orders");
        System.out.println("5. Configure system settings");
        System.out.println("======================================================");
    }
}