public class Comparison {
    
        // ********************
        // *Rework in Progress*
        // ********************

        // |Why|

        // Old approach didn't work. In previous commits I tried to implement comparison by looping through rows, coloumns
        // and calling adjacent comparison methods for each location.
        // Something kept messing with rows and coloumns, thus preventing every other comparison, except
        // the first one for some reason, to achieve a normal comparison.
        // Now, each comparison starts its own iteration though rows and coloumns.
        // Will still try to put the iteration process inside a method, to save some semblance
        // of OOP code.

        // Tldr: Something went wrong in the conditional tests outside of method comparisons

// // ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡔⣻⠁⠀⢀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀
// // ⠀⠀⠀⠀⢀⣾⠳⢶⣦⠤⣀⠀⠀⠀⠀⠀⠀⠀⣾⢀⡇⡴⠋⣀⠴⣊⣩⣤⠶⠞⢹⣄⠀⠀⠀
// // ⠀⠀⠀⠀⢸⠀⠀⢠⠈⠙⠢⣙⠲⢤⠤⠤⠀⠒⠳⡄⣿⢀⠾⠓⢋⠅⠛⠉⠉⠝⠀⠼⠀⠀⠀
// // ⠀⠀⠀⠀⢸⠀⢰⡀⠁⠀⠀⠈⠑⠦⡀⠀⠀⠀⠀⠈⠺⢿⣂⠀⠉⠐⠲⡤⣄⢉⠝⢸⠀⠀⠀
// // ⠀⠀⠀⠀⢸⠀⢀⡹⠆⠀⠀⠀⠀⡠⠃⠀⠀⠀⠀⠀⠀⠀⠉⠙⠲⣄⠀⠀⠙⣷⡄⢸⠀⠀⠀
// // ⠀⠀⠀⠀⢸⡀⠙⠂⢠⠀⠀⡠⠊⠀⠀⠀⠀⢠⠀⠀⠀⠀⠘⠄⠀⠀⠑⢦⣔⠀⢡⡸⠀⠀⠀
// // ⠀⠀⠀⠀⢀⣧⠀⢀⡧⣴⠯⡀⠀⠀⠀⠀⠀⡎⠀⠀⠀⠀⠀⢸⡠⠔⠈⠁⠙⡗⡤⣷⡀⠀⠀
// // ⠀⠀⠀⠀⡜⠈⠚⠁⣬⠓⠒⢼⠅⠀⠀⠀⣠⡇⠀⠀⠀⠀⠀⠀⣧⠀⠀⠀⡀⢹⠀⠸⡄⠀⠀
// // ⠀⠀⠀⡸⠀⠀⠀⠘⢸⢀⠐⢃⠀⠀⠀⡰⠋⡇⠀⠀⠀⢠⠀⠀⡿⣆⠀⠀⣧⡈⡇⠆⢻⠀⠀
// // ⠀⠀⢰⠃⠀⠀⢀⡇⠼⠉⠀⢸⡤⠤⣶⡖⠒⠺⢄⡀⢀⠎⡆⣸⣥⠬⠧⢴⣿⠉⠁⠸⡀⣇⠀
// // ⠀⠀⠇⠀⠀⠀⢸⠀⠀⠀⣰⠋⠀⢸⣿⣿⠀⠀⠀⠙⢧⡴⢹⣿⣿⠀⠀⠀⠈⣆⠀⠀⢧⢹⡄
// // ⠀⣸⠀⢠⠀⠀⢸⡀⠀⠀⢻⡀⠀⢸⣿⣿⠀⠀⠀⠀⡼⣇⢸⣿⣿⠀⠀⠀⢀⠏⠀⠀⢸⠀⠇
// // ⠀⠓⠈⢃⠀⠀⠀⡇⠀⠀⠀⣗⠦⣀⣿⡇⠀⣀⠤⠊⠀⠈⠺⢿⣃⣀⠤⠔⢸⠀⠀⠀⣼⠑⢼
// // ⠀⠀⠀⢸⡀⣀⣾⣷⡀⠀⢸⣯⣦⡀⠀⠀⠀⢇⣀⣀⠐⠦⣀⠘⠀⠀⢀⣰⣿⣄⠀⠀⡟⠀⠀
// // ⠀⠀⠀⠀⠛⠁⣿⣿⣧⠀⣿⣿⣿⣿⣦⣀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣴⣿⣿⡿⠈⠢⣼⡇⠀⠀
// // ⠀⠀⠀⠀⠀⠀⠈⠁⠈⠻⠈⢻⡿⠉⣿⠿⠛⡇⠒⠒⢲⠺⢿⣿⣿⠉⠻⡿⠁⠀⠀⠈⠁⠀⠀
// // ⢀⠤⠒⠦⡀⠀⠀⠀⠀⠀⠀⠀⢀⠞⠉⠆⠀⠀⠉⠉⠉⠀⠀⡝⣍⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
// // ⡎⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⡰⠋⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⢡⠈⢦⠀⠀⠀⠀⠀⠀⠀⠀⠀
// // ⡇⠀⠀⠸⠁⠀⠀⠀⠀⢀⠜⠁⠀⠀⠀⡸⠀⠀⠀⠀⠀⠀⠀⠘⡄⠈⢳⡀⠀⠀⠀⠀⠀⠀⠀
// // ⡇⠀⠀⢠⠀⠀⠀⠀⠠⣯⣀⠀⠀⠀⡰⡇⠀⠀⠀⠀⠀⠀⠀⠀⢣⠀⢀⡦⠤⢄⡀⠀⠀⠀⠀
// // ⢱⡀⠀⠈⠳⢤⣠⠖⠋⠛⠛⢷⣄⢠⣷⠁⠀⠀⠀⠀⠀⠀⠀⠀⠘⡾⢳⠃⠀⠀⠘⢇⠀⠀⠀
// // ⠀⠙⢦⡀⠀⢠⠁⠀⠀⠀⠀⠀⠙⣿⣏⣀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣧⡃⠀⠀⠀⠀⣸⠀⠀⠀
// // ⠀⠀⠀⠈⠉⢺⣄⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣗⣤⣀⣠⡾⠃⠀⠀⠀
// // ⠀⠀⠀⠀⠀⠀⠣⢅⡤⣀⣀⣠⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠉⠉⠉⠀⠀⠀⠀⠀
// // ⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠁⠀⠉⣿⣿⣿⣿⣿⡿⠻⣿⣿⣿⣿⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀
// // ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⣿⠀⠀⠀⠀⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
// // ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⣿⣿⣟⠀⠀⢠⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
// // ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⣿⠀⠀⢸⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
// // ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⡏⠀⠀⢸⣿⣿⣿⣿⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀
// // ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⠀⠀⠀⢺⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀
// // ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠈⠉⠻⣿⣿⣿⠟⠀⠀⠀⠀⠀⠀⠀⠀
// // ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣿⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀
// // ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠋⠀⠀        


        // *******************
        // *Static Parameters*
        // *******************

        // *Directions*

        // 1   =   Compare down
        // 2   =   Compare Left
        // 3   =   Compare Right
        // 4   =   Compare Lower Left
        // 5   =   Compare Lower Right
        // 6   =   Compare Upper Left
        // 7   =   Compare Upper Right

    public void Compare_Stones(Game_TUI game_tui, int player_num, int win_condition){
        //Get head clas Game_TUI, needed number of matching stones to win
        Comp_Down(game_tui, player_num, win_condition);
        Comp_Left(game_tui, player_num, win_condition);
        Comp_Right(game_tui, player_num, win_condition);
        Comp_Lower_Left(game_tui, player_num, win_condition);
        Comp_Lower_Right(game_tui, player_num, win_condition);
        Comp_Upper_Left(game_tui, player_num, win_condition);
        Comp_Upper_Right(game_tui, player_num, win_condition);

        
    }


    public void Comp_Loop(Game_TUI game_tui, int player_num, int win_condition, int direction){
        // This method is the reason why my Github repo is set on private
        // Iterate through rows, coloumns for current direction
        for (int row = 0; row < game_tui.game_board.map.size(); ++row){
            // Iterate through rows
            try{
                for (int coloumn = 0; coloumn < game_tui.game_board.map.get(coloumn).coloumns.size(); ++coloumn){
                    // Iterate through coloumns
                    int match_tracker = 0;                
                    for (int i = 0; i < win_condition; ++i){
                        int result = 0;
                        try{
                            switch (direction) {
                                // Putting the comparison into another method would take 8 parameters to work
                                // Nuh uh
                                case 1:
                                    // Compare down
                                    result =  game_tui.game_board.map.get(row + i).coloumns.get(coloumn);
                                    if (result == player_num){
                                        ++match_tracker;
                                    }
                                    break;
                                
                                case 2:
                                    // Compare left
                                    result =  game_tui.game_board.map.get(row).coloumns.get(coloumn - i);
                                    if (result == player_num){
                                        ++match_tracker;
                                    }
                                    break;
                                case 3:
                                    // Compare right
                                    result =  game_tui.game_board.map.get(row).coloumns.get(coloumn + i);
                                    if (result == player_num){
                                        ++match_tracker;
                                    }
                                    break;
                                case 4:
                                    // Compare lower left
                                    result =  game_tui.game_board.map.get(row + i).coloumns.get(coloumn - i);
                                    if (result == player_num){
                                        ++match_tracker;
                                    }
                                    break;
                                case 5:
                                    // Compare lower right
                                    result =  game_tui.game_board.map.get(row + i).coloumns.get(coloumn + i);
                                    if (result == player_num){
                                        ++match_tracker;
                                    }
                                    break;
                                case 6:
                                    // Compare upper left
                                    result =  game_tui.game_board.map.get(row - i).coloumns.get(coloumn - i);
                                    if (result == player_num){
                                        ++match_tracker;
                                    }
                                    break;
                                case 7:
                                    // Compare upper right
                                    result =  game_tui.game_board.map.get(row - i).coloumns.get(coloumn + i);
                                    if (result == player_num){
                                        ++match_tracker;
                                    }
                                    break;
                            }
                        Match_Tracker_Test(match_tracker, win_condition);
                        }
                        catch (java.lang.IndexOutOfBoundsException OutOfBounds){}
                    }
                }
            }
            catch (java.lang.IndexOutOfBoundsException OutOfBounds){}
        }
    }

    public void Comp_Down(Game_TUI game_tui, int player_num, int win_condition){
        int direction = 1;
        Comp_Loop(game_tui, player_num, win_condition, direction);
    }

    public void Comp_Left(Game_TUI game_tui, int player_num, int win_condition){
        int direction = 2;
        Comp_Loop(game_tui, player_num, win_condition, direction);
    }
    
    public void Comp_Right(Game_TUI game_tui, int player_num, int win_condition){
        int direction = 3;
        Comp_Loop(game_tui, player_num, win_condition, direction);
    }
    
    public void Comp_Lower_Left(Game_TUI game_tui, int player_num, int win_condition){
        int direction = 4;
        Comp_Loop(game_tui, player_num, win_condition, direction);
    }
    
    public void Comp_Lower_Right(Game_TUI game_tui, int player_num, int win_condition){
        int direction = 5;
        Comp_Loop(game_tui, player_num, win_condition, direction);
    }

    public void Comp_Upper_Left(Game_TUI game_tui, int player_num, int win_condition){
        int direction = 6;
        Comp_Loop(game_tui, player_num, win_condition, direction);
    }
    
    public void Comp_Upper_Right(Game_TUI game_tui, int player_num, int win_condition){
        int direction = 7;
        Comp_Loop(game_tui, player_num, win_condition, direction);
    }

    public void Match_Tracker_Test(int match_tracker, int win_condition){
                if (match_tracker == win_condition){
                    // Call Winner_Notificatin method
                    // ==> end of game
                    System.out.println("\nSUCCESS");
                }
    }
}
