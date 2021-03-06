/**
 * Write a description of class Category here.
 *
 * @author (Zulkarnain Shah)
 * @version (a version number or a date)
 */
public class Category {
    private String name;
    private int min;
    private int max;

    public Category(String name,int min,int max){
        this.name = name;
        this.min = min;
        this.max = max;
    }
    
    public String toString(){
        return this.name;
    }
    
    public int getMin(){
        return this.min;
    }
    
    public int getMax(){
        return this.max;
    }
    
    public String getPluralName(){
        if(this.name.equals("topping")){
            return "toppings";
        }
        else{
            return this.name;
        }
    }
    
}
