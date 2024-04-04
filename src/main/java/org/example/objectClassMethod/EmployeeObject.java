package org.example.objectClassMethod;

public class EmployeeObject implements Cloneable{

    private int id;

    public Address getAddress() {
        return address;
    }

    private Address address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeObject(int id, String name,Address address) {
        this.id = id;
        this.name = name;
        this.address= address;
    }

    private String name;


    @Override
    public String toString() {
        //return super.toString();

        return("Employee's id is : "+id+" and name is : "+name+" and address is: "+address);
    }

     @Override
    public int hashCode() {
       // return super.hashCode();
        return id;
    }


    // without overriding it only compares the references , we can override it to compare the content
    @Override
    public boolean equals(Object obj) {
        EmployeeObject emp= (EmployeeObject) obj;
        if(name.equals(emp.getName()) && id==emp.getId())
        {
            return true;
        }
        else {
            return false;
        }
       //return super.equals(obj);

    }
    /*
    @Override
    protected void finalize() throws Throwable {
       // super.finalize();
        try{
            System.out.println("Called from finalize method");
        }
        catch (Throwable e)
        {
            throw e;
        }
        finally {
            System.out.println("Called from finally block of the finalize method");
            super.finalize();
        }
    }

     */


    //creates the shallow copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        //overriding for deep cloning
      Address addr= new Address(address.getHouseNo(),address.getCity());
      EmployeeObject emp= new EmployeeObject(id,name,addr);
      return emp;
    }


    public static void main(String[] args) throws Throwable
    {
        Address addr1= new Address(401,"Pune");
        Address addr2=new Address(804,"Gurugram");
        EmployeeObject emp1=new EmployeeObject(1,"Surila",addr1);
        System.out.println(emp1.toString());
        System.out.println("Employee's hashcode is : "+emp1.hashCode());
        EmployeeObject emp2=new EmployeeObject(2,"Ashish",addr1);
        EmployeeObject emp3=new EmployeeObject(1,"Surila",addr2);
        EmployeeObject emp4=emp1;
        System.out.println("Is Employee1 is equals to employee2 ?"+emp1.equals(emp2));
        System.out.println("Is Employee1 equals employee3 ? "+emp1.equals(emp3));
        System.out.println("Is Employee1 equals employee3 ? "+emp1.equals(emp4));
        System.out.println("Class name of employee object is :"+emp1.getClass().getName());
      //  emp1.finalize();

        //cloning
        EmployeeObject emp5= (EmployeeObject) emp1.clone();
        emp1.name="Surila Moharana";
        emp1.id=11;
        Address address1=new Address(1801,"Mumbai");
        emp1.address=address1;

        //after cloning the changed value in the main object doesnot affect the cloned object, hence this shallow cloning
        System.out.println("original object after changing values : "+emp1+"cloned object : "+emp5);

        //so if our class has only primitive member variables then we can go for shallow cloning, but if our class has reference variable
        //then the change in main will also affect the reference variable in the cloned copy while the primitive fields will remain
        //unchanged , hence we need to go for deep cloning




    }
}
