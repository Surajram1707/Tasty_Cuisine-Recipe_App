package com.example.tastycuisine;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Objects;

public class RecepieActivity extends AppCompatActivity {

    private TextView mRecepieName;
    private TextView mRecepieIngredients;
    private TextView mRecepieMethodTitle;
    private TextView mRecepie;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepie);

        mRecepieName = (TextView)findViewById(R.id.text_recepie);
        mRecepieIngredients = (TextView)findViewById(R.id.ingredients);
        mRecepieMethodTitle = (TextView)findViewById(R.id.method);
        mRecepie = (TextView)findViewById(R.id.recepie);

        Intent intent =getIntent();
        String Title = intent.getExtras().getString("RecepieName");
        String Ingredients = intent.getExtras().getString("RecepieIngredients");
        String MethodTitle = intent.getExtras().getString("RecepieMethodTitle");
        String Recepie = intent.getExtras().getString("Recepie");


        mRecepieName.setText(Title);
        mRecepieIngredients.setText(Ingredients);
        mRecepieMethodTitle.setText(MethodTitle);
        mRecepie.setText(Recepie);
    }
}