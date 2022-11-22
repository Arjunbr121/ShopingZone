package com.tns.shopingzone;

public class ShopAcc {
    protected static int AccNo;
    protected static String accNm;
    private float charges;


    public int getAccNo() {
        return AccNo;
    }
    public void setAccNo(int accNo) {
        this.AccNo = AccNo;
    }
    public float getCharges() {
        return charges;
    }
    public void setCharges(float charges) {
        this.charges = charges;
    }
    public String getAccNm() {
        return accNm;
    }
    public void setAccNm(String accNm) {
        this.accNm = accNm;
    }

    //Constructor
    public ShopAcc(int AccNo, String accNm, float charges)
    {

        this.AccNo = AccNo;
        this.setAccNm(accNm);
        this.charges = charges;
    }
    public void bookProduct(float charges)
    {
        System.out.println("Product Which are booked and its charges are :"+charges);
    }
    public void items(float charges)
    {
        System.out.println("Items Which are  delivered and its charges are :"+charges);
    }
    @Override
    public String toString() {
        return "Shopping_Account Details:\nAccount Number-" + AccNo + "\nAccount Name-" + getAccNm() + " charges-" + charges ;
    }
}
