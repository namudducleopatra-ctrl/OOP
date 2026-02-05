/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vasystem.auctionsystem;
import java.util.Scanner;
/**
 *
 * @author tumsi
 */

public class AuctionSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Vehicle details
        System.out.print("Enter Vehicle Registration Number (e.g. UAA 123A): ");
        String regNo = input.nextLine();

        System.out.print("Enter Vehicle Cost (UGX): ");
        double vehicleCost = input.nextDouble();

        System.out.print("Enter Total Deposits Made (UGX): ");
        double deposits = input.nextDouble();

        System.out.print("Enter Total Expenses Incurred (UGX): ");
        double expenses = input.nextDouble();

        // Bidding process
        double highestBid = 0;
        String highestBidder = "";

        for (int i = 1; i <= 3; i++) {
            input.nextLine(); // clear buffer
            System.out.print("Enter Bidder " + i + " Name: ");
            String name = input.nextLine();

            System.out.print("Enter Bid Amount (UGX): ");
            double bid = input.nextDouble();

            if (bid > highestBid) {
                highestBid = bid;
                highestBidder = name;
            }
        }

        // Calculations
        double balance = highestBid - deposits;
        double totalCost = vehicleCost + expenses;
        double profitLoss = highestBid - totalCost;

        // Output
        System.out.println("\n===== AUCTION RESULTS =====");
        System.out.println("Vehicle Registration: " + regNo);
        System.out.println("Winning Bidder: " + highestBidder);
        System.out.println("Winning Price: UGX " + highestBid);
        System.out.println("Deposits Paid: UGX " + deposits);
        System.out.println("Balance to be Cleared: UGX " + balance);

        System.out.println("\n===== FINANCIAL SUMMARY =====");
        System.out.println("Vehicle Cost: UGX " + vehicleCost);
        System.out.println("Expenses Incurred: UGX " + expenses);

        if (profitLoss > 0) {
            System.out.println("PROFIT MADE: UGX " + profitLoss);
        } else if (profitLoss < 0) {
            System.out.println("LOSS MADE: UGX " + profitLoss);
        } else {
            System.out.println("NO PROFIT, NO LOSS");
        }
    }
}
