import java.util.ArrayList;
import java.util.List;

public class Board {

    private int[] tiles;

    public Board(int[] tiles) {
        this.tiles = tiles.clone();
    }

    public int[] getTiles() {
        return tiles.clone();
    }

    public boolean isGoal() {

        int[] goal = {1,2,3,4,5,6,7,0,8};

        for(int i=0;i<9;i++){

            if(tiles[i]!=goal[i])
                return false;

        }

        return true;
    }

    public int manhattanDistance() {

    int distance = 0;
    for (int i = 0; i < 9; i++) {
         if (tiles[i] == 0)
            continue;
        int currentRow = i / 3;
        int currentCol = i % 3;

        int goalIndex = tiles[i] - 1;
        int goalRow = goalIndex / 3;
        int goalCol = goalIndex % 3;

        distance += Math.abs(currentRow - goalRow)
                 + Math.abs(currentCol - goalCol);

    }

    return distance;
    }

    public List<Board> getNeighbors() {

    List<Board> neighbors = new ArrayList<>();

    return neighbors;
}

}