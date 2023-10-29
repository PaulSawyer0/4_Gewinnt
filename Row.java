import java.util.ArrayList;
import java.util.List;

public class Row {
 List<Integer> coloumns = new ArrayList<Integer>();    

    public void Add_Coloumns(Game_TUI game_tui){
        // Setting 'x axis' by adding 0 to int list
        
        for (int a = 0; a < game_tui.game_board.width; ++a){
            coloumns.add(0);
            // Add 0 until requested width is reached
        }

    }
}
