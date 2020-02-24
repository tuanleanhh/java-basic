package OOP;

import java.util.Date;
import java.math.*; //.* la cu phap import het cac goi trong package math

/*
        Package trong Java:
            - package la gi
            - package dung lam gi: tranh xung dot ten giua cac class
            - tao package nhu nao
            - vi du chi tiet
 */
public class Bai48Package {
    public static void main(String[] args) {
        Date date = new Date(); //trong package import java.util.Date
        java.sql.Date date1 = new java.sql.Date(1000);

    }
}
