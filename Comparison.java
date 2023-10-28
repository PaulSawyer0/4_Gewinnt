public class Comparison {
    
    public void Compare_Stones(Game_TUI game_tui, int player_num, int win_condition){
        //Get head clas Game_TUI, needed number of matching stones to win

        // ************
        // *Attributes*
        // ************

        int row_tracker     = -1;
        int coloumn_tracker = -1;
        // Track which row is currently being processed

        for (Row row : game_tui.game_board.map){
            ++row_tracker;

            for (int target_pos : row.coloumns){
                ++coloumn_tracker;
                Compare_Down(game_tui, row_tracker, coloumn_tracker, 1, 3, 0);

            }

        }
    }

        // ************
        // *Parameters*
        // ************

        // Parameters of following comparison methods

        // game_tui        = head class
        // row             = current row index
        // coloumn         = current coloumn index
        // player_num      = Number that needs to match
        // win_condition   = How many matches necessary for win
        // match_tracker   = every method needs one, might as well put it into parameter

    public void Compare_Down(Game_TUI game_tui, 
                            int row, int coloumn, 
                            int player_num,
                            int win_condition,
                            int match_tracker)
    {

        for (int a = 0; a < win_condition; ++a){
            // Step down the rows
            if ((game_tui.game_board.map.get(row).coloumns.get(coloumn)) == player_num){
                // if following stone is a match, increment match_tracker
                ++match_tracker;
            }
        }

        if (match_tracker == win_condition){
            System.out.print("Success");
            
        }
    }
}
