package com.example.shobhit.abcd;

/**
 * Created by shobhit on 1/13/16.
 */
public class TickTacToe {
    private enum Player{
        Circle,
        Cross
    };

    public enum State{
        Unfilled,
        Circle,
        Cross
    }

    private Player player = Player.Circle; // track which player is currently playing

    private State[] state = {State.Unfilled, State.Unfilled, State.Unfilled};//track state of every cell

    TickTacToe(){

    }

    /*
    Toggles the player so that they play alternatively
     */
    private void Toggle(){
        switch (player){
            case Circle:
                player = Player.Cross;
                break;
            case Cross:
                player = Player.Circle;
                break;
        }
    }

    /*
    Set the state of the given cell according to the player turn
     */
    public void setState(int x)
    {
        if(state[x] == State.Unfilled){
            Toggle();//Toggle the player so that different player plays
            switch (player){
                case Circle:
                    state[x] = State.Circle;
                    break;
                case Cross:
                    state[x] = State.Cross;
                    break;
            }
        }
    }

    /*
    Give the state of given cell
     */
    public State getState(int x)
    {
        return state[x];
    }
}
