package main;
import bank.BankAccount;

import inventory.Product;
import inventory.Inventory;
import inventory.Warehouse;

public class Main{
    public static void main(String[] args) {

        //Let's create an instance for the first exercise: Basic Bank Account and Set some values

//        BankAccount bankAccount = new BankAccount();
//
//        bankAccount.accountHolder = "gaesigua tin";
//        bankAccount.accountNumber = 123456789;
//        bankAccount.balance = 350.0;


        //Let's create instances for the second exercise (Product Inventory)

        Inventory inventory = new Inventory();
        Product product = new Product();
        Warehouse warehouse = new Warehouse();

        //Let's set some values for the "Product" class

        product.productId = 1;
        product.productName = "Samsung";
        product.price = 240.0;

        //Let's set some values for the "Inventory" clas

        inventory.quantity = 83;

        //Let's set some values for the "Warehouse" class

        warehouse.warehouseId = 2020;
        warehouse.warehouseName = "Kigali Warehouse";
        warehouse.inventories = "Placeholder"; // we will create an ArrayList later on that holds the inventories

        //Let's print out all the values of the fields for the first exercise

//        System.out.println("The Account Holder: " + bankAccount.accountHolder);
//        System.out.println("The Account Number: " + bankAccount.accountNumber);
//        System.out.println("The Account Balance: " + bankAccount.balance);

        //Let's print out all the values of the fields for the second exercise

        System.out.println("The Product ID: " + product.productId);
        System.out.println("The Product Name: " + product.productName);
        System.out.println("The Product Price: " + product.price);

        System.out.println("The Quantity in the inventory: " + inventory.quantity);

        System.out.println("The Warehouse ID: " + warehouse.warehouseId);
        System.out.println("The Warehouse Name: " + warehouse.warehouseName);
        System.out.println("The Warehouse Inventories: " + warehouse.inventories);


    }
}
