import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

// +=========+
// |Unit Test|
// +=========+

// *************************************************************************************
// *Testing with a framework has not been done before.                                 *
// *Since Game_TUI.java only requires numerical user input, there isn't much to test.  *
// *Will do a few input tests regardless, to see how it works.                         *
// **Testing will probably be more handy in regards to Comparison, Game-Board.         *
// *************************************************************************************

public class Test_Unit{
    
        //There's no valid way of testing user input in console.

        Game_TUI game_tui_test = new Game_TUI();

    @Test
    void Test_Lang_Input(){
    }

    @Test
    void Test_Difficulty_Input(){

    }

    @Test
    void Test_Greeting_Print(){
        int test_num = -1;
        game_tui_test.Print_Greeting(test_num);
    }
    
    @Test
    void Test_Instruction_Print(){
        int test_num = -1;
        game_tui_test.Print_Instructions(test_num);
    }
}
