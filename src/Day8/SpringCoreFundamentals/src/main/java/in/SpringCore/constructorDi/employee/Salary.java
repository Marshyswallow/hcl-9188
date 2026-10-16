package in.SpringCore.constructorDi.employee;

public class Salary {
    private double basic;
    private double da;
    private double hra;

    public Salary(){
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public void setDa(double da) {
        this.da = da;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public double getSalary(){
        return da+hra+basic;
    }
}
