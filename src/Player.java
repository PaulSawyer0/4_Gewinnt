public class Player{
    public void Take_Turn(Game_TUI game_TUI, int player_num){
        // By calling this method with Game_TUI
        // we can call a plethora of other methods in different classes with same
        // parameter

        game_TUI.game_board.Print_Coloumn_Header_Enclosure(game_TUI);
        game_TUI.game_board.Print_Coloumn_Header(game_TUI);
        game_TUI.game_board.Print_Coloumn_Header_Enclosure(game_TUI);
        game_TUI.game_board.Print_Row_Coloumn(game_TUI);
        game_TUI.game_board.Print_Coloumn_Header_Enclosure(game_TUI);

        Print_Current_Player(game_TUI, player_num);
        Print_Input_Prompt(game_TUI);

        int coloumn = game_TUI.game_board.input.Choose_Coloumn(game_TUI);
        game_TUI.game_board.input.Update_Map(game_TUI, coloumn, player_num);
        game_TUI.game_board.comp.Compare_Stones(game_TUI, player_num);
        game_TUI.game_board.input.Check_Available_Space(game_TUI);
    }

    public void Print_Input_Prompt(Game_TUI game_tui){
        System.out.println("\n");
        try{
            switch (game_tui.lang_int) {
                case 1:
                    System.out.println("Choose a coloumn: ");
                    break;
            
                case 2:
                    System.out.println("Wähle eine Spalte: ");
                    break;
                default:
                    break;
            }
        }

        catch(java.lang.ArithmeticException OutOfBounds){}
        
    }

    public void Print_Current_Player(Game_TUI game_tui, int player_num){
        System.out.println("\n");
        try{
            switch (game_tui.lang_int) {
                case 1:
                    System.out.println(game_tui.take_turn_ENG + " " + player_num);
                    break;
            
                case 2:
                    System.out.println(game_tui.take_turn_DE + " " + player_num);
                    break;
                default:
                    break;
            }

        }

        catch(java.lang.ArithmeticException OutOfBounds){}
    }

}