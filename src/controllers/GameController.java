package controllers;

import exceptions.BotCountException;
import exceptions.PlayerCountDimensionMismatchException;
import exceptions.SymbolCountException;
import models.Game;
import models.GameState;
import models.Player;
import strategies.winningStrategies.WinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(int dimension,
                          List<Player> players,
                          List<WinningStrategy> winningStrategies) throws BotCountException, SymbolCountException, PlayerCountDimensionMismatchException {
        //We will create the game
        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public void displayBoard(Game game){

    }

    public void makeMove(Game game){

    }

    public void undo(Game game){

    }

    public GameState checkState(Game game){
        return game.getGameState();
    }

    public void getWinner(Game game)
    {

    }

}
