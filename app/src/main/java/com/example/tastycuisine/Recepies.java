package com.example.tastycuisine;

public class Recepies {
    private String RecepieName;
    private String RecepieIngredients;
    private  String RecepieMethodTitle;
    private String Recepie;
    private int Thumbnail;



    public Recepies(String name,String recepieingredients,String recepieMethodTitle,String recepie,int thumbnail){

        RecepieName = name;
        RecepieIngredients = recepieingredients;
        RecepieMethodTitle = recepieMethodTitle;
        Recepie = recepie;
        Thumbnail =thumbnail;
    }

    public String getRecepieName() {
        return RecepieName;
    }

    public String getRecepieIngredients() {
        return RecepieIngredients;
    }

    public String getRecepieMethodTitle() {
        return RecepieMethodTitle;
    }

    public String getRecepie() {
        return Recepie;
    }

    public int getThumbnail() {
        return Thumbnail;
    }
}
