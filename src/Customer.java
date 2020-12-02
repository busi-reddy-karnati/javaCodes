/*
* This is a sample for creating
* */
public class Customer {
    int custId;
    String custName;
    void setValues(){
        custId=101;
        custName="SRK";

    }
    void displayValues(){
        System.out.println("Cust ID: "+custId);
        System.out.println("Cust Name: "+custName);
    }
    //We can create a self object
    public static void main(String args[]){
        Customer c1=new Customer();
        c1.setValues();
        c1.custName="SALK";
        //We are able to change it coz this is public class and also we are in the same file
        c1.displayValues();
    }

}
