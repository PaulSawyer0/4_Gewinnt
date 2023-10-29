public class Player{
    public void Take_Turn(Game_TUI game_TUI, int player_num){
        // By calling this method with Game_TUI
        // we can call a plethora of other methods in different classes with same
        // parameter
        System.out.print("|" + player_num + "|\n");
        int coloumn = game_TUI.game_board.input.Choose_Coloumn(game_TUI);
        game_TUI.game_board.input.Update_Map(game_TUI, coloumn, player_num);
    }
}