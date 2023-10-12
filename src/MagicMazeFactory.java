public class MagicMazeFactory implements MazeFactory {
    @Override
    public Room createRoom(int roomNumber) {
        return new MagicRoom(roomNumber);
    }

    @Override
    public Door createDoor(Room room1, Room room2) {
        return new MagicDoor(room1, room2);
    }
}