import java.util.ArrayList;
import java.util.List;

public class Input {
    
    public int Choose_Coloumn(Game_TUI game_tui){
        // Let player choose target coloumn
        // output will be corrected (to accommodate for previous visual improvement->list starts at 1)
        int coloumn= -1;

        while (coloumn < 0 || coloumn > game_tui.game_board.width - 1){
            // While loop ensures that chosen row is within range
            coloumn = game_tui.Logical_Input_Test(game_tui.game_board.width) - 1;
            }        

        return coloumn;
    }
    
    public void Update_Map(Game_TUI game_tui,int target_coloumn, int player_num){
        int size = game_tui.game_board.map.size() - 1;
        
        for (int b = size; size - b != size; --b){
            // iterate rows in reverse
            
            if (game_tui.game_board.map.get(b).coloumns.get(target_coloumn) == 0){
                game_tui.game_board.map.get(b).coloumns.set(target_coloumn, player_num);
                break;
                // if position == 0
                // ===>Set it to player number
            }
        }
    }
    // Can't put Update into Game_Board, since I need the map attribute from Game_Board
}
