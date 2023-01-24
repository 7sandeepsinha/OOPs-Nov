package ticTacToe.strategy.gameWinningStrategy;

import ticTacToe.models.Board;
import ticTacToe.models.Move;
import ticTacToe.models.Player;

public class EfficientGameWinningStrategy implements GameWinningStrategy{
    @Override
    public boolean checkWinner(Board board, Player lastMovePlayer, Move lastMove) {
        return false;
    }
}
