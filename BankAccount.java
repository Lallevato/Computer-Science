package edu.arapahoe.CSC160;

public class BankAccount {

    private int accountNumber = 0000;
    private int funds = 0;
    private String name = "none";
    private String email = "none";
    private int phone = 0000000000;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public void setFunds(int funds){
        this.funds = funds;
    }
    public int getFunds(){
        return this.funds;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setPhone(int phone){
        this.phone = phone;
    }
    public int getPhone(){
        return this.phone;
    }
    public void depositFunds(int x){
        this.funds = funds + x;
    }
    public void withdrawFunds(int x){
        if (x > this.funds){
            System.out.println("Insufficient funds.");
        }
        else {
            this.funds = funds - x;
        }
    }
}
