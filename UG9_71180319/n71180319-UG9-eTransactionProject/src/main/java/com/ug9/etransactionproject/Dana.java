package com.ug9.etransactionproject;

public class Dana extends MobileWallet{
    public long danaFeeTransferBank = 1000;

    public Dana(String nama, long saldo, String noHp) {
        super(nama, saldo, noHp);
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        setFeeTransferBank(danaFeeTransferBank);
        if(dp instanceof Ovo){
            System.out.println("Akun DANA tidak valid!");
        }else {
            super.transfer(dp, nominal);
        }
    }
}