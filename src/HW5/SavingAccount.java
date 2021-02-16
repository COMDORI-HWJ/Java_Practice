package HW5;

public class SavingAccount {
    double rate, balance;
    int month;

    public SavingAccount(double r, double b){
        rate = r;
        balance = b;
    }
    int getMonth(){
        month = (int) ((balance*1.0)*rate/12);
        balance = balance+month;
        return month;
    }
    void setRate(double newrate){
        rate = newrate;
    }

}
