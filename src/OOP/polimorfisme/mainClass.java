package OOP.polimorfisme;

public class mainClass {
    public static void main(String[] args){
        Hewan[] animal = new Hewan[3];//parent class
        animal[0] = new Harimau();//child class
        animal[1] = new Kucing();//cc
        animal[2] = new Serigala();//cc
        //untuk melihat konsep
        for (int i = 0; i <= 2; i++){
            animal[i].bersuara();
        }
    }
}
