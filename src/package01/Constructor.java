package package01;

public class Constructor {
    public static void main(String [] args){
        Employee e1=new accountant(101,500);
        e1.shop();
        e1.parentShop();
    }
}

class  Employee{
    String name;
    int age;

    void shop(){
        System.out.println("this is veggy shop");
    }

    Employee(){
        this.name=name;
        this.age=age;
    }
}

class accountant extends Employee{
    int account;
    int bal;

    void shop(){
        System.out.println("this is accountant");
    }

    void parentShop(){
        super.shop();
    }

    accountant(int account,int bal){
        super();
        this.account=account;
        this.bal=bal;
    }
}
