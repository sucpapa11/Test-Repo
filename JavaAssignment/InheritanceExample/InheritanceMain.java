package InheritanceExample;

public class InheritanceMain {
    public static void main(String[] args) {
        Home room=new BedRoom();
        room.numOfLights();
        room=new Kitchen();
        room.numOfLights();
        room=new LivingRoom();
        room.numOfLights();


    }
}
