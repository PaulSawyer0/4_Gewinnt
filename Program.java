public class Program {
    // Field testing
    public static void main(String[] args){
        Game_TUI game_TUI = new Game_TUI();
        game_TUI.game_board.Initialize_Empty_Board(6, 6);

        int target = game_TUI.game_board.input.Choose_Coloumn(game_TUI, 6);
        game_TUI.game_board.input.Update_Map(game_TUI, target, 2);
        target = game_TUI.game_board.input.Choose_Coloumn(game_TUI,6);
        game_TUI.game_board.input.Update_Map(game_TUI, target, 2);
        target = game_TUI.game_board.input.Choose_Coloumn(game_TUI, 6);
        game_TUI.game_board.input.Update_Map(game_TUI, target, 2);
        target = game_TUI.game_board.input.Choose_Coloumn(game_TUI, 6);
        game_TUI.game_board.input.Update_Map(game_TUI, target, 2);
        target = game_TUI.game_board.input.Choose_Coloumn(game_TUI, 6);
        game_TUI.game_board.input.Update_Map(game_TUI, target, 2);
        target = game_TUI.game_board.input.Choose_Coloumn(game_TUI, 6);
        game_TUI.game_board.input.Update_Map(game_TUI, target, 2);
        game_TUI.game_board.Print_Coloumn_Header(6);
        game_TUI.game_board.Print_Row_Coloumn(game_TUI);


        game_TUI.game_board.comp.Compare_Stones(game_TUI, 2, 3);
    }
    
}
