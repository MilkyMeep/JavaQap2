package Problem1;
/**
 * Represents a credit card with owner, balance, and credit limit

 */
public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;
    
    /**
     * Constructor for CreditCard 
     * @param owner the card owner
     * @param creditLimit the credit limit
     */
    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
       
        this.creditLimit = new Money(creditLimit);
        this.balance = new Money(0.0); // Initialize balance 
    }
    
    /**
     * Gets the current balance
     * @return new Money object with current balance
     */
    public Money getBalance() {
        // Return a copy to maintain security -
        return new Money(balance);
    }
    
    /**
     * Gets the credit limit 
     * @return 
     */
    public Money getCreditLimit() {
        return new Money(creditLimit);
    }
    
    /**
     * Gets owner information as string - Task #2.4
     * @return string with owner's personal information
     */
    public String getPersonals() {
        return owner.toString();
    }
    
    /**
     * @param amount the amount to charge
     */
    public void charge(Money amount) {
        Money newBalance = balance.add(amount);
        
        // Check if charge would exceed credit limit
        if (newBalance.compareTo(creditLimit) <= 0) {
            balance = newBalance;
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }
    
    /**
     * @param amount the amount to pay
     */
    public void payment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
    
    /**
     * Calculates available credit
     * @return available credit as Money object
     */
    public Money getAvailableCredit() {
        Money available = creditLimit.subtract(balance);
        return new Money(available); // Return a copy for security
    }
}