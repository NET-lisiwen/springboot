package reflex;

import abstractfactory.Department;
import abstractfactory.IDepartment;
import abstractfactory.IUser;
import abstractfactory.User;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Department department = new Department();

        IUser iu = DataAccess.CreateUser();
        iu.Insert(user);
        iu.GetUser("1");

        IDepartment id = DataAccess.CreateDepartment();
        id.insert(department);
        id.getDepartmentById("1");
    }

}
