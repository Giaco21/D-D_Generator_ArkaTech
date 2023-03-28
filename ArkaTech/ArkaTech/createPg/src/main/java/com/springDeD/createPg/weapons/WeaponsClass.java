package com.springDeD.createPg.weapons;

public class WeaponsClass implements Wieldable{


    private String  name;
    private String damageDie;
    private String damageType;
    private int weight;
    private String properties;

    public WeaponsClass(String name, String damageDie, String damageType, int weight, String properties) {
        this.name = name;
        this.damageDie = damageDie;
        this.damageType = damageType;
        this.weight = weight;
        this.properties = properties;
    }

    public WeaponsClass() {

    }

    public String getName() {
        return name;
    }

    @Override
    public String getDamageDie() {
        return damageDie;
    }

    @Override
    public String getDamageType() {
        return damageType;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public String getProperties() {
        return properties;
    }
}
