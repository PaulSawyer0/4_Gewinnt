import java.util.ArrayList;

public class Game_Board {

    // *************
    // *Composition*
    // *************
    
    Row row;

    // ************
    // *Attributes*
    // ************
    
    ArrayList<Row> map = new ArrayList<Row>();

    public Game_Board(){
        this.row = new Row();
        // Game_Board has rows
    }

    public void Initialize_Empty_Board(int length, int width){
        // Setting 'y axis' by adding row objects to map list

        row.Add_Coloumns(width);
        
        for (int a = 0; a < length; ++a){
            map.add(row);
            // Add map object until requested length is reached
        }
    }
}
