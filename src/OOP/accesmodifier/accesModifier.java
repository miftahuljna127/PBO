package OOP.accesmodifier;

public class accesModifier {
    public char a = 'a';//public access modifier
    protected char b = 'b';//protected access modifier
    private char c = 'd';//private access modifier
    char d = 'd';//default access modifier
    
    public void showPublic(){
        System.out.println("Access Modifier Public ");
    }
    protected void showProtected(){
        System.out.println("Access Modifier Protected");
    }
    private void showPrivate(){
        System.out.println("Access Modifier Private");
        //contoh pemanggilan private
        //showPrivate();
    }
    void showDefault(){
        System.out.println("Access Modifier Default");
    }
}
