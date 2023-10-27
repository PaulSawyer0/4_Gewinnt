public class Input {
    
    public int Choose_Coloumn(Game_TUI game_tui, int width){
        // Let player choose target coloumn
        int coloumn= -1;

        game_tui.game_board.Print_Coloumn_Header(width);
        game_tui.game_board.Print_Row_Coloumn(game_tui);

        while (coloumn < 0 || coloumn > width - 1){
            // While loop ensures that chosen row is within range
            coloumn = game_tui.Logical_Input_Test(width) - 1;
            }        

        return coloumn;
    }
}
