import java.util.ArrayList;
import java.util.Scanner;

public class hero {
    Scanner lineReader = new Scanner(System.in);
    private String name;
    private int maxLightMana;
    private int currentLightMana;
    private int maxHealth;
    private int currentHealth;
    private weapon weapon = new weapon();
    private ArrayList<item> inventory = new ArrayList<>();

    public ArrayList<item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<item> inventory) {
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public final void setName(String newName) {
        name = newName;
    }
    public int getMaxLightMana() {
        return maxLightMana;
    }

    public final void setMaxLightMana(int newVar) {
        maxLightMana = newVar;
    }

    public int getCurrentLightMana() {
        return currentLightMana;
    }

    public final void setCurrentLightMana(int newVar) {
        currentLightMana = newVar;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public final void setCurrentHealth(int newVar) {
        currentHealth = newVar;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public final void setMaxHealth(int newVar) {
        maxHealth = newVar;
    }

    public final void addItem(item newItem) {
        for (int inventorySlot = 0; inventorySlot < 10; inventorySlot++) {
            item item = getItem(inventorySlot);
            if(newItem.getName().equals(item.getName())) {
                var itemAmount = item.getQuantity();
                var itemMaxQuantity = item.getMaxQuantity();
                if (itemAmount != itemMaxQuantity) {
                    if (itemMaxQuantity >= itemAmount + newItem.getQuantity()) {
                        newItem.setQuantity(itemAmount + newItem.getQuantity());
                        inventory.set(inventorySlot, newItem);
                        break;
                    } else {
                        var extraItem = itemMaxQuantity - itemAmount + newItem.getQuantity();
                        item.setQuantity(itemMaxQuantity);
                        newItem.setQuantity(extraItem);
                        addItem(newItem);
                        break;
                    }
                }
            }
            if(inventorySlot == 9) {
                for (int secondInventorySlot = 0; secondInventorySlot < 10; secondInventorySlot++) {
                    item secondItem = getItem(secondInventorySlot);
                    if(secondItem.getName().equals("None")) {
                        inventory.set(secondInventorySlot, newItem);
                        break;
                    } else if (inventorySlot == 9) {
                        System.out.println("Your Inventory is Full...");
                    }
                }
            }
        }
    }
    
    public final item getItem(int inventorySlot) {
        return inventory.get(inventorySlot);
    }

    public hero(String newName) {
        setName(newName);
        maxLightMana = 1;
        currentLightMana = 0;
        maxHealth = 10;
        currentHealth = 10;
        for (int i = 0; i < 10; i++) {
            var item = new item("None", 0, "None");
            inventory.add(item);
        }
    }

    public void stats() {
        System.out.println("Name: " + getName());
        System.out.println("Light Mana: " + currentLightMana + "/" + maxLightMana);
        System.out.println("Health: " + currentHealth + "/" + maxHealth);
        System.out.println("Press Return to leave inventory");
        lineReader.nextLine();
    }
    
    public void inventoryView() {
        var inv = getInventory();
        for (var i = 0; i < 10; i++){
            var newItem = inv.get(i);
            System.out.println("Slot " + (i + 1) + ": " + newItem.getName());
            System.out.println("Type: " + newItem.getType());
            System.out.println("Quantity: " + newItem.getQuantity());
            System.out.println();
        }
        System.out.println("Press enter to continue.");
        lineReader.nextLine();
    }

    public void characterView(Object player) {
        System.out.println("");
    }

    public weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(weapon weapon) {
        this.weapon = weapon;
    }
}