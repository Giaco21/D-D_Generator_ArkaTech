/**
 * @author Brandon Campbell
 * @version 1.0
 */
package com.springDeD.createPg.races;

public class WoodElf extends Elf
{
	private String racesName = "WoodElf";
	private String[] subRacialBonus = {"Elf Weapon Training, Fleet of Foot, Mask of the Wild"};
	
	public WoodElf(int strength, int dexterity, int constitution,
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
		return subRacialBonus;
	}
}