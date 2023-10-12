public interface MazeBuilder {
    void buildMaze(MazeFactory factory);
    void buildRoom(int roomNumber, MazeFactory factory);
    void buildDoor(int roomFrom, int roomTo, MazeFactory factory);
    Maze getMaze();
}
