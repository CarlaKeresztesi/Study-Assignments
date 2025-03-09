package org.example;


public class Main {
    public static void main(String[] args) {
        DatabaseConnection MySQL;
        MySQL=DatabaseConnection.getInstance();
        MySQL.getDatabaseConnection();


        }
    }
