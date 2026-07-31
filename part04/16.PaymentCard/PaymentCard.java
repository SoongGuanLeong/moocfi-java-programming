public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        // write code here
        this.balance = openingBalance;
    }

    public void eatAffordably() {
        // write code here
        if (this.balance >= 2.6) {
            this.balance -= 2.6;
        }
    }

    public void eatHeartily() {
        // write code here
        if (this.balance >= 4.6) {
            this.balance -= 4.6;
        }
    }

    public void addMoney(double amount) {
        // write code here
        if (amount < 0) {
            return;
        }
        if (this.balance + amount > 150.0) {
            this.balance = 150.0;
        } else {
            this.balance += amount;
        }
    }

    public String toString() {
        // write code here
        return "The card has a balance of " + this.balance + " euros";
    }
}
