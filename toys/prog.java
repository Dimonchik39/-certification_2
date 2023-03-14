package toys;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class prog {
    public static void main(String[] args) {

        List<Toy> toyList = new ArrayList<>();
        
        Toy toy1 = new Toy(1, "игрушка1", 15);
        Toy toy2 = new Toy(2, "игрушка2", 25);
        Toy toy3 = new Toy(3, "игрушка3", 9);
        Toy toy4 = new Toy(4, "игрушка4", 31);
        Toy toy5 = new Toy(5, "игрушка5", 20);
        Toy toy6 = new Toy(6, "Жиробасина Снэгги", 120);

        toyList.add(toy1);
        toyList.add(toy2);
        toyList.add(toy3);
        toyList.add(toy4);
        toyList.add(toy5);
        toyList.add(toy6);
        
        int random_num = (int) (Math.random()*(6-0)+0);
        Toy a = toyList.get(random_num);

        try(FileWriter writer = new FileWriter("toys/toyWinner.txt", true)) {
            String text = a.toString();
            writer.write(text);
            writer.append('\n');            
            writer.flush();
        }

        catch(IOException ex){          
            System.out.println(ex.getMessage());
        }  

        System.out.println("В лотереи побеждает: ");
        a.displayInfo();
        System.out.println("Примите наши искренние Поздравления! хлоп-хлоп-хлоп");

    }    
}
