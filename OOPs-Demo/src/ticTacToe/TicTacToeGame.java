package ticTacToe;

import ticTacToe.controller.GameController;
import ticTacToe.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the dimension");
        int dimension = sc.nextInt();

        GameController gameController = new GameController();

        System.out.println("Will there be any bot in the game? Y/N");
        String isBotString = sc.next();

        List<Player> players = new ArrayList<>();
        int toIterate = dimension - 1;

        if(isBotString.equalsIgnoreCase("Y")){
            toIterate = dimension - 2;
        }

        for(int i=0;i<toIterate;i++){
            System.out.println("What is the name of the player number : " + i);
            String playerName = sc.next();

            System.out.println("What is the symbol of the player number : " + i);
            String playerSymbol = sc.next();

            players.add(new Player(playerSymbol.charAt(0), playerName, PlayerType.HUMAN));
        }

        if(isBotString.equalsIgnoreCase("Y")){
            System.out.println("What is the name of the bot");
            String botName = sc.next();

            System.out.println("What is the character of the bot?");
            String botChar = sc.next();

            players.add(new Bot(botChar.charAt(0), botName, BotDifficultyLevel.EASY));
        }

        Game game = gameController.createGame(dimension, players);

        while(gameController.getGameStatus(game).equals(GameStatus.IN_PROGRESS)){
            System.out.println("This is the current board");
            gameController.displayBoard(game);

            System.out.println("Does anyone want to undo? Y/N");
            String undoInput = sc.next();

            if(undoInput.equalsIgnoreCase("Y")){
                game.undo();
            } else{
                game.makeNextMove();
            }
        }

        System.out.println("Game has ended, result is " + game.getGameStatus());
        if(game.getGameStatus().equals(GameStatus.ENDED)){
            System.out.println("Winner is " + game.getWinner().getName());
        }

    }
}
