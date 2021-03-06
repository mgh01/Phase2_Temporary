package sample.View.Components;

import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import sample.Model.Game.Phase;
import sample.View.GameViewController;


import java.util.ArrayList;

public class GameStatus {
    private Phase phase;
    private Rectangle selectedCard;
    private ArrayList<Rectangle> tributes;
    private GameMode gameMode;
    private GameViewController myController;
    private AnchorPane myPane;

    public GameStatus(AnchorPane mainPane,GameViewController controller){
        myController = controller;
        myPane = mainPane;
        gameMode = GameMode.NONE;
    }

    public void setPhase(Phase phase) {
        this.phase = phase;
    }

    public Phase getPhase() {
        return phase;
    }

    public Rectangle getSelectedCard() {
        return selectedCard;
    }

    public void setSelectedCard(Rectangle selectedCard) {
        this.selectedCard = selectedCard;
    }

    public ArrayList<Rectangle> getTributes() {
        return tributes;
    }

    public void setTributes(ArrayList<Rectangle> tributes) {
        this.tributes = tributes;
    }

    public GameMode getGameMode() {
        return gameMode;
    }

    public void setGameMode(GameMode gameMode) {
        this.gameMode = gameMode;
    }

    public void reset(ActionEvent actionEvent) {
        gameMode = GameMode.NONE;
        if(selectedCard != null){
            myController.cardInfo.setFill(Color.BLACK);
            myController.board.getActivePlayer().activateCard(selectedCard);
            selectedCard = null;
        }

        if(tributes == null)
            return;
        for (Rectangle tribute : tributes) {
            if(tribute != null)
                myController.board.getActivePlayer().activateCard(tribute);
        }
    }
}
