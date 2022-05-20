package com.cornelius.twitter;

public class LoginExceptions extends Exception{
    private String message,code;

    public LoginExceptions(String code) {
        setCode(code);
        switch(getCode()){
            case "username_kosong" -> setMessage("Maaf, silakan masukan username!");
            case "password_kosong" -> setMessage("Maaf, silakan masukan password!");
            case "input_salah" -> setMessage("Maaf, username atau password salah! Silakan coba lagi!");
            default -> setMessage("kode input salah");
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
