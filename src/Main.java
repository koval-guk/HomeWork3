public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        Employee batman = new Employee("Batman", "dark hero", "b.wayne@gothem.dc", "+8(800)batspotlight", 44);
        System.out.println(batman.getAge());
        System.out.println(batman.getPhoneNumber());
        batman.setPhoneNumber("800-00-00-3");
        System.out.println(batman.getPhoneNumber());
        SameName thisSameName = new SameName();
        System.out.println(thisSameName);
        packageForSameName.SameName thatSameName = new packageForSameName.SameName();
        System.out.println(thatSameName);
        thisSameName.test();
        thatSameName.test();
    }
}
