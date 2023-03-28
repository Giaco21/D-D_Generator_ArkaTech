/**
 * @authors Giacomo Germinario, Gabriele Sanna, Nicolò Tola
 * @version 1.0
 */

package com.springDeD.createPg.weapons;

public class Mace implements Wieldable
{
	public String getName() {
		return name;
	}

	private String  name="Mace";
	private String damageDie = "1d6";
	private String damageType = "Bludgeoning";
	private int weight = 4;
	private String properties = "";
	
	public Mace()
	{
		
	}
	
	public String getDamageDie()
	{
		return this.damageDie;
	}
	
	public String getDamageType()
	{
		return this.damageType;
	}
	
	public int getWeight()
	{
		return this.weight;
	}
	
	public String getProperties()
	{
		return this.properties;
	}
}