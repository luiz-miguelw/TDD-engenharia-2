package entities;

public class Money  {
   protected int amount;
   
   public Money (int amount) {
      this.amount= amount;
   }
   
   public int getAmount() {
	   return amount;
   }
   
   public boolean equals(Object object)  {
      Money money = (Money) object;
      return amount == money.amount;
   }   
}