package com.tns.shopingzone;
import com.tns.shopingzone.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{
    public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges, isPrime);
    }

    //fields
    private static final float charges=0;

    //methods
    public float getCharges() {
        return charges;
    }
    public GSPrimeAcc()
    {
        super(AccNo, accNm, charges, isPrime);
    }
    public void bookProduct(float charges)
    {
        System.out.println("Hello Prime_user,Your Product Charges are: "+charges);
    }
    @Override
    public String toString() {
        return "GSPrime Account Details are:nAccount Number-"+"013"+"\nAccount holder Name-"+"Arjun BR"+"\nDelivery charges\t"+charges;
    }
}
