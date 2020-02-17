package staticfactorymethod;

import abstractfactory.*;

public class DataAccess {
    private final static String db="SQLSERVER";
//    private final static String db="MYSQL";
    public static IUser CreateUser(){
        IUser result =null;
        switch (db){
            case "SQLSERVER":
                result = new SqlServerUser();
                break;
            case "MYSQL":
                result= new MySqlUser();
                break;
        }
        return result;
    }

    public static IDepartment CreateDepartment(){
        IDepartment result =null;
        switch (db){
            case "SQLSERVER":
                result = new SqlServerDepartment();
                break;
            case "MYSQL":
                result= new MySqlDepartment();
                break;
        }
        return result;
    }
}
