package in.SpringCore.constructorDi.Employee;

public class Salary {
    private double basic;
    private double da;
    private double hra;

    public Salary(){};

    public double getBasic() {
        return basic;
    }

    public double getDa() {
        return da;
    }

    public double getHra() {
        return hra;
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
