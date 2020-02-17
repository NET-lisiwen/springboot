package staticfactorymethod;

import abstractfactory.*;

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
