package com.cornelius.twitter;

public class BioExceptions extends Exception{
    private String message,code;

    public BioExceptions(String code) {
        setCode(code);
        switch(getCode()){
            case "kosong" -> setMessage("Maaf, bio tidak boleh kosong!");
            case "error_panjang" -> setMessage("maaf, bio minimal harus terdiri dari 5 karakter dan maksimal 30 karakter");
            case "karakter_spesial" -> setMessage("Maaf, bio tidak boleh mengandung karakter spesial selain titik, et (@), serta spasi");
            default -> setMessage("input code salah");
        }
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
