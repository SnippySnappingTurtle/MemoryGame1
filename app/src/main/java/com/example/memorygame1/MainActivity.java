package com.example.memorygame1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView score;

    ImageView im1, im2, im3, im4, im5, im6, im7, im8, im9, im10, im11, im12;

    Integer[] cardsArray = {101, 102, 103, 104, 105, 106, 201, 202, 203, 204, 205, 206};

    int dime, kerry, mark, phil, scott, zakk, dime1, kerry1, mark1, phil1, scott1, zakk1;

    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber = 1;

    int turn = 1;
    int playerPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        score = (TextView) findViewById(R.id.score);

        im1 = (ImageView) findViewById(R.id.im1);
        im2 = (ImageView) findViewById(R.id.im2);
        im3 = (ImageView) findViewById(R.id.im3);
        im4 = (ImageView) findViewById(R.id.im4);
        im5 = (ImageView) findViewById(R.id.im5);
        im6 = (ImageView) findViewById(R.id.im6);
        im7 = (ImageView) findViewById(R.id.im7);
        im8 = (ImageView) findViewById(R.id.im8);
        im9 = (ImageView) findViewById(R.id.im9);
        im10 = (ImageView) findViewById(R.id.im10);
        im11 = (ImageView) findViewById(R.id.im11);
        im12 = (ImageView) findViewById(R.id.im12);

        im1.setTag("0");
        im2.setTag("1");
        im3.setTag("2");
        im4.setTag("3");
        im5.setTag("4");
        im6.setTag("5");
        im7.setTag("6");
        im8.setTag("7");
        im9.setTag("8");
        im10.setTag("9");
        im11.setTag("10");
        im12.setTag("11");

        frontOFCardsResources();

        Collections.shuffle(Arrays.asList(cardsArray));


        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doThing(im1, theCard);
            }
        });

        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doThing(im2, theCard);

            }
        });

        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doThing(im3, theCard);

            }
        });

        im4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doThing(im4, theCard);

            }
        });

        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doThing(im5, theCard);

            }
        });

        im6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doThing(im6, theCard);

            }
        });

        im7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doThing(im7, theCard);

            }
        });

        im8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doThing(im8, theCard);

            }
        });

        im9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doThing(im9, theCard);

            }
        });

        im10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doThing(im10, theCard);

            }
        });

        im11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doThing(im11, theCard);

            }
        });

        im12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doThing(im12, theCard);

            }
        });
    }

    private void doThing(ImageView im, int card) {
        if (cardsArray[card] == 101) {
            im.setImageResource(dime);
        } else if (cardsArray[card] == 102) {
            im.setImageResource(kerry);
        } else if (cardsArray[card] == 103) {
            im.setImageResource(mark);
        } else if (cardsArray[card] == 104) {
            im.setImageResource(phil);
        } else if (cardsArray[card] == 105) {
            im.setImageResource(scott);
        } else if (cardsArray[card] == 106) {
            im.setImageResource(zakk);
        } else if (cardsArray[card] == 201) {
            im.setImageResource(dime1);
        } else if (cardsArray[card] == 202) {
            im.setImageResource(kerry1);
        } else if (cardsArray[card] == 203) {
            im.setImageResource(mark1);
        } else if (cardsArray[card] == 204) {
            im.setImageResource(phil1);
        } else if (cardsArray[card] == 205) {
            im.setImageResource(scott1);
        } else if (cardsArray[card] == 206) {
            im.setImageResource(zakk1);
        }

        if(cardNumber == 1)
        {
            firstCard = cardsArray[card];
            if (firstCard > 200) {
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickedFirst = card;

            
        } else if(cardNumber ==2) {
            secondCard = cardsArray[card];
            if (secondCard > 200) {
                secondCard = secondCard - 100;
            }
            cardNumber = 1;
            clickedSecond = card;

            im1.setEnabled(false);
            im2.setEnabled(false);
            im3.setEnabled(false);
            im4.setEnabled(false);
            im5.setEnabled(false);
            im6.setEnabled(false);
            im7.setEnabled(false);
            im8.setEnabled(false);
            im9.setEnabled(false);
            im10.setEnabled(false);
            im11.setEnabled(false);
            im12.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();

                }
            }, 1000);
        }

    }

    private void calculate() {
        if(firstCard == secondCard){
            if(clickedFirst == 0){
                im1.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 1){
                im2.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 2){
                im3.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 3){
                im4.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 4){
                im5.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 5){
                im6.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 6){
                im7.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 7){
                im8.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 8){
                im9.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 9){
                im10.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 10){
                im11.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 11){
                im12.setVisibility(View.INVISIBLE);
            }

            if(clickedSecond == 0){
                im1.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 1){
                im2.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 2){
                im3.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 3){
                im4.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 4){
                im5.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 5){
                im6.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 6){
                im7.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 7){
                im8.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 8){
                im9.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 9){
                im10.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 10){
                im11.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 11){
                im12.setVisibility(View.INVISIBLE);
            }

            if(turn == 1){
                playerPoints++;
                score.setText("Score: "+playerPoints);
            }
        } else {
            im1.setImageResource(R.drawable.question);
            im2.setImageResource(R.drawable.question);
            im3.setImageResource(R.drawable.question);
            im4.setImageResource(R.drawable.question);
            im5.setImageResource(R.drawable.question);
            im6.setImageResource(R.drawable.question);
            im7.setImageResource(R.drawable.question);
            im8.setImageResource(R.drawable.question);
            im9.setImageResource(R.drawable.question);
            im10.setImageResource(R.drawable.question);
            im11.setImageResource(R.drawable.question);
            im12.setImageResource(R.drawable.question);


        }
        im1.setEnabled(true);
        im2.setEnabled(true);
        im3.setEnabled(true);
        im4.setEnabled(true);
        im5.setEnabled(true);
        im6.setEnabled(true);
        im7.setEnabled(true);
        im8.setEnabled(true);
        im9.setEnabled(true);
        im10.setEnabled(true);
        im11.setEnabled(true);
        im12.setEnabled(true);

        checkEnd();

    }

    private void checkEnd(){
        if(im1.getVisibility() == View.INVISIBLE &&
                im2.getVisibility() == View.INVISIBLE &&
                im3.getVisibility() == View.INVISIBLE &&
                im4.getVisibility() == View.INVISIBLE &&
                im5.getVisibility() == View.INVISIBLE &&
                im6.getVisibility() == View.INVISIBLE &&
                im7.getVisibility() == View.INVISIBLE &&
                im8.getVisibility() == View.INVISIBLE &&
                im9.getVisibility() == View.INVISIBLE &&
                im10.getVisibility() == View.INVISIBLE &&
                im11.getVisibility() == View.INVISIBLE &&
                im12.getVisibility() == View.INVISIBLE) {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            alertDialogBuilder.
                    setMessage("Game Over! Score: " +playerPoints)
                    .setCancelable(false)
                    .setPositiveButton("NEW", new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                     })
                    .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
        }
    }
    private void frontOFCardsResources(){
        dime = R.drawable.dime;
        scott = R.drawable.scott;
        phil = R.drawable.phil;
        zakk = R.drawable.zakk;
        kerry = R.drawable.kerry;
        mark = R.drawable.mark;
        dime1 = R.drawable.dime;
        scott1 = R.drawable.scott;
        phil1 = R.drawable.phil;
        zakk1 = R.drawable.zakk;
        kerry1 = R.drawable.kerry;
        mark1 = R.drawable.mark;




    }
}