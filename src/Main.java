import Building_Info.*;

public class Main {
    public static void main(String[] args){
        BuildingComponent building = BuildingComponent.GetExamplaryBuilding();
        building.GetSurface();
    }
}