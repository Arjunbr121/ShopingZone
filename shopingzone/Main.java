package com.tns.shopingzone;

public class Main {

    public static void main(String[] args) {

        GSShopFactory GSSF = new GSShopFactory();
        GSSF.getNewPrimeAccount(013, "Arjun BR", 1500, false);
        GSSF.getNewNormalAccount(014, "Ramu", 2000, 60);
        GSPrimeAcc GSp = new GSPrimeAcc();
        GSp.getAccNm();
        GSp.getAccNo();
        GSp.getCharges();

        GSp.bookProduct(500);


        String val = GSp.toString();
        System.out.println(val);

        GSNormalAcc GSn = new GSNormalAcc();
        GSn.getAccNm();
        GSn.getAccNo();
        GSn.getCharges();
        GSn.getDeliveryCharge();


        GSn.bookProduct(1000);

        String val1=GSn.toString();

        System.out.println(val1);
        System.out.println("Thank you for using our service");
    }
}
