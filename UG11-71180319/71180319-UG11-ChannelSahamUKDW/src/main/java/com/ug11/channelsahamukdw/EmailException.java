package com.ug11.channelsahamukdw;

public class EmailException extends Exception{
    private String errorMessage;
    private int errorCode;

    public EmailException(int errorCode) {
        setErrorCode(errorCode);
        if(getErrorCode() == 1){
            setErrorMessage("login gagal! email Anda tidak terdaftar dalam ukdw.");
        }
        else if(getErrorCode() == 2){
            setErrorMessage("login gagal! Email ukdw Anda tidak valid.");
        }
    }



    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}
