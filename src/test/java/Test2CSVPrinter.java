import org.junit.jupiter.api.*;

import java.io.IOException;

public class Test2CSVPrinter {

    count = 0
    @Test
    public void first() throws IOException{
        name = first
        printDetails(name)

    }
    @BeforeAll
    public static void second() throws IOException{
        System.out.println("second");
        getName(count)
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

    public void printCount(int count){
        System.out.println(count+"です");
    }
    public void getName(int count){
        count += 1
        //printDetalis(count)
    }
}
