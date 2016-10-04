package com.academy.app.skullofknowledge;


import java.util.Random;

public class Predictions {

    private static Predictions predictions;
    private String[] answers;

    private Predictions(){
    answers = new String[]{
        "not today (https://www.youtube.com)","you are dying of boredom (http://www.boredbutton.com/random)",
            "you strive for meaning (https://en.wikipedia.org/wiki/Meaning_of_life)","you may die soon (http://deathtimer.com/)"
    };
    }

    public static Predictions get(){
        if(predictions == null){
            predictions = new Predictions();
        }
//        String[] array = context.getResources().getStringArray(R.answers);
//        String randomStr = array[new Random().nextInt(array.length)];
        return predictions;
    }

    public String getPrediction(){
        return  answers[2];
    }
}
