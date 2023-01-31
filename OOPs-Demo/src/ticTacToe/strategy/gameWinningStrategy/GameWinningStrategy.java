package ticTacToe.strategy.gameWinningStrategy;

import ticTacToe.models.Board;
import ticTacToe.models.Move;
import ticTacToe.models.Player;

public interface GameWinningStrategy {
    boolean updateBoardAndCheckWinner(Board board, Player lastMovePlayer, Move lastMove);
}
