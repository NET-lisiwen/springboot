package abstractfactory;

import com.sun.xml.internal.bind.v2.model.core.ID;
import jdk.nashorn.internal.ir.IfNode;

public class Main {
    public static void main(String[] args) {
        User user =new User();
        Department department=new Department();

        IFactory factory =new SqlServerFactory();
        IUser iu=factory.CreteUser();
        iu.Insert(user);
        iu.GetUser("1");

        IDepartment id = factory.CreateDepartment();
        id.insert(department);
        id.getDepartmentById("1");
    }
}
