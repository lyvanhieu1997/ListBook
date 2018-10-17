/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

import java.util.Scanner;

/**
 *
 * @author hieu
 */
public class Book {
    public String ID;
    public String name;
    public double price;

    public Book(){}

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public Book(String ID,String name,double price){
                this.ID=ID;
                this.name=name;
                this.price= price;
    }
    public void showInfo(){
        System.out.printf("%-20s %-20s %-20s \n",this.getID(),this.getName(),this.getPrice());
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID :");
        ID = sc.nextLine();
        System.out.println("Nhap Name :");
        name = sc.nextLine();
        System.out.println("Nhap gia tien :");
        price = sc.nextDouble();
        this.setID(ID);
        this.setName(name);
        this.setPrice(price);
    }
}
