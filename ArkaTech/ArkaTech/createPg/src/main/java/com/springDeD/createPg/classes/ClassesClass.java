package com.springDeD.createPg.classes;

import javax.persistence.Entity;

@Entity
public class ClassesClass {

    Barbarian barbarian = new Barbarian();
    Bard bard = new Bard();
    Cleric cleric = new Cleric();
    Druid druid = new Druid();
    Fighter fighter = new Fighter();
    Monk monk = new Monk();
    Paladin paladin = new Paladin();
    Ranger ranger = new Ranger();
    Rogue rogue = new Rogue();
    Sorcerer sorcerer = new Sorcerer();
    Warlock warlock = new Warlock();
    Wizard wizard = new Wizard();

    /**
     * @param strings7
     * @param strings6
     * @param strings5
     * @param strings4
     * @param strings3
     * @param strings2
     * @param strings
     * @param j
     * @param string2
     * @param i
     * @param string
     * 
     */
    public ClassesClass(String string, int i, String string2, int j, String[] strings, String[] strings2, String[] strings3, String[] strings4, String[] strings5, String[] strings6, String[] strings7) {
    }

    public ClassesClass() {
    }

    /**
     * @return the barbarian
     */
    public Barbarian getBarbarian() {
        return barbarian;
    }

    /**
     * @return the bard
     */
    public Bard getBard() {
        return bard;
    }

    /**
     * @return the cleric
     */
    public Cleric getCleric() {
        return cleric;
    }

    /**
     * @return the druid
     */
    public Druid getDruid() {
        return druid;
    }

    /**
     * @return the fighter
     */
    public Fighter getFighter() {
        return fighter;
    }

    /**
     * @return the monk
     */
    public Monk getMonk() {
        return monk;
    }

    /**
     * @return the paladin
     */
    public Paladin getPaladin() {
        return paladin;
    }

    /**
     * @return the ranger
     */
    public Ranger getRanger() {
        return ranger;
    }

    /**
     * @return the rogue
     */
    public Rogue getRogue() {
        return rogue;
    }

    /**
     * @return the sorcerer
     */
    public Sorcerer getSorcerer() {
        return sorcerer;
    }

    /**
     * @return the warlock
     */
    public Warlock getWarlock() {
        return warlock;
    }

    /**
     * @return the wizard
     */
    public Wizard getWizard() {
        return wizard;
    }

    public void addClass(ClassesClass newClass) {
    }

    public String getClassName() {
        return null;
    }

}
