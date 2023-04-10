public class Main {
    public static void main(String[] args) {
        System.out.println("A simple looking troll approaches.");
        var troll = new SimpleTroll();
        troll.attack();
        troll.fleeBattle();
        System.out.println("Clubbed troll power: "+troll.getAttackPower());

        System.out.println("A troll with a huge club surprises you.");
        var clubbedTroll = new ClubbedTroll(troll);
        clubbedTroll.attack();
        clubbedTroll.fleeBattle();
        System.out.println("Clubbed troll power: "+clubbedTroll.getAttackPower());
    }
}