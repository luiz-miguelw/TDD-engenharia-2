package entities;

class Money  {
   private int amount;
   
   private String currency;
   
   public Money(int amount, String currency) {
      this.amount = amount;
      this.currency = currency;
   }
   
   static Money dollar(int amount)  {
      return new Money(amount, "USD");
   }
   
   static Money franc(int amount) {
	   return new Money(amount, "CHF");
   }
   
   Money times(int multiplier) {
      return new Money(amount * multiplier, currency);
   }
   
   public int getAmount() {
	   return amount;
   }
   
   public String getCurrency() {
	   return currency;
   }
   
   public boolean equals(Object object) {
      Money money = (Money) object;
      return amount == money.amount && getCurrency().equals(money.getCurrency());
   }
}