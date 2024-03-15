package round;

public abstract class PointsDeducted implements Round{

    private String roundScore;
    public byte redBoxerScore;

    public byte blueBoxerScore;

    public PointsDeducted(String roundScore, byte redBoxerScore, byte blueBoxerScore) {
        this.roundScore = roundScore;
        this.redBoxerScore = redBoxerScore;
        this.blueBoxerScore = blueBoxerScore;
    }


    public void BoxerRoundScore(){


    }

private byte parseComaBlue(String Score){

        return 1;
}

private byte parseComaRed(String Score){

        return 1;
}

    @Override
    public String toString() {
        return "PointsDeducted{" +
                "roundScore='" + roundScore + '\'' +
                ", redBoxerScore=" + redBoxerScore +
                ", blueBoxerScore=" + blueBoxerScore +
                '}';
    }
}
