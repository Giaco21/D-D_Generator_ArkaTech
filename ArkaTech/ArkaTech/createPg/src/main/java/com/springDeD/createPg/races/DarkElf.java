/**
 * @author Brandon Campbell
 * @version 1.0
 */
package com.springDeD.createPg.races;

public class DarkElf extends Elf
{
	private String racesName = "DarkElf";
	private String[] subRacialBonus = {"Elf Weapon Training, Cantrip, Extra Language"};
	
	public DarkElf(int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		super(strength, dexterity, constitution, intelligence, wisdom, charisma);
	}
	

	public String getRacesName(){
		return racesName;
	}

	public String[] getSubRacialBonus()
	{
		return subRacialBonus;
	}
}