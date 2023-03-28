/**
 * @authors Giacomo Germinario, Gabriele Sanna, Nicolò Tola
 * @version 1.0
 */

 package com.springDeD.createPg.weapons;

public class Rapier implements Wieldable
{
	public String getName() {
		return name;
	}

	private String  name="Rapier";
	private String damageDie = "1d8";
	private String damageType = "Piercing";
	private int weight = 2;
	private String properties = "Finesse";
	
	public Rapier()
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