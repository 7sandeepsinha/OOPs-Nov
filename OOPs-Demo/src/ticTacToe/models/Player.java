package ticTacToe.models;

import java.util.Scanner;

public class Player {
    private char symbol;
    private String name;
    private PlayerType type;

    public Player(char symbol, String name, PlayerType type) {
        this.symbol = symbol;
        this.name = name;
        this.type = type;
    }

    public Move decideMove(Board board){
        Scanner s = new Scanner(System.in);
        System.out.println("Please tell the row : ");
        int row = s.nextInt();

        System.out.println("Please tell the column : ");
        int col = s.nextInt();

        return new Move(this, new Cell(row, col));
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getType() {
        return type;
    }

    public void setType(PlayerType type) {
        this.type = type;
    }
}
