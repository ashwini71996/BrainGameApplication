package com.example.braingameapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;



public class MainActivity extends AppCompatActivity {

    TextView txt_one, txt_two, txt_three, txt_four, txt_five, txt_six, txt_seven, txt_eight,
            txt_nine, txt_ten, txt_eleven, txt_twelve, txt_thirteen,
            txt_fourteen, txt_fifteen, txt_sixteen, txt_macthes, txt_turns;


    ArrayList<String> cardList = new ArrayList<String>();
    Integer first_card_position,second_card_position;

    String first_selected_text="", second_selected_text="";
    Integer match_count=0, click_count=0, total_count=0;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_one = findViewById(R.id.txt_one);
        txt_two = findViewById(R.id.txt_two);
        txt_three = findViewById(R.id.txt_three);
        txt_four = findViewById(R.id.txt_four);
        txt_five = findViewById(R.id.txt_five);
        txt_six = findViewById(R.id.txt_six);
        txt_seven = findViewById(R.id.txt_seven);
        txt_eight = findViewById(R.id.txt_eight);
        txt_nine = findViewById(R.id.txt_nine);
        txt_ten = findViewById(R.id.txt_ten);
        txt_eleven = findViewById(R.id.txt_eleven);
        txt_twelve = findViewById(R.id.txt_twelve);
        txt_thirteen = findViewById(R.id.txt_thirteen);
        txt_fourteen = findViewById(R.id.txt_fourteen);
        txt_fifteen = findViewById(R.id.txt_fifteen);
        txt_sixteen = findViewById(R.id.txt_sixteen);
        txt_macthes = findViewById(R.id.txt_matches);
        txt_turns = findViewById(R.id.txt_turns);




        cardList.add("A");
        cardList.add("A");
        cardList.add("B");
        cardList.add("B");
        cardList.add("C");
        cardList.add("C");
        cardList.add("D");
        cardList.add("D");
        cardList.add("E");
        cardList.add("E");
        cardList.add("F");
        cardList.add("F");
        cardList.add("G");
        cardList.add("G");
        cardList.add("H");
        cardList.add("H");

        Collections.shuffle(cardList);
        Log.d("Shuffled list", "onCreate: ");

        txt_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String selected_letter = cardList.get(0);
                txt_one.setTextColor(Color.WHITE);
                txt_one.setText(selected_letter);
                txt_one.setEnabled(false);

                if(first_selected_text.equals("")){
                    first_selected_text = selected_letter;
                    first_card_position =1;



                }else {
                    second_card_position = 1;
                    second_selected_text = selected_letter;
                    evaluateMatches();
                    first_selected_text= "";
                    second_selected_text="";
                }

            }
        });

        txt_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selected_letter = cardList.get(1);
                txt_two.setTextColor(Color.WHITE);
                txt_two.setText(selected_letter);
                txt_two.setEnabled(false);


                if(first_selected_text.equals("")){

                    first_selected_text = selected_letter;
                    first_card_position = 2;


                }else {
                    second_card_position = 2;
                    second_selected_text = selected_letter;
                    evaluateMatches();
                    first_selected_text= "";
                    second_selected_text="";


                }
            }


        });

        txt_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selected_letter = cardList.get(2);
                txt_three.setTextColor(Color.WHITE);
                txt_three.setText(selected_letter);
                txt_three.setEnabled(false);

                if(first_selected_text.equals("")){
                    first_selected_text = selected_letter;
                    first_card_position =3;


                }else {
                    second_card_position = 3;
                    second_selected_text = selected_letter;
                    evaluateMatches();
                    first_selected_text= "";
                    second_selected_text="";
                }
            }
        });

        txt_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selected_letter = cardList.get(3);
                txt_four.setTextColor(Color.WHITE);
                txt_four.setText(selected_letter);
                txt_four.setEnabled(false);
                if(first_selected_text.equals("")){
                    first_selected_text = selected_letter;
                    first_card_position =4;


                }else {
                    second_card_position = 4;
                    second_selected_text = selected_letter;
                    evaluateMatches();
                    first_selected_text= "";
                    second_selected_text="";
                }
            }
        });

        txt_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selected_letter = cardList.get(4);
                txt_five.setTextColor(Color.WHITE);
                txt_five.setText(selected_letter);
                txt_five.setEnabled(false);
                if(first_selected_text.equals("")){
                    first_selected_text = selected_letter;
                    first_card_position =5;


                }else {
                    second_card_position = 5;
                    second_selected_text = selected_letter;
                    evaluateMatches();
                    first_selected_text= "";
                    second_selected_text="";
                }
            }
        });

        txt_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selected_letter = cardList.get(5);
                txt_six.setTextColor(Color.WHITE);
                txt_six.setText(selected_letter);
                txt_six.setEnabled(false);
                if(first_selected_text.equals("")){
                    first_selected_text = selected_letter;
                    first_card_position =6;


                }else {
                    second_card_position = 6;
                    second_selected_text = selected_letter;
                    evaluateMatches();
                    first_selected_text= "";
                    second_selected_text="";
                }
            }
        });

        //+++++++

        txt_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selected_letter = cardList.get(6);
                txt_seven.setTextColor(Color.WHITE);
                txt_seven.setText(selected_letter);
                txt_seven.setEnabled(false);
                if(first_selected_text.equals("")){
                    first_selected_text = selected_letter;
                    first_card_position =7;


                }else {
                    second_card_position = 7;
                    second_selected_text = selected_letter;
                    evaluateMatches();
                    first_selected_text= "";
                    second_selected_text="";
                }
            }
        });

        txt_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selected_letter = cardList.get(7);
                txt_eight.setTextColor(Color.WHITE);
                txt_eight.setText(selected_letter);
                txt_eight.setEnabled(false);
                if(first_selected_text.equals("")){
                    first_selected_text = selected_letter;
                    first_card_position =8;


                }else {
                    second_card_position = 8;
                    second_selected_text = selected_letter;
                    evaluateMatches();
                    first_selected_text= "";
                    second_selected_text="";
                }
            }
        });

        txt_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selected_letter = cardList.get(8);
                txt_nine.setTextColor(Color.WHITE);
                txt_nine.setText(selected_letter);
                txt_nine.setEnabled(false);
                if(first_selected_text.equals("")){
                    first_selected_text = selected_letter;
                    first_card_position =9;


                }else {
                    second_card_position = 9;
                    second_selected_text = selected_letter;
                    evaluateMatches();
                    first_selected_text= "";
                    second_selected_text="";
                }
            }
        });

        txt_ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selected_letter = cardList.get(9);
                txt_ten.setTextColor(Color.WHITE);
                txt_ten.setText(selected_letter);
                txt_ten.setEnabled(false);
                if(first_selected_text.equals("")){
                    first_selected_text = selected_letter;
                    first_card_position =10;


                }else {
                    second_card_position = 10;
                    second_selected_text = selected_letter;
                    evaluateMatches();
                    first_selected_text= "";
                    second_selected_text="";
                }
            }
        });

        txt_eleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selected_letter = cardList.get(10);
                txt_eleven.setTextColor(Color.WHITE);
                txt_eleven.setText(selected_letter);
                txt_eleven.setEnabled(false);
                if(first_selected_text.equals("")){
                    first_selected_text = selected_letter;
                    first_card_position =11;


                }else {
                    second_card_position = 11;
                    second_selected_text = selected_letter;
                    evaluateMatches();
                    first_selected_text= "";
                    second_selected_text="";
                }
            }
        });

        txt_twelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selected_letter = cardList.get(11);
                txt_twelve.setTextColor(Color.WHITE);
                txt_twelve.setText(selected_letter);
                txt_twelve.setEnabled(false);
                if(first_selected_text.equals("")){
                    first_selected_text = selected_letter;
                    first_card_position =12;


                }else {
                    second_card_position = 12;
                    second_selected_text = selected_letter;
                    evaluateMatches();
                    first_selected_text= "";
                    second_selected_text="";
                }
            }
        });

        txt_thirteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selected_letter = cardList.get(12);
                txt_thirteen.setTextColor(Color.WHITE);
                txt_thirteen.setText(selected_letter);
                txt_thirteen.setEnabled(false);
                if(first_selected_text.equals("")){
                    first_selected_text = selected_letter;
                    first_card_position =13;


                }else {
                    second_card_position = 13;
                    second_selected_text = selected_letter;
                    evaluateMatches();
                    first_selected_text= "";
                    second_selected_text="";
                }
            }
        });

        txt_fourteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selected_letter = cardList.get(13);
                txt_fourteen.setTextColor(Color.WHITE);
                txt_fourteen.setText(selected_letter);
                txt_fourteen.setEnabled(false);
                if(first_selected_text.equals("")){
                    first_selected_text = selected_letter;
                    first_card_position =14;


                }else {
                    second_card_position = 14;
                    second_selected_text = selected_letter;
                    evaluateMatches();
                    first_selected_text= "";
                    second_selected_text="";
                }
            }
        });

        txt_fifteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selected_letter = cardList.get(14);
                txt_fifteen.setTextColor(Color.WHITE);
                txt_fifteen.setText(selected_letter);
                txt_fifteen.setEnabled(false);

                if(first_selected_text.equals("")){
                    first_selected_text = selected_letter;
                    first_card_position =15;


                }else {
                    second_card_position = 15;
                    second_selected_text = selected_letter;
                    evaluateMatches();
                    first_selected_text= "";
                    second_selected_text="";
                }
            }
        });

        txt_sixteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selected_letter = cardList.get(15);
                txt_sixteen.setTextColor(Color.WHITE);
                txt_sixteen.setText(selected_letter);
                txt_sixteen.setEnabled(false);
                if(first_selected_text.equals("")){
                    first_selected_text = selected_letter;
                    first_card_position =16;


                }else {
                    second_card_position = 16;
                    second_selected_text = selected_letter;
                    evaluateMatches();
                    first_selected_text= "";
                    second_selected_text="";
                }
            }
        });
    }



    private void evaluateMatches() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(first_selected_text.equals(second_selected_text)){

            Toast.makeText(MainActivity.this,"Matched",Toast.LENGTH_SHORT).show();
            match_count++;
            click_count++;
            txt_macthes.setText("Matches : " + String.valueOf(match_count));
            txt_turns.setText("Turns : " + String.valueOf(click_count));
        }
        else {

            Toast.makeText(MainActivity.this,"Unmatched",Toast.LENGTH_SHORT).show();
            click_count++;

                txt_turns.setText("Turns : " + String.valueOf(click_count));

                        resetUI(first_card_position);

                        resetUI(second_card_position);

        }
    }

    private void resetUI(Integer position) {
        switch (position){
            case 1:
                txt_one.setTextColor(Color.BLACK);
                txt_one.setEnabled(true);
                break;
            case 2:
                txt_two.setTextColor(Color.BLACK);
                txt_one.setEnabled(true);
                break;
            case 3:
                txt_three.setTextColor(Color.BLACK);
                txt_three.setEnabled(true);
                break;
            case 4:
                txt_four.setTextColor(Color.BLACK);
                txt_four.setEnabled(true);
                break;
            case 5:
                txt_five.setTextColor(Color.BLACK);
                txt_five.setEnabled(true);
                break;
            case 6:
                txt_six.setTextColor(Color.BLACK);
                txt_six.setEnabled(true);
                break;
            case 7:
                txt_seven.setTextColor(Color.BLACK);
                txt_seven.setEnabled(true);
                break;
            case 8:
                txt_eight.setTextColor(Color.BLACK);
                txt_eight.setEnabled(true);
                break;
            case 9:
                txt_nine.setTextColor(Color.BLACK);
                txt_nine.setEnabled(true);
                break;
            case 10:
                txt_ten.setTextColor(Color.BLACK);
                txt_ten.setEnabled(true);
                break;
            case 11:
                txt_eleven.setTextColor(Color.BLACK);
                txt_eleven.setEnabled(true);
                break;
            case 12:
                txt_twelve.setTextColor(Color.BLACK);
                txt_twelve.setEnabled(true);
                break;
            case 13:
                txt_thirteen.setTextColor(Color.BLACK);
                txt_thirteen.setEnabled(true);
                break;
            case 14:
                txt_fourteen.setTextColor(Color.BLACK);
                txt_fourteen.setEnabled(true);
                break;
            case 15:
                txt_fifteen.setTextColor(Color.BLACK);
                txt_fifteen.setEnabled(true);
                break;
            case 16:
                txt_sixteen.setTextColor(Color.BLACK);
                txt_sixteen.setEnabled(true);
                break;
        }
    }

}