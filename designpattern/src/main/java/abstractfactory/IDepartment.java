package abstractfactory;

/**
 *
 */
public interface IDepartment {
    void insert(Department department);

    Department getDepartmentById(String id);
}
