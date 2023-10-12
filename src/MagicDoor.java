public class MagicDoor extends Door {
    public MagicDoor(Room room1, Room room2) {
        super(room1, room2);
    }

    public void open() {
        System.out.println("打開魔法門");
    }
}