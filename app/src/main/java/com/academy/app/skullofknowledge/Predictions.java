package com.academy.app.skullofknowledge;


import java.util.Random;

public class Predictions {

    private static Predictions predictions;
    private String[] answers;

    private Predictions(){
    answers = new String[]{
        "not today (https://www.youtube.com)","you are dying of boredom (http://www.boredbutton.com/random)",
            "you strive for meaning (https://en.wikipedia.org/wiki/Meaning_of_life)","you may die soon (http://deathtimer.com/)",
            "strange things are happening (http://ww.newsoftheweird.com)"
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

        Random r = new Random();
        int roll = r.nextInt(answers.length);


        return (answers[roll]);

      //  return  answers[4];

    }
}
