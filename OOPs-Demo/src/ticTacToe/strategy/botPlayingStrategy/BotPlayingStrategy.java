package ticTacToe.strategy.botPlayingStrategy;

import ticTacToe.models.Board;
import ticTacToe.models.Move;
import ticTacToe.models.Player;

public interface BotPlayingStrategy {
    Move decideMove(Player player, Board board);
}
