public class Program {
    // Field testing
    public static void main(String[] args){
        Game_TUI game_TUI = new Game_TUI();
        game_TUI.game_board.Initialize_Empty_Board(3, 3);
        for (Row row : game_TUI.game_board.map){
            System.out.println(row.coloumns);
        }

        for (int b = 0; b < 3 ; ++b){
        game_TUI.game_board.map.get(b).coloumns.set(b, 1);
        // get(b) --> calling object at index b

        }

        for (Row row : game_TUI.game_board.map){
            System.out.println(row.coloumns);
        }

        game_TUI.player_list.Generate_Player_List(2);
        
        System.out.println(game_TUI.player_list.player_list.get(0));
        System.out.println(game_TUI.player_list.player_list.get(1));
        System.out.println(game_TUI.player_list.player_list.size());

        int target = game_TUI.game_board.input.Choose_Coloumn(game_TUI, 3);
        game_TUI.game_board.input.Update_Map(game_TUI, target, 2);
        game_TUI.game_board.Print_Coloumn_Header(3);
        game_TUI.game_board.Print_Row_Coloumn(game_TUI);

        
    }
    
}
