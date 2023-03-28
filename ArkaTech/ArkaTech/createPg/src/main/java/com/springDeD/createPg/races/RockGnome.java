/**
 * @author Brandon Campbell
 * @version 1.0
 */
package com.springDeD.createPg.races;

public class RockGnome extends Dwarf
{
	private String racesName = "RockGnome";
	private String[] racialBonus = {"Artificer's Lore", "Tinker"};
	
	public RockGnome(int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		// +1 constitution bonus from racial modifier.
		super(strength, dexterity, constitution + 1, intelligence, wisdom, charisma);
	}

	public String getRacesName(){
		return racesName;
	}

	public String[] getSubRacialBonus()
	{
		return racialBonus;
	}
}