/**
 * @authors Giacomo Germinario, Gabriele Sanna, Nicolò Tola
 * @version 1.0
 */

 package com.springDeD.createPg.weapons;

public class Sickle implements Wieldable
{
	public String getName() {
		return name;
	}

	private String  name="Sickle";
	private String damageDie = "1d4";
	private String damageType = "Slashing";
	private int weight = 2;
	private String properties = "Light)";
	
	public Sickle()
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