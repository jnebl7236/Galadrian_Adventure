/**
 * Created by Jared on 11/23/2016.
 */
public class attackDatabase {

    //attackData contains min,max,accuracy

    public static int attackData[]= {0,0,0};
    public static void main(String args[]){ //nothing should be here or call to here
    }
    public static int[] getAttackData(String attack) {
        if (attack.equalsIgnoreCase("Slash")) {slash();
            return attackData;}
        if (attack.equalsIgnoreCase("punch")) {punch();
            return attackData;}
        if (attack.equalsIgnoreCase("jab")) {jab();
            return attackData;}
        if (attack.equalsIgnoreCase("")) {attackData[2] = 0;
            return attackData;}
        return attackData;
    }
//      This is the formatting
//    public static void slash(){
//        attackData[0] = 5;
//        attackData[1] = 30;
//        attackData[2] = 9;
//    }
    public static void jab(){
        attackData[0] = 25;
        attackData[1] = 30;
        attackData[2] = 7;
    }
    public static void punch(){
        attackData[0] = 10;
        attackData[1] = 15;
        attackData[2] = 9;
    }
    public static void slash(){ //set for testing
        attackData[0] = 100;
        attackData[1] = 100;
        attackData[2] = 10;
    }

}
