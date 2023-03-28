/**
 * @author Brandon Campbell
 * @version 1.0
 * The default constructor for each new character created.
 * Each race inherits from this class so racial modifiers can be added
 * when calculating all stats.
 * All races will also inherit the racial interface.
 */
package com.springDeD.createPg.races;

public abstract class NoRace implements Racial
{

	private String racesName; 

	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;
	
	public NoRace()
	{
		
	}
	
	/**
	 * @param racesName Name of the race
	 * All following parameters are rolled and input by the user.
	 * @param strength
	 * @param dexterity
	 * @param constitution
	 * @param intelligence
	 * @param wisdom
	 * @param charisma
	 */
	public NoRace(int strength, int dexterity, int constitution, int intelligence,
			int wisdom, int charisma)
	{
		this.strength += strength;
		this.dexterity += dexterity;
		this.constitution += constitution;
		this.intelligence += intelligence;
		this.wisdom += wisdom;
		this.charisma += charisma;
	}

	public String getRacesName()
	{
		return racesName;
	}
	
	
	public int getStrength()
	{
		return strength;
	}

	public int getDexterity()
	{
		return dexterity;
	}
	
	public int getConstitution()
	{
		return constitution;
	}
	
	public int getIntelligence()
	{
		return intelligence;
	}

	public int getWisdom()
	{
		return wisdom;
	}

	public int getCharisma()
	{
		return charisma;
	}
}