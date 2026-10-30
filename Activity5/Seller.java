package Activity5;

public class Seller extends User {
    private String sellerAccess;

    public Seller(String username, int yearJoined, String sellerAccess) {
        super(username, yearJoined);
        this.sellerAccess = sellerAccess;
    }

    public String getSellerAccess() {
        return sellerAccess;
    }

    @Override
    public void showDashboard() {
        System.out.println(
                "\nGood day " + getUsername() + "! you have " + getSellerAccess() + " to Kargo.");
        System.out.println();
        System.out.println("In this dashboard you can: ");
        System.out.println("1. Post batches");
        System.out.println("2. Accept orders");
        System.out.println("3. Manage fulfillment status");
        System.out.println("4. Share batch links");
        System.out.println("5. Check transaction proofs");
        System.out.println("======================================================");
    }

}
