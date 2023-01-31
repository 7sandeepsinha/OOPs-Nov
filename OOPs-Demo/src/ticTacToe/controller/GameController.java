package ticTacToe.controller;

import ticTacToe.models.Game;
import ticTacToe.models.GameStatus;
import ticTacToe.models.Player;

import java.util.List;

public class GameController {

    public void undo(Game game){
        game.undo();
    }

    public Game createGame(int dimension, List<Player> players){
        try{
            return Game.getBuilder()
                    .setDimension(dimension)
                    .setPlayers(players)
                    .build();
        } catch (Exception e){
            System.out.println("Caught an exception");
            e.printStackTrace();
            return null;
        }
    }

    public void displayBoard(Game game){
        game.displayBoard();
    }

    public GameStatus getGameStatus(Game game){
        return game.getGameStatus();
    }

    public void exectureNextMove(Game game){
        game.makeNextMove();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }
}
