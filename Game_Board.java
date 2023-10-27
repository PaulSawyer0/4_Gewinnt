import java.util.ArrayList;

public class Game_Board {

    // ************
    // *Attributes*
    // ************
    
    ArrayList<Row> map = new ArrayList<Row>();
    Comparison comp;

    public Game_Board(){
        this.comp = new Comparison();
        //Game board has comparison
    }

    public void Initialize_Empty_Board(int length, int width){
        // Setting 'y axis' by adding row objects to map list

                for (int a = 0; a < length; ++a){
            // 1.  Create new row instance
            // 2.  Fill coloumns of row with 0
            // 3.  Add row to map
            // 4.  Create new object in next iteration

            Row new_row = new Row();
            new_row.Add_Coloumns(width);
            map.add(new_row);
        }
    }
}
