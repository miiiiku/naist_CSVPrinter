import org.junit.jupiter.api.*;

import java.io.IOException;

public class Test2CSVPrinter {
    @Test
    public void one() throws IOException{
        System.out.println("one");
    }
    @BeforeAll
    public static void two() throws IOException{
        System.out.println("two");
    }
    @AfterAll
    public static void three() throws IOException{
        System.out.println("three");
    }
    @BeforeEach
    public void four() throws IOException{
        System.out.println("four");
    }
    @AfterEach
    public void five() throws IOException{
        System.out.println("fivve");
    }
    @Test
    public void six() throws IOException{
        System.out.println("six");
    }
}
