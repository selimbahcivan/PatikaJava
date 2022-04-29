

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter foe) {
        System.out.println("------------");
        System.out.println(this.name + " attacked to " + foe.name + " " +  this.damage + " damaged.");

        if (foe.dodge()) {
            System.out.println(foe.name + " dodges incoming damage ! ");
            return foe.health;
        }

        return Math.max(foe.health - this.damage, 0);

    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= this.dodge;
    }
}