package utilities;

import java.util.List;
import java.util.LinkedList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CSV {
    // this method will read data from a CSV file andreturn as a list
    public static List<String[]> read(String file){
        //static can access without creating an object
        //each element will be an array
    List<String[]> data =new LinkedList<String[]>();
    
    //linked list easy to add array
    String dataRow;
        try{
            BufferedReader br= new BufferedReader(new FileReader(file));
           while((dataRow = br.readLine()) != null){//only read one line at a time
            String[] dataRecords = dataRow.split(",");
            data.add(dataRecords);
           }
        } catch(FileNotFoundException e){
            System.out.println("COULD NOT FIND FILE");
            e.printStackTrace();
        } catch (IOException e){
            System.out.println("COULD NOT READ FILE");
            e.printStackTrace();
        }
        return data;
    }
}
