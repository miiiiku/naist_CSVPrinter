import org.apache.commons.csv.CSVRecord;
import org.junit.jupiter.api.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;



    //@BeforeAll
//    public static void read() throws IOException{
//        CSVPrinter printer =  new CSVPrinter("src/main/sample.csv");
//        it = new ArrayList<>();
//        for (CSVRecord r:printer.read()) {
//            it.add(r);
//        }
//    }

public class TestCSVPrinter{
    csvtemp = "src/main/sample.csv"

    @Test
    public void testReadFile() throws IOException{
        //レポジトリ開いてます
        CSVPrinter printer =  new CSVPrinter(csvtemp);
        ArrayList<CSVRecord> it;
        it = new ArrayList<>();
        for (CSVRecord r:printer.read()) {
            it.add(r);
        }
        int size = 0;
        for(CSVRecord r: it){
            size++;
        }
        Assertions.assertEquals(2,size);
    }
    @Test
    public void testSplit() throws IOException{

        CSVPrinter printer =  new CSVPrinter(csvtemp);
        ArrayList<CSVRecord> it;
        it = new ArrayList<>();
        for (CSVRecord r:printer.read()) {
            it.add(r);
        }
        int count =0;
        String[] line= new String[5];

        for(CSVRecord r: it) {
            for (int i = 0; i < r.size(); i++) {
                line[count++] = r.get(i);
            }
        }

        String[] check = {"aaa","aaaa","aaa","bbb","bbb"};
        for(int i = 0; i<5; i++){
            Assertions.assertEquals(line[i],check[i]);
        }
    }

    @Test
    public void testfileisnot() throws IOException{
        Assertions.assertThrows(FileNotFoundException.class,() -> {
            CSVPrinter printer = new CSVPrinter(csvtemp);
        });

    }


}