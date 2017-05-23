package structural.adapter;

// Adapter pattern says convert the one interface of a  class to another interface according to the client requirements.
// In other words, to provide the interface according to client requirement while using the services of a class with a different interface.
// There are following things;
// Target interface_--main interface
//adapter: implments the target interface
// adaptee: used the by adapter

//Advantages: reusable function.


public interface CreditCard {  
    public void giveBankDetails();  
    public String getCreditCard();  
}
