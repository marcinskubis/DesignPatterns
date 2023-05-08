public class Main {
    public static void main(String[] args) {
        Singleton single1 = Singleton.getInstance();
        System.out.println(single1.getInfo());
        Singleton single2 = Singleton.getInstance();
        single1.setInfo("changedInfo");
        System.out.println(single1.getInfo());
        System.out.println(single2.getInfo());
    }
}