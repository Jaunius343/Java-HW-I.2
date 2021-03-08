package com.company;
import java.util.Date;

class Product {
    private String name = "vardas";
    private float price;
    private Date expiration;

    public float getPrice() {return price;}
    public void setPrice(float x) {price = x;}

    public String getString() {return name;}
    public void setString(String temp) {name = temp;}

    public Date getExpiration() {return expiration;}
    public void setDate(Date date) {expiration = date;}

    public void println(){System.out.println(name + " " + price + "€ " + expiration);}

    public Product(){
        this("preke", 0, new Date());
    }

    public Product(String n, float p, Date d){
        name = n;
        price = p;
        expiration = d;
        this.number = nextNumber();
    }

    //su datos galiojimu. be argumentu - tikrina su dabar; jei duota data - su ta data;

    boolean isValidDate(){return expiration.after(new Date());}
    boolean isValidDate(Date date){return expiration.after(date);}

//    int priceCheck (int a) {if(price == a) return 0;
//                            else return 1;}
//    int priceCheck (float b) {return 1;}


    private static int lastNumber = 0;
    public static int getLastNumber() {return lastNumber;}
    private static int nextNumber() {return ++lastNumber;}

    private int number;
    public int getNumber(){return number;}


    public static final float convertRatio = 1.21F;

    public static void main(String[] args) {
	// write your code here
    }

}

public class Main{
    public static void main(String[] args){
        //(new Product()).println();
        Product p1 = new Product();
//        p1.getLastNumber();
//        Product.getLastNumber();
        p1.println();
        p1.setPrice(10);
        p1.setString("daikto pavadinimas");
        p1.println();
        System.out.println(p1.getNumber());
        Product p2 = new Product("daiktas2", 5, new Date(125, 10, 15));
        System.out.println(p2.getNumber());
        System.out.println(p2.getExpiration());
        if(p2.isValidDate()){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        Product p3 = new Product("daiktas3", 6, new Date(120, 5, 10));
        System.out.println(p3.getExpiration());
        if(p3.isValidDate(new Date(115))){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        System.out.println(p3.getNumber());
        System.out.println(p1.getPrice() * p1.convertRatio + "$");

    }
}