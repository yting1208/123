public interface MazeFactory {
    Room createRoom(int roomNumber); // 帶有房間編號的方法
    Door createDoor(Room room1, Room room2);
}