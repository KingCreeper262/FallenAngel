public class enemy {
    private String name;
    private String type;
    private int maxHealth;
    private int currentHealth;
    private int armor;
    private weapon weapon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
    
    public int weaponAttackResolve(weaponAttack attack) {
        int healthCurrent = getCurrentHealth();
        int currentArmor = getArmor();
        if(attack.isArmorShred()) {
            healthCurrent = healthCurrent - attack.getDamage();
        } else {
            //Go into a database and look for percent reduction based on the amount of armor the character has
            //For now, armor does nothing :)
            healthCurrent = healthCurrent - attack.getDamage();
        }
        return healthCurrent;
    }

    public weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(weapon weapon) {
        this.weapon = weapon;
    }
    public enemy() {
        setName("Monster");
        setType("basic");
        setMaxHealth(10);
        setCurrentHealth(10);
        setArmor(0);
        weapon monsterTool = new weapon();
        setWeapon(monsterTool);
    }
}
