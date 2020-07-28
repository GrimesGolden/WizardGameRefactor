package edu.sdccd.cisc191.wizardGame.gui.screen.levels;

import edu.sdccd.cisc191.wizardGame.Game;
import edu.sdccd.cisc191.wizardGame.gui.screen.GamePanel;


public class Level extends AbstractLevel {

    public Level(Game game, GamePanel gamePanel) {
        super(game, gamePanel);

        levelNum = game.getLevelNumber();

        currentFloor = getFloorImage(levelNum);
        levelNum = game.getLevelNumber(); // Set level number.
        loadLevel(getLevelMap(levelNum)); // Load level.
    }
}
