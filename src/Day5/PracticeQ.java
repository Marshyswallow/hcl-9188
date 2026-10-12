package Day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArraySet;

//create an arraylist of employee type and apply crud operation on the employee object use iterator
//and list iterator both to traverse the employees apart from these we need to iterate these employees
//on the decreasing and increasing order
public class PracticeQ {
    public static void main(String[] args){
        ArrayList<Employee> employees=new ArrayList<>();
        employees.add(new Employee("Vishal",4,2000));
        employees.add(new Employee("Satyam",2,5000));
        employees.add(new Employee("Ankit",1,6000));
        employees.add(new Employee("Shivansh",6,8000));
        employees.add(new Employee("Krishna",5,4000));

        ArrayList<Employee> empList2=new ArrayList<>();
        System.out.println(employees.toString());

        Collections.sort(employees,(a,b)->{
            return a.id-b.id;
        });

        System.out.println(employees.toString());

        Collections.sort(employees,(a,b)->{
            return b.id-a.id;
        });

        System.out.println(employees.toString());



        Iterator<Employee> it=employees.iterator();

        while(it.hasNext()){
            Employee e=it.next();
            System.out.println("id:"+e.id+" name "+e.name+" salary:"+e.salary);
        }


        ListIterator<Employee> it1= employees.listIterator();
        while(it1.hasNext()){
            Employee e=it1.next();
            System.out.println("id: "+e.id+" name: "+e.name+" salary: "+e.salary);
        }


    }
}

class Employee implements Comparable<Employee>{
    int id;
    String name;
    int salary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String toString(){
        return "Employee: "+id + " "+name+" "+salary;
    }

    @Override
    public int compareTo(Employee employee){
        return Integer.compare(this.id,employee.id);
    }

}