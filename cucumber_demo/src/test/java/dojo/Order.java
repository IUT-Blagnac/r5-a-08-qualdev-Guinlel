package dojo;

import java.util.ArrayList;
import java.util.List;

public class Order {

    String owner;
    List<String> cocktailsOrdered = new ArrayList<>();
    String target;
    public void declareOwner(String owner) {
        this.owner = owner;
    }

    public void declareTarget(String target) {
        this.target = target;
    }

    public List<String> getCocktails() {
        return cocktailsOrdered;
    }
}
