package entities;

abstract class Money  {
   protected int amount;
   
   public Money (int amount) {
      this.amount= amount;
   }
   
   static Dollar dollar(int amount)  {
      return new Dollar(amount);
   }
   
   static Money franc(int amount) {
	   return new Franc(amount);
   }
   
   abstract Money times(int multiplier); 
   
   public int getAmount() {
	   return amount;
   }
   
   public boolean equals(Object object)  {
      Money money = (Money) object;
      return amount == money.amount && getClass().equals(money.getClass());
   }   
}