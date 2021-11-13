package OOP.abstactclass;

public class mainClass {
    public static void main(String[] args){
        Hewan[] animal = new Hewan[5];
        animal[0] = new Harimau();
        animal[1] = new Harimau();
        animal[2] = new Kucing();
        animal[3] = new Serigala();
        animal[4] = new Harimau();
        for (int i = 0; i <= 4; i++){
           animal[i].bersuara();
        }
    }
}
