# Java 8-Puzzle

A classic **8-Puzzle game built in Java Swing**. The project allows the player to move numbered tiles into the empty space, shuffle the puzzle, and automatically check when the puzzle is solved.

## Features

* 3×3 sliding puzzle interface
* Manual tile movement using buttons
* Shuffle functionality
* Solvable shuffle generated through legal tile movements
* Automatic win detection
* Win notification using `JOptionPane`
* Disabled puzzle buttons after winning
* Solve button prepared for an **A* search solver**
* Board state separated from the Swing UI using a `Board` class
* Manhattan Distance heuristic implemented for A*

## Technologies Used

* **Java**
* **Java Swing**
* **AWT**
* **Object-Oriented Programming**
* **A* Search Algorithm** *(in development)*

## Project Structure

```text
EightPuzzle/
│
├── EightPuzzle.java
├── Board.java
├── Node.java
└── Solver.java
```

### `EightPuzzle.java`

Contains the Swing user interface and game controls:

* Puzzle buttons
* Shuffle button
* Solve button
* Tile movement
* Win detection
* Board/UI conversion

### `Board.java`

Represents the puzzle state independently from the Swing interface.

The board uses:

```text
0 = empty space
```

Example:

```java
{1, 2, 3,
 4, 5, 6,
 7, 0, 8}
```

It currently provides:

* `isGoal()`
* `getTiles()`
* `manhattanDistance()`

### `Node.java`

Represents a state used by the A* search algorithm.

A node stores:

* Board state
* Parent node
* `g` cost
* `h` heuristic
* `f` total cost

The A* relationship is:

```text
f = g + h
```

### `Solver.java`

Will contain the A* search implementation.

The planned solver will:

1. Take the current board.
2. Generate possible neighboring states.
3. Calculate the Manhattan Distance.
4. Select the state with the lowest `f` value.
5. Continue until the goal state is reached.
6. Reconstruct the solution path.
7. Send the moves back to the Swing interface.

## How the Puzzle Works

The goal configuration is:

```text
┌───┬───┬───┐
│ 1 │ 2 │ 3 │
├───┼───┼───┤
│ 4 │ 5 │ 6 │
├───┼───┼───┤
│ 7 │ 8 │   │
└───┴───┴───┘
```

The player can move a tile only when it is adjacent to the empty space.

For example:

```text
1 2 3
4 5 _
7 8 6
```

The `6` can move into the empty position.

## A* Heuristic

The project uses **Manhattan Distance** as the heuristic.

For every numbered tile, the algorithm calculates how many horizontal and vertical moves are required to reach its goal position.

The blank tile (`0`) is ignored.

For example:

```text
Current:

2 1 3
4 5 6
7 _ 8
```

The algorithm calculates the total distance of the misplaced tiles from their goal positions.

A solved board has:

```text
Manhattan Distance = 0
```

A shuffled board normally has a value greater than `0`.

## Running the Project

### Requirements

* Java JDK installed
* Java-compatible IDE such as IntelliJ IDEA, Eclipse, or VS Code

### Compile

```bash
javac EightPuzzle.java Board.java Node.java
```

### Run

```bash
java EightPuzzle
```

Or run `EightPuzzle.java` directly from your IDE.

## Current Status

### Completed

* [x] Swing UI
* [x] 3×3 puzzle
* [x] Manual movement
* [x] Shuffle
* [x] Win detection
* [x] Board representation
* [x] Goal-state detection
* [x] Manhattan Distance heuristic
* [x] A* project structure

### In Progress

* [ ] Generate neighboring board states
* [ ] Implement A* search
* [ ] Reconstruct solution path
* [ ] Automatically animate the solution
* [ ] Complete the Solve button

## Future Improvements

* A* automatic solving
* Animated bot solving
* Move counter
* Timer
* Best-score tracking
* Difficulty selection
* Move history
* Restart button
* Better UI animations
* Separate model, view, and controller architecture

## Author

**Rohit Kallurkar**

GitHub: `ROHITKALLURKAR1`

## License

This project is open source and can be used for learning, modification, and experimentation.
