package edu.ru.exercise02;

/**
 *
 * @author upall
 */
public class ShoppingItems {

    private String name;
    private ShoppingStatus status;
    
    public ShoppingItems(String name, ShoppingStatus status) {
        this.name = name;
        this.status = status;
    }
    
    public ShoppingItems(String name){
        this.name = name;
        this.status = ShoppingStatus.LISTED;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShoppingStatus getStatus() {
        return status;
    }

    public void setStatus(ShoppingStatus status) {
        this.status = status;
    }
    
    public void display(){
        System.out.println(this.name + "\t\t" + this.status);
        
    }
    
}
