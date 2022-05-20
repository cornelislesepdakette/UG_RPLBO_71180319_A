package com.cornelius.twitter;

public class UsernameExceptions extends Exception{
    private String message,code;

    public UsernameExceptions(String code) {
        setCode(code);
        switch (getCode()){
            case "kosong" -> setMessage("Maaf, username tidak boleh kosong!");
            case "panjang" -> setMessage("Maaf, username minimal harus terdiri dari 6 karakter");
            case "special_karakter" -> setMessage("Maaf, username hanya boleh mengandung huruf,angka,dan _(underscore)");
            default -> setMessage("Input code salah");
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
