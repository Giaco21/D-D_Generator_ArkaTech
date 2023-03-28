package com.springDeD.createPg.classes;

public class ClassDto {
    String className = "Barbarian";
    int numHitDie;
    String hitDice;
    int proficiencyBonus;
    String[] savingThrows;
    String [] skills;
    String [] features;
    String [] proficiencies;
    String [] firstEquipmentChoice;
    String [] secondEquipmentChoice;
    String [] guaranteedEquipment;
    /**
     * @param className
     * @param numHitDie
     * @param hitDice
     * @param proficiencyBonus
     * @param savingThrows
     * @param skills
     * @param features
     * @param proficiencies
     * @param firstEquipmentChoice
     * @param secondEquipmentChoice
     * @param guaranteedEquipment
     */
    public ClassDto(String className,int numHitDie, String hitDice, int proficiencyBonus, String[] savingThrows, String[] skills,
            String[] features, String[] proficiencies, String[] firstEquipmentChoice, String[] secondEquipmentChoice,
            String[] guaranteedEquipment) {
        this.className = className;
        this.numHitDie = numHitDie;
        this.hitDice = hitDice;
        this.proficiencyBonus = proficiencyBonus;
        this.savingThrows = savingThrows;
        this.skills = skills;
        this.features = features;
        this.proficiencies = proficiencies;
        this.firstEquipmentChoice = firstEquipmentChoice;
        this.secondEquipmentChoice = secondEquipmentChoice;
        this.guaranteedEquipment = guaranteedEquipment;
    }

    public String getClassName(){
        return className;
    }

    /**
     * @return the numHitDie
     */
    public int getNumHitDie() {
        return numHitDie;
    }
    /**
     * @param numHitDie the numHitDie to set
     */
    public void setNumHitDie(int numHitDie) {
        this.numHitDie = numHitDie;
    }
    /**
     * @return the hitDice
     */
    public String getHitDice() {
        return hitDice;
    }
    /**
     * @param hitDice the hitDice to set
     */
    public void setHitDice(String hitDice) {
        this.hitDice = hitDice;
    }
    /**
     * @return the proficiencyBonus
     */
    public int getProficiencyBonus() {
        return proficiencyBonus;
    }
    /**
     * @param proficiencyBonus the proficiencyBonus to set
     */
    public void setProficiencyBonus(int proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }
    /**
     * @return the savingThrows
     */
    public String[] getSavingThrows() {
        return savingThrows;
    }
    /**
     * @param savingThrows the savingThrows to set
     */
    public void setSavingThrows(String[] savingThrows) {
        this.savingThrows = savingThrows;
    }
    /**
     * @return the skills
     */
    public String[] getSkills() {
        return skills;
    }
    /**
     * @param skills the skills to set
     */
    public void setSkills(String[] skills) {
        this.skills = skills;
    }
    /**
     * @return the features
     */
    public String[] getFeatures() {
        return features;
    }
    /**
     * @param features the features to set
     */
    public void setFeatures(String[] features) {
        this.features = features;
    }
    /**
     * @return the proficiencies
     */
    public String[] getProficiencies() {
        return proficiencies;
    }
    /**
     * @param proficiencies the proficiencies to set
     */
    public void setProficiencies(String[] proficiencies) {
        this.proficiencies = proficiencies;
    }
    /**
     * @return the firstEquipmentChoice
     */
    public String[] getFirstEquipmentChoice() {
        return firstEquipmentChoice;
    }
    /**
     * @param firstEquipmentChoice the firstEquipmentChoice to set
     */
    public void setFirstEquipmentChoice(String[] firstEquipmentChoice) {
        this.firstEquipmentChoice = firstEquipmentChoice;
    }
    /**
     * @return the secondEquipmentChoice
     */
    public String[] getSecondEquipmentChoice() {
        return secondEquipmentChoice;
    }
    /**
     * @param secondEquipmentChoice the secondEquipmentChoice to set
     */
    public void setSecondEquipmentChoice(String[] secondEquipmentChoice) {
        this.secondEquipmentChoice = secondEquipmentChoice;
    }
    /**
     * @return the guaranteedEquipment
     */
    public String[] getGuaranteedEquipment() {
        return guaranteedEquipment;
    }
    /**
     * @param guaranteedEquipment the guaranteedEquipment to set
     */
    public void setGuaranteedEquipment(String[] guaranteedEquipment) {
        this.guaranteedEquipment = guaranteedEquipment;
    }

    

}
