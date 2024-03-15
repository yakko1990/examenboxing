package round;

public abstract class KnockdownRound implements Round {

private String roundScore;

public byte redBoxerScore;

public byte blueBoxerScore;

    public KnockdownRound(String roundScore, byte redBoxerScore, byte blueBoxerScore) {
        this.roundScore = roundScore;
        this.redBoxerScore = redBoxerScore;
        this.blueBoxerScore = blueBoxerScore;
    }


    public void BoxerRoundScore(){


    }

    @Override
    public String toString() {
        return "KnockdownRound{" +
                "roundScore='" + roundScore + '\'' +
                ", redBoxerScore=" + redBoxerScore +
                ", blueBoxerScore=" + blueBoxerScore +
                '}';
    }
}
