package com.springDeD.createPg.backgrounds;

public class BackgroundDto {
    
    private String name;
    private String[] personalityTraits;
    private String [] ideals;
    private String [] bonds;
    private String [] flaws;

    

    /**
     * @param name
     * @param personalityTraits
     * @param ideals
     * @param bonds
     * @param flaws
     */
    public BackgroundDto(String name, String[] personalityTraits, String[] ideals, String[] bonds, String[] flaws) {
        this.name = name;
        this.personalityTraits = personalityTraits;
        this.ideals = ideals;
        this.bonds = bonds;
        this.flaws = flaws;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String[] return the personalityTraits
     */
    public String[] getPersonalityTraits() {
        return personalityTraits;
    }

    /**
     * @param personalityTraits the personalityTraits to set
     */
    public void setPersonalityTraits(String[] personalityTraits) {
        this.personalityTraits = personalityTraits;
    }

    /**
     * @return String [] return the ideals
     */
    public String [] getIdeals() {
        return ideals;
    }

    /**
     * @param ideals the ideals to set
     */
    public void setIdeals(String [] ideals) {
        this.ideals = ideals;
    }

    /**
     * @return String [] return the bonds
     */
    public String [] getBonds() {
        return bonds;
    }

    /**
     * @param bonds the bonds to set
     */
    public void setBonds(String [] bonds) {
        this.bonds = bonds;
    }

    /**
     * @return String [] return the flaws
     */
    public String [] getFlaws() {
        return flaws;
    }

    /**
     * @param flaws the flaws to set
     */
    public void setFlaws(String [] flaws) {
        this.flaws = flaws;
    }

}
