/**
 * @author Brandon Campbell
 * @version 1.0
 */
package com.springDeD.createPg.races;

public class ForestGnome extends Gnome
{
	private String racesName = "ForestGnome";
	private String racialBonus[] = {"Natural Illusionist", "Speak with Small Beasts"};
	
	public ForestGnome(int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		// +1 dexterity bonus from racial modifier.
		super(strength, dexterity + 1, constitution, intelligence, wisdom, charisma);
	}
	
	public String getRacesName(){
		return racesName;
	}
	
	public String[] getSubRacialBonus()
	{
		return racialBonus;
	}
}