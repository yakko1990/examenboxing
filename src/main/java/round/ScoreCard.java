package round;

import java.util.ArrayList;
import java.util.List;

public class ScoreCard {

   private String color;
   private String redCorner = "";
   private String blueCorner = "";

   private String JudgeScoreCard;
   public ArrayList<Integer> Round= new ArrayList<>();

   public ScoreCard(String color, String redCorner, String blueCorner, String judgeScoreCard, ArrayList<Integer> round) {
      this.color = color;
      this.redCorner = redCorner;
      this.blueCorner = blueCorner;
      JudgeScoreCard = judgeScoreCard;
      Round = round;
   }


   public void setRedCorner(String redCorner) {
      this.redCorner = redCorner;
   }



   public void setBlueCorner(String blueCorner) {
      this.blueCorner = blueCorner;
   }



   public byte getNumRounds() {
      return 1;
   }

   public String loadJudgeScoreCard() {

       return "score";
   }


   public int getBlueBoxingFinalScore(){


      return 0;
   }


   public int getRedBoxingFinalScore(){


       return 0;
   }


   private String viewround(){


       return "round";
   }


}
