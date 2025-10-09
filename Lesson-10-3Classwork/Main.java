class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){

        
  }

    /*
      Problem 1:      
      Write a function groupSavings that takes number of tickets wanting 
      to purchase. Return the total cost by apply the following discount:
      1 to 8 tickets  : each ticket cost $11,
      9 to 16 tickets : each ticket cost $10.50
      over 16 tickts  : each ticket cost $8.50
    */
public class Discounts {

    public static double groupSavings(int numTickets) {
        double costPerTicket;

        if (numTickets >= 1 && numTickets <= 8) {
            costPerTicket = 11.0;
        } else if (numTickets >= 9 && numTickets <= 16) {
            costPerTicket = 10.50;
        } else if (numTickets > 16) {
            costPerTicket = 8.50;
        } else {
            // Handle invalid input (e.g., 0 or negative tickets)
            return 0.0;
        }

        return numTickets * costPerTicket;
    }


  
  /*
      Write a function groceryDiscount that takes the total amount spent at 
      a grocery store and the number of cans of beans purchased.
      Depending on the total amount and number of can of
      beans purchase, you get a savings on their total bill.
      Return the savings amount:
        Spent $100 to $200 and purchase at least 3 cans of 
        beans: $10 savings
        Spent over $200 and purchase more than 4 cans 
        of beans: $25 savings
        Otherwise: $0 savings.
    */
   public static double groceryDiscount(double totalSpent, int numCansOfBeans) {
        double savings = 0.0;

        if (totalSpent >= 100 && totalSpent <= 200 && numCansOfBeans >= 3) {
            savings = 10.0;
        } else if (totalSpent > 200 && numCansOfBeans > 4) {
            savings = 25.0;
        }

        return savings;
    }
}

}