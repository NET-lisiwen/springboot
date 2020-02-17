package reflex;

import abstractfactory.*;
import org.springframework.beans.factory.annotation.Value;
import sun.rmi.runtime.Log;

import java.util.logging.Logger;

public class DataAccess {
    private final static String AssembleName="abstractfactory";
    private final static String db="SqlServer";
//    private static String db="Mysql";
    public static IUser CreateUser(){
        IUser result =null;
        String className=AssembleName+"."+db+"User";
        try{
            Class clz = Class.forName(className);
            result = (IUser)clz.newInstance();
        }catch (Exception e){
        }
        return result;
    }

    public static IDepartment CreateDepartment(){
        IDepartment result =null;
        String className=AssembleName+"."+db+"Department";
        try{
            Class clz = Class.forName(className);
            result = (IDepartment)clz.newInstance();
        }catch (Exception e){
        }
        return result;
    }
}
