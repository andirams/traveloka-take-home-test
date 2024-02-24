package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import starter.pages.PuzzlePage;

public class PuzzleSteps {
    @Steps
    PuzzlePage puzzlePage;

    @Given("Solving puzzle")
    public void solvingPuzzle() {
        puzzlePage.open();
        puzzlePage.clickKotak();
    }

}
