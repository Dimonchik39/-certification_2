package toys;


public class Toy {

    int ID;
    String toyName;
    int toyWeight;
    // int abc;

    void displayInfo(){
        System.out.printf("ID: %d \ttoyName: %s \ttoyWeight: %s \n", ID, toyName, toyWeight);
    }
    
    public Toy(int ID, String toyName, int toyWeight) {

        this.ID = ID;
        this.toyName = toyName;
        this.toyWeight = toyWeight;
    }

    public int get_toyWeight(){
        return toyWeight;
    }
    
    @Override
    public String toString() {
        return ID + "{Toy Name =" + toyName + ", Toy Weight =" + toyWeight + "}";
    }
}