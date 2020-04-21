package adapter;

import java.util.List;
import java.util.stream.Collectors;


public class CategoryMenuItemAdapter implements MenuItem {

    private Category category;

    private List<MenuItem> submenus;
    private int numberOfAllChildren;

    public CategoryMenuItemAdapter(Category category) {
        this.category = category;
        this.submenus = category.getSubcategories().stream().map(CategoryMenuItemAdapter::new).collect(Collectors.toList());
        this.numberOfAllChildren = submenus.size() + submenus.stream().mapToInt(MenuItem::numberOfAllChildren).sum();
    }

    @Override
    public List<MenuItem> getChildren() {
        return submenus;
    }

    @Override
    public String getName() {
        return category.getName();
    }

    @Override
    public int numberOfAllChildren() {
        return numberOfAllChildren;
    }
}
