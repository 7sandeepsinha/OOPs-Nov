package ticTacToe.strategy.gameWinningStrategy;

import ticTacToe.models.Board;
import ticTacToe.models.Move;
import ticTacToe.models.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EfficientGameWinningStrategy implements GameWinningStrategy{
    List<HashMap<Character,Integer>> rowSymbolCount = new ArrayList<>();
    List<HashMap<Character,Integer>> colSymbolCount = new ArrayList<>();
    HashMap<Character,Integer> topLeftDiagSymbolCount = new HashMap<>();
    HashMap<Character,Integer> bottomLeftDiagSymbolCount = new HashMap<>();
    int dimension;

    public EfficientGameWinningStrategy(int dimension) {
        for(int i=0;i<dimension;i++){
            rowSymbolCount.add(new HashMap<>());
            colSymbolCount.add(new HashMap<>());
        }
        this.dimension = dimension;
    }

    public boolean isTopLeftDiag(int row, int col){
        return row == col;
    }
    public boolean isBottomLeftDiag(int row, int col){
        return row+col == dimension-1;
    }


    @Override
    public boolean updateBoardAndCheckWinner(Board board, Player lastMovePlayer, Move lastMove) {
        char symbol = lastMovePlayer.getSymbol();
        int row = lastMove.getCell().getRow();
        int col = lastMove.getCell().getCol();

        rowSymbolCount.get(row).put(symbol, rowSymbolCount.get(row).getOrDefault(symbol,0) + 1);
        colSymbolCount.get(col).put(symbol, rowSymbolCount.get(col).getOrDefault(symbol,0) + 1);

        if(isTopLeftDiag(row, col)){
            topLeftDiagSymbolCount.put(symbol, topLeftDiagSymbolCount.getOrDefault(symbol,0) + 1);
        }

        if(isBottomLeftDiag(row, col)){
            bottomLeftDiagSymbolCount.put(symbol, bottomLeftDiagSymbolCount.getOrDefault(symbol,0) + 1);
        }
        return checkWinnerLogic(row, col, symbol);
    }

    private boolean checkWinnerLogic(int row, int col, char symbol){
        if(rowSymbolCount.get(row).get(symbol) == dimension)
            return true;
        if(colSymbolCount.get(col).get(symbol) == dimension)
            return true;
        if(isTopLeftDiag(row, col)){
            if(topLeftDiagSymbolCount.get(symbol) == dimension)
                return true;
        }
        if(isBottomLeftDiag(row, col)){
            if(bottomLeftDiagSymbolCount.get(symbol) == dimension)
                return true;
        }
        return false;
    }
}
