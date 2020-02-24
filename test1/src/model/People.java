package model;

import java.io.PrintWriter;

public class People {
    private String idCard;
    private String name;
    private float height;
    private int old;

    public static int tuoi = 50; // truong static

    public People() {
    }
    //    public People(String idCard, String name, float height, int old) {
//        this.idCard = idCard;
//        this.name = name;
//        this.height = height;
//        this.old = old;
//    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getOld() {
        return old;
    }

    public void setOld() {
        old = tuoi;
        tuoi++;
    }
    public void showInfo(){
        String infor = "Full Name: " + name + "\nID" + getIdCard();
        System.out.println(infor);
    }
}
