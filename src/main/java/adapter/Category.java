package adapter;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private List<Category> subcategories;

    public Category(String name, List<Category> subcategories) {
        this.name = name;
        this.subcategories = subcategories;
    }

    public Category(String name) {
        this.name = name;
        this.subcategories = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Category> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<Category> subcategories) {
        this.subcategories = subcategories;
    }
}
