import controllers.GameController;
import exceptions.BotCountException;
import exceptions.PlayerCountDimensionMismatchException;
import exceptions.SymbolCountException;
import models.Game;
import models.GameState;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws BotCountException, SymbolCountException, PlayerCountDimensionMismatchException {
        GameController gameController = new GameController();
        System.out.println("Game is Starting!");
        //Game game = new Game();
        Game game = gameController.startGame(3, new ArrayList<>(), new ArrayList<>());

        while (gameController.checkState(game).equals(GameState.IN_PROGRESS)){
            gameController.displayBoard(game);
            gameController.makeMove(game);
        }
        if (gameController.checkState(game).equals((GameState.SUCCESS))){
            System.out.println("Winner is some player");
        } else if (gameController.checkState(game).equals(GameState.DRAW)) {
            System.out.println("Game is Drawn");
        }

    }
}