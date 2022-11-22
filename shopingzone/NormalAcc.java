package com.tns.shopingzone;

public class NormalAcc extends ShopAcc{

    protected static float deliveryCharge=100;

    public NormalAcc(int AccNo, String accNm, float charges, float deliveryCharge)
    {
        super(AccNo, accNm, charges);
        NormalAcc.deliveryCharge = deliveryCharge;
    }
    public void bookProduct(float deliveryCharge)
    {
        System.out.println("The Charges are:"+ deliveryCharge);
    }
    @Override
    public String toString() {
        return "The Normal Account Details are:\nAccount Number-\t" + getAccNo() + "\nAccount Name-\t"+accNm+"\nCharges-\t" + getCharges();
    }
    public float getDeliveryCharge() {
        return deliveryCharge;
    }
}
