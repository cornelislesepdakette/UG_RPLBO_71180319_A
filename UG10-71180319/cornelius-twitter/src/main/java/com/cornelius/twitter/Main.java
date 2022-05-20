package com.cornelius.twitter;

import javax.security.auth.login.LoginException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kegagalan = 0;
        boolean login = false;
        String username, password, bio, tweet;
        String usernameRegex = "^[A-Za-z]\\w{5,29}$", bioRegex = "[^a-zA-Z\\d@. ]";
        User user = new User("u71180319","p71180319");

        while(kegagalan < 4){
            kegagalan++;
            if(kegagalan == 4){
                System.out.println("Kamu gagal login 3x, program berhenti!");
                break;
            }
            else{
                //Username
                while (true){
                    System.out.print("Username: ");
                    username = scanner.nextLine();
                    try {
                        if(username.isEmpty()) {
                            throw new LoginException("username_kosong");
                        }
                        else{
                            break;
                        }
                    }
                    catch (LoginException e) {
                        System.out.println(e.getMessage());
                    }
                }
                //Password
                while(true){
                    System.out.print("Password: ");
                    password = scanner.nextLine();
                    try {
                        if(password.isEmpty()) {
                            throw new LoginException("password_kosong");
                        }
                        else{
                            break;
                        }
                    } catch (LoginException e) {
                        System.out.println(e.getMessage());
                    }
                }
                //Login
                try {
                    if(!username.equals(user.getUsername()) || !password.equals(user.getPassword())) {
                        throw new LoginException("input_salah");
                    }
                    else{
                        login = true;
                        break;
                    }
                }
                catch (LoginException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        //Masuk dan berhasil login
        if(login){
            System.out.println("Selamat datang di Twitter, " + user.getUsername());
            System.out.println("Kamu diminta untuk mengganti username, silakan masukan username kamu");

            while(true) {
                System.out.print("Username: ");
                username = scanner.nextLine();
                try {
                    Pattern pattern = Pattern.compile(usernameRegex);
                    Matcher userValidation = pattern.matcher(username);
                    if(username.isEmpty()) {
                        throw new UsernameExceptions("kosong");
                    }
                    else if(username.length() < 6) {
                        throw new UsernameExceptions("panjang");
                    }
                    else if(!userValidation.matches()) {
                        throw new UsernameExceptions("special_karakter");
                    }
                    else{
                        user.setUsername(username);
                        System.out.println("Username kamu berhasil diperbaharui, " + user.getUsername() + "!");
                        break;
                    }
                }
                catch (UsernameExceptions e) {
                    System.out.println(e.getMessage());
                }
            }

            System.out.println("Maaf, " + user.getUsername() + " kamu juga diminta untuk mengisi bio, silakan masukan bio kamu");
            while(true) {
                System.out.print("Bio: ");
                bio = scanner.nextLine();
                try {
                    Pattern pattern = Pattern.compile(bioRegex);
                    Matcher valid = pattern.matcher(bio);
                    if(bio.isEmpty()) {
                        throw new BioExceptions("kosong");
                    }
                    else if(bio.length() < 5 || bio.length() > 30) {
                        throw new BioExceptions("error_panjang");
                    }
                    else if(valid.find()) {
                        throw new BioExceptions("karakter_spesial");
                    }
                    else{
                        user.setBio(bio);
                        System.out.println("Bio kamu berhasil diperbaharui, " + user.getBio() + "!");
                        break;
                    }
                }
                catch (BioExceptions e) {
                    System.out.println(e.getMessage());
                }
            }

            System.out.println("Selamat, " + user.getUsername() + " kamu sudah dapat memposting tweet pertama kamu");
            while(true) {
                System.out.print("Tweet: ");
                tweet = scanner.nextLine();
                try {
                    if(tweet.isEmpty()) {
                        throw new TweetExceptions("kosong");
                    }
                    else if(tweet.length() < 8 || tweet.length() > 140) {
                        throw new TweetExceptions("error_panjang");
                    }
                    else{
                        System.out.println("@" + user.getUsername() + ": " + tweet);
                        break;
                    }
                }
                catch (TweetExceptions e) {
                    System.out.println(e.getMessage());
                }
            }

            System.out.println("\n");
            System.out.println("Username: " + user.getUsername());
            System.out.println("Password: " + user.getPassword());
            System.out.println("Bio: " + user.getBio());
        }
    }
}
