/**
 * @authors Giacomo Germinario, Gabriele Sanna, Nicolò Tola
 * @version 1.0
 */

 package com.springDeD.createPg.weapons;

public class Halberd implements Wieldable
{
	private String  name="Greatsword";
	private String damageDie = "1d10";
	private String damageType = "Slashing";
	private int weight = 6;
	private String properties = "Heavy, reach, two-handed";
	
	public Halberd()
	{
		
	}

	public String getName() {
		return name;
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