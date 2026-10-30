package Activity5;

public class Main {
    public static void main(String[] args) {

        System.out.println("                ADMIN SAMPLE OUTPUT\n");
        System.out.println();
        System.out.println("======================================================\n");
        System.out.println("                  WELCOME TO KARGO\n");
        System.out.println("======================================================\n");

        Admin admin = new Admin("Vamfayr Bella", 1919, "Full System Access");
        admin.showNameandyear();
        admin.showDashboard();
        System.out.println();
        System.out.println();

        System.out.println("                SELLER SAMPLE OUTPUT\n");
        System.out.println();
        System.out.println("======================================================\n");
        System.out.println("                  WELCOME TO KARGO\n");
        System.out.println("======================================================\n");

        Seller seller = new Seller("Ed is Ward", 1818, "Seller Full Access");
        seller.showNameandyear();
        seller.showDashboard();

        System.out.println();
        System.out.println();
        System.out.println("                BUYER SAMPLE OUTPUT\n");
        System.out.println();
        System.out.println("======================================================\n");
        System.out.println("                  WELCOME TO KARGO\n");
        System.out.println("======================================================\n");
        Buyer buyer = new Buyer("Ja is Cob", 1717, "Buyer Full Access");
        buyer.showNameandyear();
        buyer.showDashboard();

    }
}
