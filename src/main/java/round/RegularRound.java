package round;

public abstract class RegularRound implements Round {
    private String roundScore;
    public byte redBoxerScore;

    public byte blueBoxerScore;


    public RegularRound(String roundScore, byte redBoxerScore, byte blueBoxerScore) {
        this.roundScore = roundScore;
        this.redBoxerScore = redBoxerScore;
        this.blueBoxerScore = blueBoxerScore;
    }

    public void BoxerRoundScore(){


    }


    @Override
    public String toString() {
        return "RegularRound{" +
                "roundScore='" + roundScore + '\'' +
                ", redBoxerScore=" + redBoxerScore +
                ", blueBoxerScore=" + blueBoxerScore +
                '}';
    }
}
