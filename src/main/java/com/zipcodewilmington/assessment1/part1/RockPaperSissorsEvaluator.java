package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String winningMove = "";
        if (handSign.equals(ROCK)) {
            winningMove = PAPER;
        }
        else if (handSign.equals(PAPER)) {
            winningMove = SCISSOR;
        }
        else if (handSign.equals(SCISSOR)) {
            winningMove = ROCK;
        }
        return winningMove;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {

        String losingMove = "";
        if (handSign.equals(ROCK)) {
            losingMove = SCISSOR;
        }
        else if (handSign.equals(PAPER)) {
            losingMove = ROCK;
        }
        else if (handSign.equals(SCISSOR)) {
            losingMove = PAPER;
        }
        return losingMove;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String winner = "";

        if (handSignOfPlayer1.equals(ROCK) && handSignOfPlayer2.equals(PAPER) || handSignOfPlayer1.equals(PAPER) && handSignOfPlayer2.equals(ROCK)) {
            winner = PAPER;
        } else if (handSignOfPlayer1.equals(ROCK) && handSignOfPlayer2.equals(SCISSOR) || handSignOfPlayer1.equals(SCISSOR) && handSignOfPlayer2.equals(ROCK)) {
            winner = ROCK;
        } else if (handSignOfPlayer1.equals(PAPER) && handSignOfPlayer2.equals(SCISSOR) || handSignOfPlayer1.equals(SCISSOR) && handSignOfPlayer2.equals(PAPER)) {
            winner = SCISSOR;
        }
        return winner;
    }
}
