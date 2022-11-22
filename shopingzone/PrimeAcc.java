package com.tns.shopingzone;
import java.util.Scanner;
public class PrimeAcc extends ShopAcc{
    public static boolean isPrime;

    public PrimeAcc(int AccNo, String accNm, float charges, boolean isPrime)
    {
        super(AccNo, accNm, charges);
        this.setPrime(isPrime);
    }
    public void bookProduct(float charges)
    {
        System.out.println("The Charges are: "+charges);
    }
    @Override
    public String toString() {
        return "The PrimeAccount Details are:\nAccount Number-\t" + getAccNo() + "\nAccount Name-\t"+accNm+"\ncharges-\t" + getCharges();

    }
    public boolean isPrime() {
        return isPrime;
    }
    public void setPrime(boolean isPrime) {
        this.isPrime = isPrime;
    }

}
