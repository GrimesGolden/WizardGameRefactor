package edu.sdccd.cisc191.wizardGame.gui.screen.levels;

import edu.sdccd.cisc191.wizardGame.Game;
import edu.sdccd.cisc191.wizardGame.gui.screen.GamePanel;


public class LevelTwo extends AbstractLevel {

    public LevelTwo(Game game, GamePanel gamePanel) {
        super(game, gamePanel);

        currentFloor = floorTwo; // Set floor type.
        levelNum = game.getLevelNumber(); // Set level number.
        loadLevel(getLevelMap(levelNum)); // Load level.
    }
}
