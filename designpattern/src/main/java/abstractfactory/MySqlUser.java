package abstractfactory;

public class MySqlUser implements IUser {
    @Override
    public void Insert(User user) {
        System.out.println("在MySql中给User表新增一条数据");
    }

    @Override
    public void GetUser(String id) {
        System.out.println("在MySql中根据id查询User表的一条数据");

    }
}
