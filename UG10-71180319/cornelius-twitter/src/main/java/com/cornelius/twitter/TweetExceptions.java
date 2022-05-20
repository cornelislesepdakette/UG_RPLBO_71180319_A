package com.cornelius.twitter;

public class TweetExceptions extends Exception {
    private String message,code;

    public TweetExceptions(String code) {
        setCode(code);
        switch(getCode()){
            case "kosong" -> setMessage("Maaf, username tidak boleh kosong!");
            case "error_panjang" -> setMessage("Maaf, tweet minimal harus terdiri dari 8 karakter dan maksimal 140 karakter");
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
