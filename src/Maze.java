import java.util.Map;
import java.util.HashMap;
public class Maze {
    // 迷宮的內部表示
    private Map<Integer, Room> rooms = new HashMap<>();
    private Map<Integer, Door> doors = new HashMap<>();

    public void addRoom(Room room) {
        rooms.put(room.getRoomNumber(), room);
    }

    public Room getRoom(int roomNumber) {
        return rooms.get(roomNumber);
    }

    public void addDoor(Door door, int roomFrom, int roomTo) {
        doors.put(roomFrom, door);
        doors.put(roomTo, door);
    }

    public Door getDoor(int roomFrom, int roomTo) {
        return doors.get(roomFrom);
    }
}

