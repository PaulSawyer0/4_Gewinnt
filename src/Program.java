import java.util.Scanner;

public class Program {
    // Field testing
    public static void main(String[] args){
        Game_TUI game_tui = new Game_TUI();
        game_tui.Game_TUI_Catalyst(game_tui);
        
        do{
            int player_num = 0;

            for (Player player : game_tui.player_list.player_list){
                ++player_num;
                if (game_tui.game_board.match_over == false){
                    player.Take_Turn(game_tui, player_num);
                }
            }
        }

        while (game_tui.game_board.match_over == false);

        game_tui.game_board.Print_Coloumn_Header_Enclosure(game_tui);
        game_tui.game_board.Print_Coloumn_Header(game_tui);
        game_tui.game_board.Print_Coloumn_Header_Enclosure(game_tui);
        game_tui.game_board.Print_Row_Coloumn(game_tui);
        game_tui.game_board.Print_Coloumn_Header_Enclosure(game_tui);
        
        game_tui.game_board.Winner_Notification(game_tui);
        try (Scanner scanner = new Scanner(System.in)) {
            scanner.nextLine();
            // Keep console open after successful match was executed
        }
    }
    
}
