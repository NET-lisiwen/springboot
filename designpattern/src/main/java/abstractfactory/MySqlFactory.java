package abstractfactory;

public class MySqlFactory implements IFactory {
    @Override
    public IUser CreteUser() {
        return new MySqlUser();
    }

    @Override
    public IDepartment CreateDepartment() {
        return new MySqlDepartment();
    }
}
