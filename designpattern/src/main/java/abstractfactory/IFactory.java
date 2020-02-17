package abstractfactory;

public interface IFactory {
    IUser CreteUser();
    IDepartment CreateDepartment();
}
