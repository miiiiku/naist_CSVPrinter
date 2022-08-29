import org.junit.jupiter.api.*;

import java.io.IOException;

public class Test2CSVPrinter {

    count = 0
    @Test
    public void first() throws IOException{
        name = first
        printDetails(name)
        second()

    }
    @BeforeAll
    public static void second() throws IOException{
        System.out.println("second");
        getName(count)
        third()
    }
    @AfterAll
    public static void third() throws IOException{
        System.out.println("third");
        four()
    }
    @BeforeEach
    public void four() throws IOException{
        System.out.println("four");
        five()
    }
    @AfterEach
    public void five() throws IOException{
        System.out.println("fivve");
        six()
    }
    @Test
    public void six() throws IOException{
        System.out.println("six");
    }

    public void printDetails(string name){
        System.out.println(name+"です");
    }

    public void getName(int count){
        count += 1
        printDetalis(str(count))
    }
}
