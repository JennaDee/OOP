package Activity5;

public class Buyer extends User {
    private String buyerAccess;

    public Buyer(String username, int yearJoined, String buyerAccess) {
        super(username, yearJoined);
        this.buyerAccess = buyerAccess;
    }

    public String getBuyerAccess() {
        return buyerAccess;
    }

    @Override
    public void showDashboard() {
        System.out.println(
                "\nGood day " + getUsername() + "! you have " + getBuyerAccess() + " to Kargo.");
        System.out.println();
        System.out.println("In this dashboard you can: ");
        System.out.println("1. View batches");
        System.out.println("2. Claim orders");
        System.out.println("3. Apply for waitlist");
        System.out.println("4. Share a batch");
        System.out.println("5. Send payment proof");
        System.out.println("======================================================");
    }
}