import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CSVPrinter{
    Reader in;
    public CSVPrinter(String fileName) throws FileNotFoundException{
        in =new FileReader(fileName);

    }
    public Iterable<CSVRecord> read() throws IOException{
        Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(this.in);
        return records;
    }

    public static void main(String[] args) throws IOException {
        CSVPrinter csvPrinter = new CSVPrinter("src/main/sample.csv");
        for(CSVRecord record:csvPrinter.read()){
            System.out.println(record.get(0));
        }
    }

}
