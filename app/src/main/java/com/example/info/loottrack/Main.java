package com.example.info.loottrack;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends AppCompatActivity {
    // declare all variables
    private boolean isEmpty(EditText etText) {
        if (etText.getText().toString().trim().length() > 0)
            return false;

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textElementP = findViewById(R.id.textViewP);
        TextView textElementG = findViewById(R.id.textViewG);
        TextView textElementE = findViewById(R.id.textViewE);
        TextView textElementS = findViewById(R.id.textViewS);
        TextView textElementC = findViewById(R.id.textViewC);
        TextView textViewPotP = findViewById(R.id.textViewPotP);
        TextView textViewPotG = findViewById(R.id.textViewPotG);
        TextView textViewPotE = findViewById(R.id.textViewPotE);
        TextView textViewPotS = findViewById(R.id.textViewPotS);
        TextView textViewPotC = findViewById(R.id.textViewPotC);
        TextView textViewSplitP = findViewById(R.id.textViewSplitP);
        TextView textViewSplitG = findViewById(R.id.textViewSplitG);
        TextView textViewSplitE = findViewById(R.id.textViewSplitE);
        TextView textViewSplitS = findViewById(R.id.textViewSplitS);
        TextView textViewSplitC = findViewById(R.id.textViewSplitC);
        EditText editTextP = findViewById(R.id.editTextP);
        EditText editTextG = findViewById(R.id.editTextG);
        EditText editTextE = findViewById(R.id.editTextE);
        EditText editTextS = findViewById(R.id.editTextS);
        EditText editTextC = findViewById(R.id.editTextC);
        EditText editTextShares = findViewById(R.id.editTextShares);
        Button buttonAdd = findViewById(R.id.buttonAdd);
        Button buttonSplit = findViewById(R.id.buttonSplit);

        //change text color for labels
        textElementP.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.platinum));
        textElementG.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.gold));
        textElementE.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.electrum));
        textElementS.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.silver));
        textElementC.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.copper));

        //listen to Add button
        addListenerOnButton();
        addListenerOnButton1();
        addListenerOnButton2();
        addListenerOnButton3();
    }

    public void addListenerOnButton(){
        Button buttonAdd = findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                EditText editTextP = findViewById(R.id.editTextP);
                EditText editTextG = findViewById(R.id.editTextG);
                EditText editTextE = findViewById(R.id.editTextE);
                EditText editTextS = findViewById(R.id.editTextS);
                EditText editTextC = findViewById(R.id.editTextC);
                TextView textViewPotP = findViewById(R.id.textViewPotP);
                TextView textViewPotG = findViewById(R.id.textViewPotG);
                TextView textViewPotE = findViewById(R.id.textViewPotE);
                TextView textViewPotS = findViewById(R.id.textViewPotS);
                TextView textViewPotC = findViewById(R.id.textViewPotC);
                EditText editTextShares = findViewById(R.id.editTextShares);
                TextView textViewSplitP = findViewById(R.id.textViewSplitP);
                TextView textViewSplitG = findViewById(R.id.textViewSplitG);
                TextView textViewSplitE = findViewById(R.id.textViewSplitE);
                TextView textViewSplitS = findViewById(R.id.textViewSplitS);
                TextView textViewSplitC = findViewById(R.id.textViewSplitC);
                TextView textViewRemainder = findViewById(R.id.textViewRemainder);
                Boolean potChange = Boolean.FALSE;
                int platPot = 0;
                int goldPot = 0;
                int elecPot = 0;
                int silverPot = 0;
                int copperPot = 0;


                if(isEmpty(editTextP)) {
                } else {
                    int plat = Integer.valueOf(editTextP.getText().toString());
                    String platPotString = textViewPotP.getText().toString();
                    platPotString = platPotString.substring(0, platPotString.length() - 2);
                    platPot = Integer.valueOf(platPotString);
                    plat = plat + platPot;
                    textViewPotP.setText(Integer.toString(plat) + "pp");
                    editTextP.setText("");
                    potChange = Boolean.TRUE;
                }
                if(isEmpty(editTextG)) {
                } else {
                    int gold = Integer.valueOf(editTextG.getText().toString());
                    String goldPotString = textViewPotG.getText().toString();
                    goldPotString = goldPotString.substring(0, goldPotString.length() - 2);
                    goldPot = Integer.valueOf(goldPotString);
                    gold = gold + goldPot;
                    textViewPotG.setText(Integer.toString(gold) + "gp");
                    editTextG.setText("");
                    potChange = Boolean.TRUE;
                }
                if(isEmpty(editTextE)) {
                } else {
                    int elec = Integer.valueOf(editTextE.getText().toString());
                    String elecPotString = textViewPotE.getText().toString();
                    elecPotString = elecPotString.substring(0, elecPotString.length() - 2);
                    elecPot = Integer.valueOf(elecPotString);
                    elec = elec + elecPot;
                    textViewPotE.setText(Integer.toString(elec) + "ep");
                    editTextE.setText("");
                    potChange = Boolean.TRUE;
                }
                if(isEmpty(editTextS)) {
                } else {
                    int silver = Integer.valueOf(editTextS.getText().toString());
                    String silverPotString = textViewPotS.getText().toString();
                    silverPotString = silverPotString.substring(0, silverPotString.length() - 2);
                    silverPot = Integer.valueOf(silverPotString);
                    silver = silver + silverPot;
                    textViewPotS.setText(Integer.toString(silver) + "sp");
                    editTextS.setText("");
                    potChange = Boolean.TRUE;
                }
                if(isEmpty(editTextC)) {
                } else {
                    int copper = Integer.valueOf(editTextC.getText().toString());
                    String copperPotCtring = textViewPotC.getText().toString();
                    copperPotCtring = copperPotCtring.substring(0, copperPotCtring.length() - 2);
                    copperPot = Integer.valueOf(copperPotCtring);
                    copper = copper + copperPot;
                    textViewPotC.setText(Integer.toString(copper) + "cp");
                    editTextC.setText("");
                    potChange = Boolean.TRUE;
                }

                if (potChange){

                    String platPotString = textViewPotP.getText().toString();
                    platPotString = platPotString.substring(0, platPotString.length() - 2);
                    platPot = Integer.valueOf(platPotString);

                    String goldPotString = textViewPotG.getText().toString();
                    goldPotString = goldPotString.substring(0, goldPotString.length() - 2);
                    goldPot = Integer.valueOf(goldPotString);

                    String elecPotString = textViewPotE.getText().toString();
                    elecPotString = elecPotString.substring(0, elecPotString.length() - 2);
                    elecPot = Integer.valueOf(elecPotString);

                    String silverPotString = textViewPotS.getText().toString();
                    silverPotString = silverPotString.substring(0, silverPotString.length() - 2);
                    silverPot = Integer.valueOf(silverPotString);

                    String copperPotString = textViewPotC.getText().toString();
                    copperPotString = copperPotString.substring(0, copperPotString.length() - 2);
                    copperPot = Integer.valueOf(copperPotString);


                    int shares = Integer.valueOf(editTextShares.getText().toString());

                    goldPot   = goldPot + ((platPot % shares) * 10);        //left over plat gets converted to gold
                    platPot   = platPot / shares;                           //split plat among shares, dropping remainder
                    silverPot = silverPot + ((goldPot % shares) * 10);      //left over gold gets converted to silver
                    goldPot   = goldPot / shares;                           //split gold among shares, dropping remainder
                    silverPot = silverPot + ((elecPot % shares) * 5);       //left over electrum gets converted to silver
                    elecPot   = elecPot / shares;                           //split electrum among shares, dropping remainder
                    copperPot = copperPot + ((silverPot % shares) * 10);    //left over silver gets converted to copper
                    silverPot = silverPot / shares;                         //split silver among shares, dropping remainder
                    int remainder = copperPot % shares;                     //left over copper goes to it's own variable
                    copperPot = copperPot / shares;                         //split copper among shares, dropping remainder


                    textViewSplitP.setText(Integer.toString(platPot) + "pp");
                    textViewSplitG.setText(Integer.toString(goldPot) + "gp");
                    textViewSplitE.setText(Integer.toString(elecPot) + "ep");
                    textViewSplitS.setText(Integer.toString(silverPot) + "sp");
                    textViewSplitC.setText(Integer.toString(copperPot) + "cp");
                    textViewRemainder.setText(Integer.toString(remainder) + "cp");

/*
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(getApplicationContext(), "Pot Change" + goldPot, duration);
                    toast.show();
*/


                }





            }


        });
    }

    public void addListenerOnButton1(){
        Button buttonSplit = findViewById(R.id.buttonSplit);
        buttonSplit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                TextView textViewPotP = findViewById(R.id.textViewPotP);
                TextView textViewPotG = findViewById(R.id.textViewPotG);
                TextView textViewPotE = findViewById(R.id.textViewPotE);
                TextView textViewPotS = findViewById(R.id.textViewPotS);
                TextView textViewPotC = findViewById(R.id.textViewPotC);
                textViewPotP.setText("0pp");
                textViewPotG.setText("0gp");
                textViewPotE.setText("0ep");
                textViewPotS.setText("0sp");
                textViewPotC.setText("0cp");

            }


        });
    }

    public void addListenerOnButton2() {
        Button buttonReset = findViewById(R.id.buttonReset);
        buttonReset.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View view) {
                TextView textViewSplitP = findViewById(R.id.textViewSplitP);
                TextView textViewSplitG = findViewById(R.id.textViewSplitG);
                TextView textViewSplitE = findViewById(R.id.textViewSplitE);
                TextView textViewSplitS = findViewById(R.id.textViewSplitS);
                TextView textViewSplitC = findViewById(R.id.textViewSplitC);
                TextView textViewPotP = findViewById(R.id.textViewPotP);
                TextView textViewPotG = findViewById(R.id.textViewPotG);
                TextView textViewPotE = findViewById(R.id.textViewPotE);
                TextView textViewPotS = findViewById(R.id.textViewPotS);
                TextView textViewPotC = findViewById(R.id.textViewPotC);
                EditText editTextShares = findViewById(R.id.editTextShares);
                TextView textViewRemainder = findViewById(R.id.textViewRemainder);

                textViewPotP.setText("0pp");
                textViewPotG.setText("0gp");
                textViewPotE.setText("0ep");
                textViewPotS.setText("0sp");
                textViewPotC.setText("0cp");
                textViewSplitP.setText("0pp");
                textViewSplitG.setText("0gp");
                textViewSplitE.setText("0ep");
                textViewSplitS.setText("0sp");
                textViewSplitC.setText("0cp");

            }
        });
    }

    public void addListenerOnButton3(){
        Button buttonTest = findViewById(R.id.buttonTest);
        buttonTest.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                EditText editTextP = findViewById(R.id.editTextP);
                EditText editTextG = findViewById(R.id.editTextG);
                EditText editTextE = findViewById(R.id.editTextE);
                EditText editTextS = findViewById(R.id.editTextS);
                EditText editTextC = findViewById(R.id.editTextC);
                TextView textViewPotP = findViewById(R.id.textViewPotP);
                TextView textViewPotG = findViewById(R.id.textViewPotG);
                TextView textViewPotE = findViewById(R.id.textViewPotE);
                TextView textViewPotS = findViewById(R.id.textViewPotS);
                TextView textViewPotC = findViewById(R.id.textViewPotC);
                EditText editTextShares = findViewById(R.id.editTextShares);
                TextView textViewSplitP = findViewById(R.id.textViewSplitP);
                TextView textViewSplitG = findViewById(R.id.textViewSplitG);
                TextView textViewSplitE = findViewById(R.id.textViewSplitE);
                TextView textViewSplitS = findViewById(R.id.textViewSplitS);
                TextView textViewSplitC = findViewById(R.id.textViewSplitC);
                TextView textViewRemainder = findViewById(R.id.textViewRemainder);
                Boolean potChange = Boolean.FALSE;
                int platPot = 0;
                int goldPot = 0;
                int elecPot = 0;
                int silverPot = 0;
                int copperPot = 0;


                if(isEmpty(editTextP)) {
                } else {
                    int plat = Integer.valueOf(editTextP.getText().toString());
                    String platPotString = textViewPotP.getText().toString();
                    platPotString = platPotString.substring(0, platPotString.length() - 2);
                    platPot = Integer.valueOf(platPotString);
                    plat = plat + platPot;
                    textViewPotP.setText(Integer.toString(plat) + "pp");
                    editTextP.setText("");
                    potChange = Boolean.TRUE;
                }
                if(isEmpty(editTextG)) {
                } else {
                    int gold = Integer.valueOf(editTextG.getText().toString());
                    String goldPotString = textViewPotG.getText().toString();
                    goldPotString = goldPotString.substring(0, goldPotString.length() - 2);
                    goldPot = Integer.valueOf(goldPotString);
                    gold = gold + goldPot;
                    textViewPotG.setText(Integer.toString(gold) + "gp");
                    editTextG.setText("");
                    potChange = Boolean.TRUE;
                }
                if(isEmpty(editTextE)) {
                } else {
                    int elec = Integer.valueOf(editTextE.getText().toString());
                    String elecPotString = textViewPotE.getText().toString();
                    elecPotString = elecPotString.substring(0, elecPotString.length() - 2);
                    elecPot = Integer.valueOf(elecPotString);
                    elec = elec + elecPot;
                    textViewPotE.setText(Integer.toString(elec) + "ep");
                    editTextE.setText("");
                    potChange = Boolean.TRUE;
                }
                if(isEmpty(editTextS)) {
                } else {
                    int silver = Integer.valueOf(editTextS.getText().toString());
                    String silverPotString = textViewPotS.getText().toString();
                    silverPotString = silverPotString.substring(0, silverPotString.length() - 2);
                    silverPot = Integer.valueOf(silverPotString);
                    silver = silver + silverPot;
                    textViewPotS.setText(Integer.toString(silver) + "sp");
                    editTextS.setText("");
                    potChange = Boolean.TRUE;
                }
                if(isEmpty(editTextC)) {
                } else {
                    int copper = Integer.valueOf(editTextC.getText().toString());
                    String copperPotCtring = textViewPotC.getText().toString();
                    copperPotCtring = copperPotCtring.substring(0, copperPotCtring.length() - 2);
                    copperPot = Integer.valueOf(copperPotCtring);
                    copper = copper + copperPot;
                    textViewPotC.setText(Integer.toString(copper) + "cp");
                    editTextC.setText("");
                    potChange = Boolean.TRUE;
                }

                if (potChange){

                    String platPotString = textViewPotP.getText().toString();
                    platPotString = platPotString.substring(0, platPotString.length() - 2);
                    platPot = Integer.valueOf(platPotString);

                    String goldPotString = textViewPotG.getText().toString();
                    goldPotString = goldPotString.substring(0, goldPotString.length() - 2);
                    goldPot = Integer.valueOf(goldPotString);

                    String elecPotString = textViewPotE.getText().toString();
                    elecPotString = elecPotString.substring(0, elecPotString.length() - 2);
                    elecPot = Integer.valueOf(elecPotString);

                    String silverPotString = textViewPotS.getText().toString();
                    silverPotString = silverPotString.substring(0, silverPotString.length() - 2);
                    silverPot = Integer.valueOf(silverPotString);

                    String copperPotString = textViewPotC.getText().toString();
                    copperPotString = copperPotString.substring(0, copperPotString.length() - 2);
                    copperPot = Integer.valueOf(copperPotString);


                    int shares = Integer.valueOf(editTextShares.getText().toString());

                    goldPot   = goldPot + ((platPot % shares) * 10);        //left over plat gets converted to gold
                    platPot   = platPot / shares;                           //split plat among shares, dropping remainder
                    silverPot = silverPot + ((goldPot % shares) * 10);      //left over gold gets converted to silver
                    goldPot   = goldPot / shares;                           //split gold among shares, dropping remainder
                    silverPot = silverPot + ((elecPot % shares) * 5);       //left over electrum gets converted to silver
                    elecPot   = elecPot / shares;                           //split electrum among shares, dropping remainder
                    copperPot = copperPot + ((silverPot % shares) * 10);    //left over silver gets converted to copper
                    silverPot = silverPot / shares;                         //split silver among shares, dropping remainder
                    int remainder = copperPot % shares;                     //left over copper goes to it's own variable
                    copperPot = copperPot / shares;                         //split copper among shares, dropping remainder


                    textViewSplitP.setText(Integer.toString(platPot) + "pp");
                    textViewSplitG.setText(Integer.toString(goldPot) + "gp");
                    textViewSplitE.setText(Integer.toString(elecPot) + "ep");
                    textViewSplitS.setText(Integer.toString(silverPot) + "sp");
                    textViewSplitC.setText(Integer.toString(copperPot) + "cp");
                    textViewRemainder.setText(Integer.toString(remainder) + "cp");

/*
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(getApplicationContext(), "Pot Change" + goldPot, duration);
                    toast.show();
*/


                }





            }


        });
    }


}
