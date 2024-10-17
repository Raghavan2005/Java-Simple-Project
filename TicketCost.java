import java.util.Scanner;

public class TicketCost {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter ticket type Regular, VIP, Premium:");
        String ticketType = sn.nextLine().trim();
        System.out.println("Enter number of ticket bought");
        int notickets;
        notickets = sn.nextInt();
        double totalCost = calculateTicketCost(ticketType, notickets);
     
        if (totalCost >= 0) {
            System.out.printf("%.1f\n", totalCost);
        } else {
            System.out.println("Invalid ticket type");
        }
    }
 
     static double calculateTicketCost(String ticketType, int notickets) {
       
         double REGULAR_PRICE = 50;
         double VIP_PRICE = 100;
         double PREMIUM_PRICE = 150;

    

        double basePrice;
        double discount = 0;


        switch (ticketType) {
            case "Regular":
                basePrice = REGULAR_PRICE;
                if (notickets > 10) {
                    discount = 0.10; 
                }
                break;
            case "VIP":
                basePrice = VIP_PRICE;
                if (notickets > 5) {
                    discount = 0.15; 
                }
                break;
            case "Premium":
                basePrice = PREMIUM_PRICE;
                if (notickets > 3) {
                    discount = 0.20;  
                }
                break;
            default:
                return -1; 

        double totalCost = basePrice * notickets;


        totalCost -= totalCost * discount;


        if (basePrice * notickets < 200) {
            totalCost += 20;
        }

        return totalCost;
    }
}
