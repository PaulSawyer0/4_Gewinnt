public class Player{
    public void Take_Turn(Game_TUI game_TUI, int player_num){
        // By calling this method with Game_TUI
        // we can call a plethora of other methods in different classes with same
        // parameter
        game_TUI.game_board.Print_Coloumn_Header(game_TUI);
        game_TUI.game_board.Print_Row_Coloumn(game_TUI);
        System.out.print("\n|" + player_num + "|\n");

        int coloumn = game_TUI.game_board.input.Choose_Coloumn(game_TUI);
        game_TUI.game_board.input.Update_Map(game_TUI, coloumn, player_num);
        game_TUI.game_board.comp.Compare_Stones(game_TUI, player_num);
        game_TUI.game_board.input.Check_Available_Space(game_TUI);
    }
}