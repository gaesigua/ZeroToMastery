package exerciseCreateAClassBagWithATypeParameterAndCollection2;

import java.util.ArrayList;
import java.util.List;

public class Bag <T>{
    private List<T> content;

    public void content(){
        content = new ArrayList<>();
    }
    public void addItem(T item){

        content.add(item);
    }
    public void removeItem(T item){

        content.remove(item);
    }
    public List<T> getItems(){
        return content;
    }
}
