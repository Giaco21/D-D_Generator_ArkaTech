/**
 * @author Brandon Campbell
 * @version 1.0
 */
package com.springDeD.createPg.races;

public class MountainDwarf extends Dwarf
{
	private String racesName = "MountainDwarf";
	private String[] racialBonus = {"Dwarven Armor Training"};
	
	public MountainDwarf(int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		// +2 strength bonus from racial modifier.
		super(strength + 2, dexterity, constitution, intelligence, wisdom, charisma);
	}
	
	public String getRacesName(){
		return racesName;
	}
	
	public String[] getSubRacialBonus()
	{
		return racialBonus;
	}
}