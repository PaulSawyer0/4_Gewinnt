public class Comparison {
    
    public void Compare_Stones(Game_TUI game_tui, int player_num, int win_condition){
        //Get head clas Game_TUI, needed number of matching stones to win

        // .map.size() returns a human-readable list size
        // it starts at 1, not at 0
        // what the fuck
      
// ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡔⣻⠁⠀⢀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀
// ⠀⠀⠀⠀⢀⣾⠳⢶⣦⠤⣀⠀⠀⠀⠀⠀⠀⠀⣾⢀⡇⡴⠋⣀⠴⣊⣩⣤⠶⠞⢹⣄⠀⠀⠀
// ⠀⠀⠀⠀⢸⠀⠀⢠⠈⠙⠢⣙⠲⢤⠤⠤⠀⠒⠳⡄⣿⢀⠾⠓⢋⠅⠛⠉⠉⠝⠀⠼⠀⠀⠀
// ⠀⠀⠀⠀⢸⠀⢰⡀⠁⠀⠀⠈⠑⠦⡀⠀⠀⠀⠀⠈⠺⢿⣂⠀⠉⠐⠲⡤⣄⢉⠝⢸⠀⠀⠀
// ⠀⠀⠀⠀⢸⠀⢀⡹⠆⠀⠀⠀⠀⡠⠃⠀⠀⠀⠀⠀⠀⠀⠉⠙⠲⣄⠀⠀⠙⣷⡄⢸⠀⠀⠀
// ⠀⠀⠀⠀⢸⡀⠙⠂⢠⠀⠀⡠⠊⠀⠀⠀⠀⢠⠀⠀⠀⠀⠘⠄⠀⠀⠑⢦⣔⠀⢡⡸⠀⠀⠀
// ⠀⠀⠀⠀⢀⣧⠀⢀⡧⣴⠯⡀⠀⠀⠀⠀⠀⡎⠀⠀⠀⠀⠀⢸⡠⠔⠈⠁⠙⡗⡤⣷⡀⠀⠀
// ⠀⠀⠀⠀⡜⠈⠚⠁⣬⠓⠒⢼⠅⠀⠀⠀⣠⡇⠀⠀⠀⠀⠀⠀⣧⠀⠀⠀⡀⢹⠀⠸⡄⠀⠀
// ⠀⠀⠀⡸⠀⠀⠀⠘⢸⢀⠐⢃⠀⠀⠀⡰⠋⡇⠀⠀⠀⢠⠀⠀⡿⣆⠀⠀⣧⡈⡇⠆⢻⠀⠀
// ⠀⠀⢰⠃⠀⠀⢀⡇⠼⠉⠀⢸⡤⠤⣶⡖⠒⠺⢄⡀⢀⠎⡆⣸⣥⠬⠧⢴⣿⠉⠁⠸⡀⣇⠀
// ⠀⠀⠇⠀⠀⠀⢸⠀⠀⠀⣰⠋⠀⢸⣿⣿⠀⠀⠀⠙⢧⡴⢹⣿⣿⠀⠀⠀⠈⣆⠀⠀⢧⢹⡄
// ⠀⣸⠀⢠⠀⠀⢸⡀⠀⠀⢻⡀⠀⢸⣿⣿⠀⠀⠀⠀⡼⣇⢸⣿⣿⠀⠀⠀⢀⠏⠀⠀⢸⠀⠇
// ⠀⠓⠈⢃⠀⠀⠀⡇⠀⠀⠀⣗⠦⣀⣿⡇⠀⣀⠤⠊⠀⠈⠺⢿⣃⣀⠤⠔⢸⠀⠀⠀⣼⠑⢼
// ⠀⠀⠀⢸⡀⣀⣾⣷⡀⠀⢸⣯⣦⡀⠀⠀⠀⢇⣀⣀⠐⠦⣀⠘⠀⠀⢀⣰⣿⣄⠀⠀⡟⠀⠀
// ⠀⠀⠀⠀⠛⠁⣿⣿⣧⠀⣿⣿⣿⣿⣦⣀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣴⣿⣿⡿⠈⠢⣼⡇⠀⠀
// ⠀⠀⠀⠀⠀⠀⠈⠁⠈⠻⠈⢻⡿⠉⣿⠿⠛⡇⠒⠒⢲⠺⢿⣿⣿⠉⠻⡿⠁⠀⠀⠈⠁⠀⠀
// ⢀⠤⠒⠦⡀⠀⠀⠀⠀⠀⠀⠀⢀⠞⠉⠆⠀⠀⠉⠉⠉⠀⠀⡝⣍⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
// ⡎⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⡰⠋⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⢡⠈⢦⠀⠀⠀⠀⠀⠀⠀⠀⠀
// ⡇⠀⠀⠸⠁⠀⠀⠀⠀⢀⠜⠁⠀⠀⠀⡸⠀⠀⠀⠀⠀⠀⠀⠘⡄⠈⢳⡀⠀⠀⠀⠀⠀⠀⠀
// ⡇⠀⠀⢠⠀⠀⠀⠀⠠⣯⣀⠀⠀⠀⡰⡇⠀⠀⠀⠀⠀⠀⠀⠀⢣⠀⢀⡦⠤⢄⡀⠀⠀⠀⠀
// ⢱⡀⠀⠈⠳⢤⣠⠖⠋⠛⠛⢷⣄⢠⣷⠁⠀⠀⠀⠀⠀⠀⠀⠀⠘⡾⢳⠃⠀⠀⠘⢇⠀⠀⠀
// ⠀⠙⢦⡀⠀⢠⠁⠀⠀⠀⠀⠀⠙⣿⣏⣀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣧⡃⠀⠀⠀⠀⣸⠀⠀⠀
// ⠀⠀⠀⠈⠉⢺⣄⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣗⣤⣀⣠⡾⠃⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠣⢅⡤⣀⣀⣠⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠉⠉⠉⠀⠀⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠁⠀⠉⣿⣿⣿⣿⣿⡿⠻⣿⣿⣿⣿⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⣿⠀⠀⠀⠀⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⣿⣿⣟⠀⠀⢠⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⣿⠀⠀⢸⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⡏⠀⠀⢸⣿⣿⣿⣿⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⠀⠀⠀⢺⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠈⠉⠻⣿⣿⣿⠟⠀⠀⠀⠀⠀⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣿⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠋⠀⠀        

            for (int row = 0; row < game_tui.game_board.map.size(); ++row){

                try{
                    for (int coloumn = 0; coloumn < game_tui.game_board.map.get(coloumn).coloumns.size(); ++coloumn){
                        Comp_Init(game_tui, player_num, win_condition, row, coloumn);
                    }
                }

                catch (java.lang.IndexOutOfBoundsException OutOfBounds){}
        }
        }

    // ************
    // *Parameters*
    // ************

    // Using more than 2 parameters makes me throw up, still only viable way as for now
    // Following methods do nothing besides initialising, conditional testing

    // game_tui            = head class
    // player_num          = current player number
    // win_condition       = number of matches needed for win
    // row                 = current row
    // coloumn             = current coloumn
    // index                  = Current comparison index
    // match_tracker          Keep track of previous matches
    
    public void Comp_Init(Game_TUI game_tui, int player_num, int win_condition, int row, int coloumn){
        int match_tracker = 0;
        try{
            for (int i = 0; i < win_condition; ++i){
                if (Comp_Down(game_tui, player_num, win_condition, row, coloumn, i)     == true ||
                Comp_Left(game_tui, player_num, win_condition, row, coloumn, i)         == true ||
                Comp_Right(game_tui, player_num, win_condition, row, coloumn, i)        == true ||
                Comp_Lower_Left(game_tui, player_num, win_condition, row, coloumn, i)   == true ||
                Comp_Lower_Right(game_tui, player_num, win_condition, row, coloumn, i)  == true ||
                Comp_Upper_Left(game_tui, player_num, win_condition, row, coloumn, i)   == true ||
                Comp_Upper_Right(game_tui, player_num, win_condition, row, coloumn, i)  == true ){
                    // check if one of the 7 comparisons was successful
                    // increment tracker if true
                    ++match_tracker;
                }
            }
            
            Match_Tracker_Test(match_tracker, win_condition);
            //  if successful match was achieved
        }

        catch(java.lang.IndexOutOfBoundsException OutOfBounds){}
    }

    public boolean Comp_Down(Game_TUI game_tui, int player_num, int win_condition, int row, int coloumn, int i){
        boolean match = false;
                if (game_tui.game_board.map.get(row + i).coloumns.get(coloumn) == player_num){
                    // Iterate 'down' rows
                    match = true;
                }

        // if we do have a match, return match = true
        return match;
    }
    
    public boolean Comp_Left(Game_TUI game_tui, int player_num, int win_condition, int row, int coloumn, int i){
        boolean match = false;
                if (game_tui.game_board.map.get(row).coloumns.get(coloumn - i) == player_num){
                    // Iterate to left index of same row
                    match = true;
                }

        // if we do have a match, return match = true
        return match;
    }
    public boolean Comp_Right(Game_TUI game_tui, int player_num, int win_condition, int row, int coloumn, int i){
        boolean match = false;
                if (game_tui.game_board.map.get(row).coloumns.get(coloumn + i) == player_num){
                    // Iterate to right index of same row
                    match = true;
                }

        // if we do have a match, return match = true
        return match;
    }
    public boolean Comp_Lower_Left(Game_TUI game_tui, int player_num, int win_condition, int row, int coloumn, int i){
        boolean match = false;
                if (game_tui.game_board.map.get(row + i).coloumns.get(coloumn - i) == player_num){
                    // Iterate down rows to left
                    match = true;
                }

        // if we do have a match, return match = true
        return match;
    }
    public boolean Comp_Lower_Right(Game_TUI game_tui, int player_num, int win_condition, int row, int coloumn, int i){
        boolean match = false;
                if (game_tui.game_board.map.get(row + i).coloumns.get(coloumn + i) == player_num){
                    // Iterate down rows to right
                    match = true;
                }

        // if we do have a match, return match = true
        return match;
    }
    public boolean Comp_Upper_Left(Game_TUI game_tui, int player_num, int win_condition, int row, int coloumn, int i){
        boolean match = false;
                if (game_tui.game_board.map.get(row - i).coloumns.get(coloumn - i) == player_num){
                    // Iterate up rows to left
                    match = true;
                }

        // if we do have a match, return match = true
        return match;
    }
    
    public boolean Comp_Upper_Right(Game_TUI game_tui, int player_num, int win_condition, int row, int coloumn, int i){
        boolean match = false;
                if (game_tui.game_board.map.get(row - i).coloumns.get(coloumn + i) == player_num){
                    // Iterate up rows to right
                    match = true;
                }

        // if we do have a match, return match = true
        return match;
    }
    public void Match_Tracker_Test(int match_tracker, int win_condition){
                if (match_tracker == win_condition){
                    // Call Winner_Notificatin method
                    // ==> end of game
                    System.out.println("\nSUCCESS");
                }
    }
}
