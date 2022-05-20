package com.ug11.channelsahamukdw;

public class Channel {
    private String email, namaDepan, namaBelakang;
    private int totalTag;

    public void login(String email) {
        try{
            if(!email.contains("@students.ukdw.ac.id")){
                throw new EmailException(1);
            }
            else {
                String[] tempEmail = email.split("@");
                String[] tempUsername = tempEmail[0].split("\\.");
                if (tempUsername.length != 2){
                    throw new EmailException(2);
                }
                else {
                    setNamaDepan(tempUsername[0].toUpperCase());
                    setNamaBelakang(tempUsername[1].toUpperCase());
                    setEmail(email);
                    System.out.println("Login berhasil!");
                }
            }
        }
        catch (EmailException e) {
            System.out.println("Error: " + e.getErrorMessage());
        }
    }

    public void bagikanIde(String ide){
        String tempSaham;
        int totalTag = 0;

        StringBuilder tag = new StringBuilder();
        String[] tempText = ide.split(" ");
        for (String checkText : tempText) {
            if (checkText.charAt(0) == '#') {
                tag.append(checkText).append(", ");
                totalTag += 1;
            }
        }

        if(totalTag == 0){
            tag.append("-");
            tempSaham = tag.toString();
        }
        else {
            String tempTag = tag.toString();
            tempSaham = tempTag.substring(0, tempTag.length()-2);
        }

        setTotalTag(totalTag);
        System.out.println("Ide: " + ide);
        System.out.println("Saham yang anda tag: " + tempSaham);
        System.out.println("Total saham Yang anda tag: " + totalTag);
    }

    public void printInfo(){
        System.out.println("Nama depan: " + getNamaDepan());
        System.out.println("Nama delakang: " + getNamaBelakang());
        System.out.println("Email: " + getEmail());
        System.out.println("Total Tag: " + getTotalTag());
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }

    public int getTotalTag() {
        return totalTag;
    }

    public void setTotalTag(int totalTag) {
        this.totalTag += totalTag;
    }
}
