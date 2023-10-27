import java.util.ArrayList;

public class Game_Board {

    // ************
    // *Attributes*
    // ************
    
    ArrayList<Row> map = new ArrayList<Row>();
    
    // *************
    // *Composition*
    // *************

    Comparison comp;
    Input input;

    public Game_Board(){
        this.comp = new Comparison();
        this.input = new Input();
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

    public void Print_Coloumn_Header(int width){

        for (int a = 1; a <= width; ++a){
            if (a < width){
                System.out.print("| " + a  + " ");
                // Print first - second to last coloumn
            }

            else if (a == width) {
                System.out.print("| " + a + " |");
                // Print last coloumn
            }
        }
    }

    public void Print_Row_Coloumn(Game_TUI game_TUI){

        for (Row row : game_TUI.game_board.map){
            int index = 0;
            System.out.println();
            for (int coloumn : row.coloumns){
                ++index;
                // index of coloumns list

                if (index < row.coloumns.size()){
                    System.out.print("| " + coloumn + " ");
                }

                else if (index == row.coloumns.size()){
                    System.out.print("| " + coloumn + " |");
                }
            }
        }
    }
}
