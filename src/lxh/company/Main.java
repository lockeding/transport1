package lxh.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        Aircraft aircraft = new Aircraft();
        Airship airship = new Airship();
        Automobile automobile = new Automobile();
        Bicycle bicycle = new Bicycle();
        HotAirBallon hotAirBallon = new HotAirBallon();
        Hovercraft hovercraft = new Hovercraft();
        Motorcycle motorcycle = new Motorcycle();
        Ship ship = new Ship();
        Submarine submarine = new Submarine();

        person.setAge(20);
        person.setId("201902210");
        person.setName("廖祥辉");
        person.setSex("man");
        System.out.println(person.getId()+','+person.getName()+','+person.getAge()+','+person.getSex());
        person.driveTransport(aircraft);
        person.driveTransport(ship);
        person.driveTransport(airship);
        person.driveTransport(bicycle);
        person.driveTransport(submarine);
        person.driveTransport(automobile);
        person.driveTransport(hovercraft);
        person.driveTransport(motorcycle);
        person.driveTransport(hotAirBallon);
    }
}
