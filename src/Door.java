public class Door extends MapSite {
    private Room room1;
    private Room room2;

    public Door(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    @Override
    public void enter() {
        System.out.println("穿過門，連接房間 " + room1.getRoomNumber() + " 和房間 " + room2.getRoomNumber());
    }
}