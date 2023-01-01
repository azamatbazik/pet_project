import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Fight implements PersonInterface {
    private Person[] person = new Person[1];
//    String winner = null;

    public void createPerson() {
        Random random = new Random();
        BufferedReader listPerson = new BufferedReader(new InputStreamReader(System.in));
        int number = 1;
        try {
            number = Integer.parseInt(listPerson.readLine());
        } catch (
                IOException e) {
            e.getMessage();
        }

        float health[] = new float[number];
        float damage[] = new float[number];
        float speedDamage[] = new float[number];
        float protection[] = new float[number];
        for (int i = 0; i < number; i++) {
            health[i] = random.ints(90, 100).findAny().getAsInt();
            damage[i] = random.ints(10, 20).findAny().getAsInt();
            speedDamage[i] = random.ints(10, 20).findAny().getAsInt();
            protection[i] = random.ints(90, 100).findAny().getAsInt();
        }
        person = new Person[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Data of the " + i + " Person : ");
            person[i] = new Person(health[i], damage[i], speedDamage[i], protection[i]);
            System.out.println();
        }
    }

    public void fight() {
        float[] allDataOfPerson = new float[person.length];

        for (int i = 0; i < person.length; i++) {
            allDataOfPerson[i] = person[i].getProtection() + person[i].getDamage() + person[i].getSpeedDamage() + person[i].getHealth();
        }
        for (int i = 0; i < allDataOfPerson.length; i+=2) {
            if(allDataOfPerson[i] > allDataOfPerson[i+1]){
                System.out.println("Person " + i + " is winner!");
            }else{
                System.out.println("Person " + (i+1) + " is winner!");
            }
        }
    }
}
