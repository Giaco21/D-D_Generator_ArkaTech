/**
 * @author Brandon Campbell
 * @version 1.0
 */
package com.springDeD.createPg.races;

public class Stout extends Halfling
{
	private String racesName = "Stout";
	private String[] subRacialBonus = {"Stout Resilience"};
	
	public Stout(int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		// +1 intelligence bonus from racial modifier.
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