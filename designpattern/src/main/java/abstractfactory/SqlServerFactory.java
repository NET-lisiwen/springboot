package abstractfactory;

public class SqlServerFactory implements IFactory {
    @Override
    public IUser CreteUser() {
        return new SqlServerUser();
    }

    @Override
    public IDepartment CreateDepartment() {
        return new SqlServerDepartment();
    }
}
