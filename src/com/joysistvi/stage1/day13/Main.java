package com.joysistvi.stage1.day13;

public class Main  {
    static void main(String[] args) {

        Laptop laptop = new Laptop();

        laptop.brand = "Lenovo";
        laptop.color = "red";
        laptop.weightInKg = 1.0;
        laptop.cpu = "cpu";
        laptop.ramInGB = 1024;

        laptop.playGames();
        laptop.watchTutorial();
        laptop.sendEmail();
        laptop.writeCodes();

        Laptop laptop2 = new Laptop();

        laptop2.brand = "Hp";
        laptop2.color = "silver";
        laptop2.weightInKg = 1.0;
        laptop2.cpu = "cpu";
        laptop2.ramInGB = 1024;

        laptop2.playGames();
        laptop2.watchTutorial();
        laptop2.sendEmail();
        laptop2.writeCodes();


        Laptop laptop3 = new Laptop();

        laptop.brand = "Acer";
        laptop3.color = "blue";
        laptop3.weightInKg = 1.0;
        laptop3.cpu = "cpu";
        laptop3.ramInGB = 1024;

        laptop3.playGames();
        laptop3.watchTutorial();
        laptop3.sendEmail();
        laptop3.writeCodes();






    }
}
