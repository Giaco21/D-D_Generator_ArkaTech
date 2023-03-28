/**
 * @authors Giacomo Germinario, Gabriele Sanna, Nicolò Tola
 * @version 1.0
 */

 package com.springDeD.createPg.weapons;

public class Greataxe implements Wieldable
{
	private String  name="Greataxe";
	private String damageDie = "1d12";
	private String damageType = "Slashing";
	private int weight = 7;
	private String properties = "Heavy, two-handed";
	
	public Greataxe()
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