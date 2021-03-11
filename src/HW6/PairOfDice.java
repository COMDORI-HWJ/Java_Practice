package HW6;

public class PairOfDice {

    int total;
    public int die_fir;
    public int die_sec;
    public PairOfDice(){
        total = 0;
    }
    public int gettotal(int total){
        return this.total +=total;
    }
    public int nototal(){
        total=0;
        return total;
    }
    public boolean turn(boolean turn){
        turn= !turn;
        return turn;
    }
    public void setDie() {
        // TODO Auto-generated method stub

    }
    public Object round() {
        // TODO Auto-generated method stub
        return null;
    }

}
