public class MazeGame implements MazeBuilder {
    private Maze currentMaze;
    private int roomNumber = 1; // 初始化房間編號

    @Override
    public void buildMaze(MazeFactory factory) {
        currentMaze = new Maze();
    }

    @Override
    public void buildRoom(int roomNumber, MazeFactory factory) {
        Room room = factory.createRoom(roomNumber); // 將房間編號傳遞給 createRoom
        room.enter();
        currentMaze.addRoom(room);
    }

    @Override
    public void buildDoor(int roomFrom, int roomTo, MazeFactory factory) {
        Room room1 = currentMaze.getRoom(roomFrom);
        Room room2 = currentMaze.getRoom(roomTo);

        if (room1 != null && room2 != null) {
            Door door = factory.createDoor(room1, room2);
            door.enter();
            room1.setSide(CommonWall(room1, room2), door);
            room2.setSide(CommonWall(room2, room1), door);
        } else {
            // 處理錯誤，例如房間不存在
            System.out.println("錯誤：找不到房間");
        }
    }

    @Override
    public Maze getMaze() {
        return currentMaze;
    }

    private Direction CommonWall(Room room1, Room room2) {
        // 確定兩個房間之間的共同牆壁方向
        return null;
    }
}
