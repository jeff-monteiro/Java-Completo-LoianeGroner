package src.start.labs.bank.entities;

public class Account {
        private Integer number;
        private String holder;
        private double balance;

        public Account(int number, String holder){
            this.number = number;
            this.holder = holder;
        }

        public Account(int number, String holder, double balance){
            this.number = number;
            this.holder = holder;
            this.balance = balance;
        }

        public int getNumber(){
            return number;
        }

        public String getHolder(){
            return holder;
        }

        public void setHolder(String holder){
            this.holder = holder;
        }

        public double getBalance(){
            return balance;
        }

        public void deposit(double amount){
            balance += amount;
        }

        public void withdraw(double amount){
            balance -= amount + 5.0;
        }
}
