package in.SpringCore.constructorDi.employee;

public class Employee {
    private Address address;
    private Salary salary;
    private Department department;

    public Employee(Address address, Salary salary, Department department){
        this.address=address;
        this.salary=salary;
        this.department=department;
    }


    public void getSalary(){
        System.out.println(salary.getSalary());
    }

    public void getDepartment(){
        department.getDepartment();
    }
    public void getAddress(){
        address.getAddress();
    }
}
