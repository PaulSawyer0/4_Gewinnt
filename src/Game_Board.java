import java.util.ArrayList;

public class Game_Board {

    // ************
    // *Attributes*
    // ************
    
    ArrayList<Row> map = new ArrayList<Row>();
    int length;
    int width;
    int win_condition;
    boolean match_over; 
    
    // *************
    // *Composition*
    // *************

    Comparison comp;
    Input input;

    public Game_Board(){
        this.comp = new Comparison();
        this.input = new Input();
        this.match_over = false;
    }

    public void Winner_Notification(Game_TUI game_tui){
        try{
        switch (game_tui.lang_int) {
            case 1:
                System.out.println("\nCongratulations, you have won!");
                break;
        
            case 2:
                System.out.println("\nGratuliere, sie haben gewonnen!");
                break;
        }
    }
        catch( java.lang.ArithmeticException LangNotDefined){}
    }
    public void Game_Board_Config(Game_TUI game_tui){
        // Set width, length of map
        switch (game_tui.difficulty) {
            case 3:
                game_tui.game_board.length = 4;
                game_tui.game_board.width = 5;
                game_tui.game_board.win_condition = 3;
                break;
        
            case 4:
                game_tui.game_board.length = 5;
                game_tui.game_board.width = 6;
                game_tui.game_board.win_condition = 4;
                
                break;
            case 5:
                game_tui.game_board.length = 6;
                game_tui.game_board.width = 7;
                game_tui.game_board.win_condition = 5;
                
                break;
            default:
                break;
        }
    }

    public void Initialize_Empty_Board(Game_TUI game_tui){
        // Setting 'y axis' by adding row objects to map list

                for (int a = 0; a < game_tui.game_board.length; ++a){
            // 1.  Create new row instance
            // 2.  Fill coloumns of row with 0
            // 3.  Add row to map
            // 4.  Create new object in next iteration

            Row new_row = new Row();
            new_row.Add_Coloumns(game_tui);
            map.add(new_row);
        }
    }

    public void Print_Coloumn_Header(Game_TUI game_tui){

        for (int a = 1; a <= game_tui.game_board.width; ++a){
            if (a < game_tui.game_board.width){
                System.out.print("| " + a  + " ");
                // Print first - second to last coloumn
            }

            else if (a == game_tui.game_board.width) {
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
                    // Print first - second to last coloumn
                }

                else if (index == row.coloumns.size()){
                    System.out.print("| " + coloumn + " |");
                    // Print last coloumn
                }
            }
        }
    }

}