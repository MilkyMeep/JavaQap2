package Problem1;
/**
 * Represents monetary values with dollars and cents
 */
public class Money implements Comparable<Money> {
    private int dollars;
    private int cents;
    
    /**
     * Constructor that takes dollars and cents separately
     * @param dollars the dollar amount
     * @param cents the cent amount
     */
    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
        normalize();
    }
    
    /**
     * Constructor that takes only dollars
     * @param dollars the dollar amount
     */
    public Money(int dollars) {
        this(dollars, 0);
    }
    
    /**
     * Constructor that takes a double value
     * @param amount the monetary amount as a double
     */
    public Money(double amount) {
        this.dollars = (int) amount;
        this.cents = (int) Math.round((amount - dollars) * 100);
        normalize();
    }
    
    /**
     *
     * @param other the Money object to copy from
     */
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }
    
    /**
     * Normalizes the money representation (e.g., 1 dollar 150 cents becomes 2 dollars 50 cents)
     */
    private void normalize() {
        if (cents >= 100) {
            dollars += cents / 100;
            cents = cents % 100;
        } else if (cents < 0) {
            dollars -= 1;
            cents += 100;
        }
    }
    
    // Accessor methods
    public int getDollars() {
        return dollars;
    }
    
    public int getCents() {
        return cents;
    }
    
    /**
     * Adds another Money amount to this one
     * @param other the Money amount to add
     * @return new Money object representing the sum
     */
    public Money add(Money other) {
        int totalDollars = this.dollars + other.dollars;
        int totalCents = this.cents + other.cents;
        return new Money(totalDollars, totalCents);
    }
    
    /**
     * Subtracts another Money amount from this one
     * @param other the Money amount to subtract
     * @return new Money object representing the difference
     */
    public Money subtract(Money other) {
        int totalDollars = this.dollars - other.dollars;
        int totalCents = this.cents - other.cents;
        return new Money(totalDollars, totalCents);
    }
    
    /**
     * Compares this Money object with another for equality - Task #2
     * @param obj the object to compare with
     * @return true if equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Money money = (Money) obj;
        return dollars == money.dollars && cents == money.cents;
    }
    
    /**
     *
     * @param other the Money object to compare with
     * @return negative if this < other, 0 if equal, positive if this > other
     */
    @Override
    public int compareTo(Money other) {
        if (this.dollars != other.dollars) {
            return this.dollars - other.dollars;
        }
        return this.cents - other.cents;
    }
    
    /**
     * Returns string representation of Money - Task #2
     * @return formatted string representation
     */
    @Override
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
}