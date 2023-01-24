package ticTacToe.factory;

import ticTacToe.models.BotDifficultyLevel;
import ticTacToe.strategy.botPlayingStrategy.BotPlayingStrategy;
import ticTacToe.strategy.botPlayingStrategy.RandomBotPlayingStrategy;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getPlayingStrategyForDifficultyLevel(BotDifficultyLevel botDifficultyLevel){
        return new RandomBotPlayingStrategy();
        /*
               switch(strategy) {
                    case : EASY
                            return new EasyBotPlayingStrategy();


               }
         */
    }
}
