import java.util.ArrayList;
import java.util.List;

public class Row {
 List<Integer> coloumns = new ArrayList<Integer>();    

    public void Add_Coloumns(int width){
        // Setting 'x axis' by adding 0 to int list
        
        for (int a = 0; a < width; ++a){
            coloumns.add(0);
            // Add 0 until requested width is reached
        }

    }
}
