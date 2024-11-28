public final class weapon {
    private String name;
    private String style;
    private String type;
    private int minDamage;
    private int maxDamage;
    private boolean armorShred;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /*public weapon(String weaponName, int lowDM, int highDM) {
        //Get a database to set this up for me, but for now the values will be manually input.
        setName(weaponName);
        setMinDamage(lowDM);
        setMaxDamage(highDM);

    }*/

    public int getMinDamage() {
        return minDamage;
    }

    public void setMinDamage(int minDamage) {
        this.minDamage = minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public boolean getArmorShred() {
        return armorShred;
    }

    public void setArmorShred(boolean armorShred) {
        this.armorShred = armorShred;
    }
    public weapon() {
        setName("Old Spear");
        setStyle("spear");
        setType("basic");
        setMinDamage(2);
        setMaxDamage(6);
        setArmorShred(false);
    }
}
