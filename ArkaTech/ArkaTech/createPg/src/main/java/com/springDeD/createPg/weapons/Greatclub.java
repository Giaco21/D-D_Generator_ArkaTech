/**
 * @authors Giacomo Germinario, Gabriele Sanna, Nicolò Tola
 * @version 1.0
 */

 package com.springDeD.createPg.weapons;

public class Greatclub implements Wieldable
{
	private String  name="Greatclub";
	private String damageDie = "1d8";
	private String damageType = "Bludgeoning";
	private int weight = 10;
	private String properties = "Two-handed";
	
	public Greatclub()
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