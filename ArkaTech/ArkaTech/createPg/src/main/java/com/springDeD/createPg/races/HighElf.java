/**
 * @author Brandon Campbell
 * @version 1.0
 */
package com.springDeD.createPg.races;

public class HighElf extends Elf
{
	private String racesName = "HighElf";
	private String[] subRacialBonus = {"Elf Weapon Training, Cantrip, Extra Language"};
	
	public HighElf(int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		//+1 intelligence bonus from racial modifier.
		super(strength, dexterity, constitution, intelligence + 1, wisdom, charisma);
	}

	public String getRacesName(){
		return racesName;
	}
	
	public String[] getSubRacialBonus()
	{
		return subRacialBonus;
	}
}