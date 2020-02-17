package abstractfactory;

public class MySqlDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在MySql中给department表新增一条数据");
    }

    @Override
    public Department getDepartmentById(String id) {
        System.out.println("在MySql中根据id查询department表的一条数据");
        return null;
    }
}
