import java.util.ArrayList;

public class Player_List {
    ArrayList<Player> player_list = new ArrayList<Player>();

    int p_ = 2;
    // Player count currently set to 2

    public void Generate_Player_List(int p_count){
        for (int a = 0; a < p_count; ++a){
            Player new_Player = new Player();
            player_list.add(new_Player);
        }
    }
}
