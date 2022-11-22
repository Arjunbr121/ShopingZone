package com.tns.shopingzone;
import com.tns.shopingzone.NormalAcc;
import com.tns.shopingzone.PrimeAcc;
import com.tns.shopingzone.ShopAcc;
import com.tns.shopingzone.ShopFactory;

public class GSShopFactory implements ShopFactory{
    @Override
    public GSPrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isSalaried)
    {
        GSPrimeAcc gsp = new GSPrimeAcc();
        return gsp;
    }

    @Override
    public GSNormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharges)
    {
        GSNormalAcc gsn = new GSNormalAcc(AccNo, accNm, charges, deliveryCharges);
        return gsn;
    }

}
