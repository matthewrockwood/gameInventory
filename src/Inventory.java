import java.util.ArrayList;

public class Inventory {
    private String playerName = "";
    private int playerID = -1;
    private ArrayList<gameObject> arrayInv = new ArrayList<gameObject>();

    Inventory(String playerName, int playerID){
        this.playerName = playerName;
        this.playerID = playerID;
    }
    public void addItem(gameObject obj){
        arrayInv.add(obj);
    }
    public void removeItem(int index){
        if(arrayInv.size()>= index) {
            arrayInv.remove(index);
        }
        else{
            System.out.println("Not a index in range");
        }
    }
    public void showInv(){
        for (gameObject gameObject : arrayInv) {
            System.out.println(gameObject.getItemName() + " " +gameObject.getItemID());
        }
    }
}
