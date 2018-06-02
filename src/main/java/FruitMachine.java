import java.util.Random;

public class FruitMachine {

    Selection reelOneChoice;
    Selection reelTwoChoice;
    Selection reelThreeChoice;

    public FruitMachine(Selection reelOneChoice, Selection reelTwoChoice, Selection reelThreeChoice) {
        this.reelOneChoice = reelOneChoice;
        this.reelTwoChoice = reelTwoChoice;
        this.reelThreeChoice = reelThreeChoice;

    }

    public Selection randomiseReelChoice() {
        Selection[] array = {Selection.APPLE, Selection.ORANGE, Selection.PEAR};
        Random choice = new Random();
        int select = choice.nextInt(array.length);
        return array[select];
    }

    public Selection getSelection(Selection choice) {
        return this.reelOneChoice = choice;
    }



}
