/**
 * @author Brandon Campbell
 * @version 1.0
 */
package com.springDeD.createPg.races;

public class LightFoot extends Halfling
{
	private String racesName = "LightFoot";
	private String[] subRacialBonus = {"Naturally Stealthy"};
	
	public LightFoot(int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		// +1 charisma bonus from racial modifier.
		super(strength, dexterity, constitution, intelligence, wisdom, charisma + 1);
	}
	
	public String getRacesName(){
		return racesName;
	}
	
	public String[] getSubRacialBonus()
	{
		return subRacialBonus;
	}
}