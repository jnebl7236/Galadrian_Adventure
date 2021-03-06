import java.util.Random;

/**
 * Created by student5 on 10/27/16.
 */
public class Monster {
    public int health;
    public int maxHit, minHit, accuracy;
    public int[] itemDrop = {0,0};

    public Monster(int h, int max, int min, int acc, int item, int dropRate)
    {
        health = h;
        maxHit = max;
        minHit = min;
        accuracy = acc;
        itemDrop[0] = item;
        itemDrop[1] = dropRate;

    }
    public int questionItem(){
        if (itemDrop[1] >= Math.round(Math.random() * 100)){
            return itemDrop[0];
        } else {
            return 0;
        }
    }

    public String calculateHit() {
        if (accuracy >= Math.round(Math.random() * 10)) {
            String randomNum = "" +Math.round(Math.random()*(maxHit-minHit)+minHit);
            return randomNum;
        }
        else {
            System.out.println("The beast has missed!");
            return "Miss";
        }

    }
    public int receiveHit(int hit){
        health -= hit;
        return health;
    }
    public boolean questionlife(){
        if (health >= 0){
            return true;
        }
        else
            return false;
    }
}
