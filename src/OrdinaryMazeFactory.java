public class OrdinaryMazeFactory implements MazeFactory {
    @Override
    public Room createRoom(int roomNumber) {
        return new OrdinaryRoom(roomNumber);
    }

    @Override
    public Door createDoor(Room room1, Room room2) {
        return new OrdinaryDoor(room1, room2);
    }
}