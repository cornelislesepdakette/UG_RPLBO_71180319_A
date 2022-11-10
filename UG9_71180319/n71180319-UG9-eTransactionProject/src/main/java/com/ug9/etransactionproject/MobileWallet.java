package com.ug9.etransactionproject;

public class MobileWallet extends DigitalPayment{
    private String noHp;
    private long feeTransferBank;

    public MobileWallet(String nama, long saldo, String noHp) {
        super(nama, saldo);
        this.noHp = noHp;
    }

    public void setFeeTransferBank(long feeTransferBank) {
        this.feeTransferBank = feeTransferBank;
    }

    public String getNoHp() {
        return noHp;
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        if(nominal < 0){
            System.out.println("Nominal yang anda input tidak valid!");
        } else if (getSaldo() < nominal) {
            System.out.println("Transfer gagal! saldo Anda tidak mencukupi.");
        } else {
            if(dp instanceof BNImo || dp instanceof BRImo){
                setSaldo(-(nominal+this.feeTransferBank));
            }else {
                setSaldo(-nominal);
            }
            dp.setSaldo(nominal);
            printBuktiTransfer(dp, nominal);
        }
    }
}