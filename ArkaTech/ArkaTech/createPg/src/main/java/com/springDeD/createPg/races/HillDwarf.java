/**
 * @author Brandon Campbell
 * @version 1.0
 */
package com.springDeD.createPg.races;

public class HillDwarf extends Dwarf
{
	private String racesName = "HillDwarf";
	private String[] racialBonus = {"Dwarven Toughness"};
	
	public HillDwarf(int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		// +1 wisdom bonus from racial modifier.
		super(strength, dexterity, constitution, intelligence, wisdom + 1, charisma);
	}
	

	public String getRacesName(){
		return racesName;
	}
	
	public String[] getSubRacialBonus()
	{
		return racialBonus;
	}
}