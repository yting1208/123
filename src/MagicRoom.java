public class MagicRoom extends Room {
    public MagicRoom(int roomNumber) {
        super(roomNumber);
    }

    public void castSpell() {
        System.out.println("在魔法房間中施展魔法");
    }
}