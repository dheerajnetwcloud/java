package junit4;

import org.junit.*;

public class TestString {

    String str;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @Before
    public void before() {
        str = "Hello World";
        System.out.println("Before Test");
    }

    @Test
    public void test() {
        System.out.println("Inside Test");
        Assert.assertEquals("Hello World", str);
    }

    @Test
    public void test2() {
        System.out.println("Inside Test 2");
        Assert.assertEquals("Hello World".length(), str.length());
    }

    @After
    public void after() {
        str = null;
        System.out.println("After Test");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }
}
