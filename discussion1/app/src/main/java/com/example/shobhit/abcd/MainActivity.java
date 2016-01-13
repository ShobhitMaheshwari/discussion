package com.example.shobhit.abcd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TickTacToe tickTacToe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tickTacToe = new TickTacToe();
    }

    public void clickBoard(View v){

        String Id = v.getResources().getResourceName(v.getId());//get the Id of Image Resource

        int position = Character.getNumericValue(Id.charAt(Id.length() - 1 ));//convert it to integer

        tickTacToe.setState(position);//Set the state of the current cell according to the player turn

        ImageButton imageButton = (ImageButton)v;
        switch (tickTacToe.getState(position))//also set the circle or cross in the view
        {
            case Circle:
                imageButton.setImageResource(R.drawable.circle);
                break;
            case Cross:
                imageButton.setImageResource(R.drawable.cross);
                break;
        }
    }
}
