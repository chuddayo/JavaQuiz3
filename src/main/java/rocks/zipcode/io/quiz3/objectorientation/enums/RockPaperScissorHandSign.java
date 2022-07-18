package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK("ROCK"),
    PAPER("PAPER"),
    SCISSOR("SCISSOR");
    private final String sign;
    RockPaperScissorHandSign(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }

    public RockPaperScissorHandSign getWinner() {
        if (sign.equals("SCISSOR")) {
            return RockPaperScissorHandSign.valueOf("ROCK");
        } else if(sign.equals("ROCK")) {
            return RockPaperScissorHandSign.valueOf("PAPER");
        } else {
            return RockPaperScissorHandSign.valueOf("SCISSOR");
        }
    }

    public RockPaperScissorHandSign getLoser() {
        if (sign.equals("SCISSOR")) {
            return RockPaperScissorHandSign.valueOf("PAPER");
        } else if(sign.equals("ROCK")) {
            return RockPaperScissorHandSign.valueOf("SCISSOR");
        } else {
            return RockPaperScissorHandSign.valueOf("ROCK");
        }
    }
}
