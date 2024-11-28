public final class weaponAttack {
    private String name;
    private String type;
    private int damage;
    private boolean armorShred;

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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean isArmorShred() {
        return armorShred;
    }

    public void setArmorShred(boolean armorShred) {
        this.armorShred = armorShred;
    }
    public weaponAttack(weapon weapon) {
        setName("Unkown");
        setType(weapon.getType());
        setDamage((int) (Math.random() * (weapon.getMaxDamage() - weapon.getMinDamage())) + weapon.getMinDamage());
        setArmorShred(weapon.getArmorShred());
    }
}
