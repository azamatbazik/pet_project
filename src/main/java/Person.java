public class Person{

    public Person(float health, float damage, float speedDamage, float protection) {
        this.health = health;
        this.damage = damage;
        this.speedDamage = speedDamage;
        this.protection = protection;
//        System.out.println("Health is = " + health + "\n" + "Damage is = " + damage + "\n" + "Speed damage is = " + speedDamage + "\n" + "Protection is = " + protection);
    }

    public float getHealth() {
        return health;
    }

    private float health;

    public float getDamage() {
        return damage;
    }

    private float damage;

    public float getSpeedDamage() {
        return speedDamage;
    }

    private float speedDamage;

    public float getProtection() {
        return protection;
    }

    private float protection;
}
