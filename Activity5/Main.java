package Activity5;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin("Vamfayr Bella", 1919, "Full System Access");
        Seller seller = new Seller("Ed is Ward", 1818, "Seller Full Access");
        Buyer buyer = new Buyer("Ja is Cob", 1717, "Buyer Full Access");

        System.out.println();
        System.out.println("                ADMIN SAMPLE OUTPUT");
        System.out.println();
        System.out.println("======================================================");
        System.out.println("                  WELCOME TO KARGO");
        System.out.println("======================================================");
        admin.showNameandyear();
        admin.showDashboard();
        System.out.println();

        System.out.println("                SELLER SAMPLE OUTPUT");
        System.out.println();
        System.out.println("======================================================");
        System.out.println("                  WELCOME TO KARGO");
        System.out.println("======================================================");
        seller.showNameandyear();
        seller.showDashboard();

        System.out.println();
        System.out.println("                BUYER SAMPLE OUTPUT");
        System.out.println();
        System.out.println("======================================================");
        System.out.println("                  WELCOME TO KARGO");
        System.out.println("======================================================");
        buyer.showNameandyear();
        buyer.showDashboard();

    }
}
