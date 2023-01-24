package ticTacToe.models;

import ticTacToe.exceptions.InvalidGameCreationParametersException;
import ticTacToe.strategy.gameWinningStrategy.EfficientGameWinningStrategy;
import ticTacToe.strategy.gameWinningStrategy.GameWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private GameStatus gameStatus;
    private int nextPlayerIndex;
    private GameWinningStrategy gameWinningStrategy;
    private Player winner;

    private Game(){}

    public void undo(){

    }

    public void makeNextMove(){
        // keep the game running
        // if after a move, a player wins, the game will end
        // else the game will keep running to the next player
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public GameWinningStrategy getGameWinningStrategy() {
        return gameWinningStrategy;
    }

    public void setGameWinningStrategy(GameWinningStrategy gameWinningStrategy) {
        this.gameWinningStrategy = gameWinningStrategy;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
        private int dimension;
        private List<Player> players;

        public Builder setDimension(int dimension){
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayer(List<Player> players){
            this.players = players;
            return this;
        }

        private boolean valid() throws InvalidGameCreationParametersException{
            if(this.dimension < 3){
                throw new InvalidGameCreationParametersException("Dimensions should greater than or equal to 3");
            }

            if(this.players.size() != this.dimension - 1){
                throw new InvalidGameCreationParametersException("Players should be equal to Dimension - 1 ");
            }
            //TODO
            //validate number of players
            //validate maximum number of bots = 1
            //validate at least 2 players and 1 human player
            return true;
        }

        public Game build() throws InvalidGameCreationParametersException{
            try{
                valid();
            } catch (Exception e){
                throw new InvalidGameCreationParametersException("Game could not be created");
            }
            Game game = new Game();
            game.setGameStatus(GameStatus.IN_PROGRESS);
            game.setPlayers(players);
            game.setMoves(new ArrayList<>());
            game.setBoard(new Board(dimension));
            game.setNextPlayerIndex(0);
            game.setGameWinningStrategy(new EfficientGameWinningStrategy());

            return game;
        }
    }
}
