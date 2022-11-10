package com.ug9.etransactionproject;

public class MobileBanking extends DigitalPayment {
    private boolean checkFee = false;
    private long feeAntarBank = 6000;
    private String noRekening;

    public MobileBanking(String nama, long saldo, String noRekening) {
        super(nama, saldo);
        this.noRekening = noRekening;
    }

    public String getNoRekening() {
        return noRekening;
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        if(nominal<0){
            System.out.println("Nominal yang anda input tidak valid");
        }else if (getSaldo()<nominal){
            System.out.println("Transfer gagal! Saldo Anda tidak mencukupi");
        }else{
            if(isCheckFee() == true){
                setSaldo(-(nominal+this.feeAntarBank));
            }else {
                setSaldo(-nominal);
            }
            dp.setSaldo(nominal);
            printBuktiTransfer(dp,nominal);
        }
    }

    public boolean isCheckFee(){
        return checkFee;
    }

    public void setCheckFee(boolean checkFee) {
        this.checkFee = checkFee;
    }
}