public class gameObject {
    private String itemName = "";
    private int itemID;
    gameObject(String itemName, int itemID){
        this.itemName = itemName;
        this.itemID = itemID;
    }

    public int getItemID() {
        return itemID;
    }

    public String getItemName() {
        return itemName;
    }
}
