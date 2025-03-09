package org.example;

public class DatabaseConnection {
    private static DatabaseConnection databaseObject;

    //private constructor
    private DatabaseConnection() {

    }

    //static method
    public static DatabaseConnection getInstance() {
        if(databaseObject == null)
            databaseObject = new DatabaseConnection();
        return databaseObject;
        }

        public void getDatabaseConnection() {
            System.out.println("Connected");
    }




}//end of class
