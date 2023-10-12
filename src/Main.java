public class Main {
    public static void main(String[] args) {
        MazeGame game = new MazeGame();

        // 創建魔法迷宮
        MazeFactory magicFactory = new MagicMazeFactory();
        game.buildMaze(magicFactory);
        game.buildRoom(1, magicFactory);
        game.buildRoom(2, magicFactory);
        game.buildDoor(1, 2, magicFactory);
        Maze magicMaze = game.getMaze();

        // 創建普通迷宮
        MazeFactory ordinaryFactory = new OrdinaryMazeFactory();
        game.buildMaze(ordinaryFactory);
        game.buildRoom(1, ordinaryFactory);
        game.buildRoom(2, ordinaryFactory);
        game.buildDoor(1, 2, ordinaryFactory);
        Maze ordinaryMaze = game.getMaze();
    }
}