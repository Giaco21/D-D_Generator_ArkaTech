/**
 * @authors Giacomo Germinario, Gabriele Sanna, Nicolò Tola
 * @version 1.0
 */

 package com.springDeD.createPg.weapons;

public class Longsword implements Wieldable
{
	public String getName() {
		return name;
	}

	private String  name="Longsword";
	private String damageDie = "1d8";
	private String damageType = "Slashing";
	private int weight = 3;
	private String properties = "Versatile (1d10)";
	
	public Longsword()
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