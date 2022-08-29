import org.junit.jupiter.api.*;

import java.io.IOException;

public class Test2CSVPrinter {
    @Test
    public void first() throws IOException{
        name = first
        printDetails(name)

    }
    @BeforeAll
    public static void second() throws IOException{
        System.out.println("second");
    }
    @AfterAll
    public static void third() throws IOException{
        System.out.println("third");
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

    public void printDetails(string name){
        System.out.println(name+"です");
    }
}
