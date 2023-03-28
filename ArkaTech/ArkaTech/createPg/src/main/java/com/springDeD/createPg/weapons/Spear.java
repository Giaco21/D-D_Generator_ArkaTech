/**
 * @authors Giacomo Germinario, Gabriele Sanna, Nicolò Tola
 * @version 1.0
 */

 package com.springDeD.createPg.weapons;

public class Spear implements Wieldable
{
	public String getName() {
		return name;
	}

	private String  name="Spear";
	private String damageDie = "1d6";
	private String damageType = "Piercing";
	private int weight = 3;
	private String properties = "Thrown (range 20/60), versatile (1d8)";
	
	public Spear()
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