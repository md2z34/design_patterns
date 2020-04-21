package adapter;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class CategoriesToMenuAdapterTest {

    @Test
    public void testAdapter() {
        Category category = new Category("Számítástechnika",
                Arrays.asList(new Category("Notebook és kiegészítők",
                                Arrays.asList(new Category("Notebook"),
                                        new Category("Kiegészítők"),
                                        new Category("2 in one"))),
                        new Category("Asztali számítógép"),
                        new Category("Perifériák",
                                Arrays.asList(new Category("Monitor"), new Category("Nyomtató")) )));

        MenuItem root = new CategoryMenuItemAdapter(category);

        assertEquals("Számítástechnika", root.getName());
        assertEquals(8, root.numberOfAllChildren());

        assertEquals("Kiegészítők", root.getChildren().get(0).getChildren().get(1).getName());
        assertEquals(0, root.getChildren().get(0).getChildren().get(1).numberOfAllChildren());
        assertEquals("Monitor", root.getChildren().get(2).getChildren().get(0).getName());
    }
}
