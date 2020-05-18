package lxh.company;

public class Person {
    private int Age;
    private String Sex;
    private String Id;
    private String Name;

    public void driveTransport(Aircraft aircraft){
        aircraft.drivingMethod();
    }
    public void driveTransport(Airship airship){
        airship.drivingMthod();

    }
    public void driveTransport(Automobile automobile){
        automobile.drivingMethod();
    }
    public void driveTransport(Bicycle bicycle){
        bicycle.drivingMethod();
    }
    public void driveTransport(HotAirBallon hotAirBallon){
        hotAirBallon.drivingMethod();
    }
    public void driveTransport(Hovercraft hovercraft){
        hovercraft.drivingMethod();
    }
    public void driveTransport(Motorcycle motorcycle){
        motorcycle.drivingMethod();
    }
    public void driveTransport(Ship ship){
        ship.drivingMethod();
    }
    public void driveTransport(Submarine submarine){
        submarine.drivingMethod();
    }


    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}
