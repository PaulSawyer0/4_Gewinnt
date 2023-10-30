import java.io.Console;
import java.util.ArrayList;

// *******************
// *Static parameters*
// *******************

// Language:   1) Eng
//             2) GER

// Players:    2

// Difficulties:   1) 3 for easy difficulty
//                 2) 4 for medium difficulty
//                 3) 5 for hard difficulty

public class Game_TUI {

    // *************
    // *Composition*
    // *************
    
    Game_Board game_board;
    Player_List player_list;

    // ************
    // *Attributes*
    // ************

    String game_name;
    String welcome_ENG;
    String welcome_GER;
    String instruction_ENG;
    String instruction_GER;
    String take_turn_ENG;
    String take_turn_DE;
    String anncounce_winner_ENG;
    String anncounce_winner_DE;
    int lang_int;
    int difficulty;
    
    public Game_TUI(){

        // **********************
        // *Initiate composition*
        // **********************

        this.game_board = new Game_Board();
        this.player_list = new Player_List();

        game_name = "4 Gewinnt";

        welcome_ENG = """
+--------------------+
|Welcome to 4 Connect|
+--------------------+\n
Please choose your desired difficulty.\n
Easy-3
Medium-4
Difficult-5\n
                """;

        welcome_GER = """
+------------------------+
|Willkommen zu 4 Verbinde|
+------------------------+\n
Bitte waehle eine gewuenschte Schwiergikeitsstufe\n
Einfach-3
Normal-4
Schwer-5\n
                """;

        instruction_ENG = """
+-----+
|Rules|
+-----+\n
1.  Every player receives a distinctive stone.
2.  In each turn, a player places a stone in a certain row.
3.  If a stone lands on another stone, it lands above it.
4.  Depending on the chosen difficulty, a player has to achieve a certain matching symmetry for victory.
5.  Placing a certain amount of matching stones horizontally, vertically or diagonally, qualifies as victory.
6.  If there are no more free spots in the board, the game ends in a draw.\n
Enter desired difficulty.
                """;

        instruction_GER = """
+------+
|Regeln|
+------+\n
1.  Jeder Spieler erhaelt einen einzigartigen Stein.
2.  In jedem Zug platziert ein Spieler einen Stein in einer bestimmten Reihe.
3.  Falls ein Stein auf einen anderen Stein landet, bleibt er ueber ihn.
4.  Abhaengig von gewaehlter Schwierigkeitsstufe muss ein Spieler eine bestimmte Symmetriei fuer Gewinn erreichen.
5.  Das Platzieren einer bestimmten Menge gleicher Steine auf horizontaler, vertikaler, diagonaler Ebene reicht fuer Sieg aus.
6.  Falls keine freien Plaetze mehr im Spielbrett uebrig sein, endet das Spiel in unentschieden.  \n
Gebe gewuenschten Schwierigkeitsgrad an.
                """;       

        take_turn_ENG = """
+--------+
|New turn|
+--------+\n
Current player: """;

        take_turn_DE = """
+---------+
|Neuer Zug|
+---------+\n
Momentaner Spieler: """;

        anncounce_winner_ENG = """
We have a winner!\n
It's player: """;

        anncounce_winner_DE = """
Wir haben einen Gewinner!\n
Es ist Spieler: """;

    }

    public int Inquire_Console_Input(){
        //A method solely made for console input and making sure it's an integer
        //java.io.Console enables easy console reading
        Console console = System.console();
        String string = console.readLine();
        int in = Integer.parseInt(string);

        //Get console input and transform the input string to int

        return in;
    }

        //************************** 
        //*Logical Input Test = LIT*
        //**************************

        //Calling Logical_Input_Test with a certain target int
        //==>Raw input handled by Console_Inquiry
        //==>Logical input test handled by  LIT
        
    public int Logical_Input_Test(int target_max){
        int int_result = -1;
        //method gets called several times, setting the default result to -1 prevents logical errors
        //f.e. user can't choose negative amount of players, game mode
        try{
           if (int_result > target_max || int_result <= 0){
                int_result = Inquire_Console_Input();
            }
        }
        // 
        catch(java.lang.NumberFormatException Input_Error) {
            System.out.println("Enter a number.");
             int_result = Logical_Input_Test(target_max);
            //If user input is not numerical ==> Repeat input
            //Nesting console input method in inquiry
        }
        // 
        return int_result;
    }
    public int Inquire_Player_Number(){
        //As of 21.10, player number is set to 2 people
        //Might be expanded at later development stages
        int player_count = Logical_Input_Test(2);

        return player_count;
    }

    public int Inquire_Difficulty(Game_TUI game_tui){
        ArrayList<Integer> target_range = new ArrayList<Integer>();

        target_range.add(0,3);
        target_range.add(0,4);
        target_range.add(0,5);
        //game modes are defined by us

        int difficulty = Logical_Input_Test(5);
        while (target_range.contains(difficulty) != true){
            difficulty = Logical_Input_Test(5);
        }
        //check if chosen difficulty exists, repeat Input if incorrect
        return difficulty;
    }

    public int Inquire_Language(){
        //different languages get assigned different numerical codes
        //We only got two

        System.out.println("Choose language by entering its corresponding number.\n");
        ArrayList<String> lang_codes = new ArrayList<String>();
        lang_codes.add("English");
        lang_codes.add("German");
        //Adding available languages to list

        int i = 0;
        for (String lang : lang_codes){
            ++i;
            System.out.println(i + ": " + lang);
        }
        //Print available languages

        int lang_int = Logical_Input_Test(2);
        lang_codes.listIterator(i);
        while (lang_int > lang_codes.size() || lang_int <= 0){
            lang_int = Logical_Input_Test(2);
        }
        // Get chosen language and make sure it's in range

        return lang_int;
    }

    public void Print_Greeting(Game_TUI game_tui){
        try{
        switch(game_tui.lang_int){
            case 1:
                System.out.println(welcome_ENG);
                break;
            case 2:
                System.out.println(welcome_GER);
                break;
        }
    }
    catch(java.lang.ArithmeticException LangNotDefined){}
    }

    public void Print_Instructions(Game_TUI game_tui){
        try{
        switch(game_tui.lang_int){
            case 1:
                System.out.println(instruction_ENG);
                break;
            case 2:
                System.out.println(instruction_GER);
                break;
            }
        }
        catch(java.lang.ArithmeticException LangNotDefined){}
    }

    public void Game_TUI_Catalyst(Game_TUI game_tui){
        game_tui.lang_int = game_tui.Inquire_Language();
        game_tui.Print_Greeting(game_tui);
        game_tui.Print_Instructions(game_tui);
        game_tui.difficulty = Inquire_Difficulty(game_tui);
        game_tui.game_board.Game_Board_Config(game_tui);
        game_tui.game_board.Initialize_Empty_Board(game_tui);
        game_tui.player_list.Generate_Player_List(2);
    }
}
