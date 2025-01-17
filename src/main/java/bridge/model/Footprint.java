package bridge.model;

import java.util.ArrayList;
import java.util.List;

public class Footprint {
    private ArrayList<String> footprint;

    public Footprint(ArrayList<String> footprint) {
        this.footprint = footprint;
    }

    public void makeNewFootprint(boolean isCorrect) {
        if (isCorrect) {
            footprint.add("O");
        }
        if (!isCorrect){
            footprint.add("X");
        }
    }

    public ArrayList<String> getFootprint() {
        return footprint;
    }

    public boolean isEnd() {
        return footprint.contains("X");
    }

    public boolean done(int bridgeSize) {
        return footprint.size() == bridgeSize;
    }
}
