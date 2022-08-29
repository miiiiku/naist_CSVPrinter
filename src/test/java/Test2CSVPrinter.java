import org.junit.jupiter.api.*;

import java.io.IOException;

public class Test2CSVPrinter {
    name = 'first'
    count = 0
    second()
    @Test
    public void first() throws IOException{

        printDetails(name)
        second()
    }
    @BeforeAll
    public static void second() throws IOException{
        System.out.println("second");
        name = 'one'
        count = getName(count,name)
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

    public void getName(int count,string name){

        countcheck = count %4
        bool namecheck = "False"
        if (name == "one") {
            namecheck = "True"
        }
        if(countcheck && namecheck){
            System.out.println("iine");
        }
        printDetalis(str(count))
        count +=1
        return count
    }
}
