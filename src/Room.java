import java.util.Map;
import java.util.HashMap;
public class Room {
    private int roomNumber;
    private Map<Direction, MapSite> sides; // 用來存儲房間的不同面

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.sides = new HashMap<>();
    }

    public void enter() {
        System.out.println("進入房間 " + roomNumber);
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setSide(Direction direction, MapSite side) {
        sides.put(direction, side);
    }

    public MapSite getSide(Direction direction) {
        return sides.get(direction);
    }
}