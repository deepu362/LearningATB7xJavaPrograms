package ex_28072024;

public class Lab155_BuildingBP {

    public static void main(String[] args) {
        BuildingBP dlf = new BuildingBP();
        dlf.name = "DLF Pvt Builder";
        dlf.noOfRooms = 100;
        dlf.useLift();

        BuildingBP prestige = new BuildingBP();
        prestige.name = "Prestige Pvt Builder";
        prestige.noOfRooms = 100;
        prestige.useLift();
    }
}
