package by.academy;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    private static List<Integer> list;

    @BeforeClass
    public static void initiateList() {
        System.out.println("Initiate array list");
        list = new ArrayList<>();
    }

    @AfterClass
    public static void destruct() {
        list = null;
        System.out.println("Kill list");
    }

    @Before
    public void addValues() {
        System.out.println("Add values");
        list.add(1);
        list.add(2);
        list.add(3);
    }

    @After
    public void cleanList() {
        list.clear();
        System.out.println("List cleared");
    }

    @Test
    public void testListNotNull() {
        Assert.assertNotNull(list);
    }

    @Test
    @Ignore
    public void testListSizeZero() {
        Assert.assertEquals(0, list.size());
    }
}
