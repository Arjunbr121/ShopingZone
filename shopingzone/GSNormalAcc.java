package com.tns.shopingzone;
import com.tns.shopingzone.NormalAcc;

public class GSNormalAcc extends NormalAcc{
    public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
        super(accNo, accNm, charges, deliveryCharge);
    }
    public GSNormalAcc() {
        super(AccNo, accNm, deliveryCharge, deliveryCharge);
    }
    public void bookProduct(float charges)
    {
        System.out.println("Hello Normal_user,Your Charges are: "+charges+"\nDelivery Charges is: "+deliveryCharge);
        System.out.println("Total:\t" + (charges+deliveryCharge));
    }
    @Override
    public String toString() {
        return "GSNormal Account Details are:\nAccount Number-" + getAccNo() + "\nAccount Name-"+getAccNm()+"\nCharges \t" + getCharges();
    }

}
