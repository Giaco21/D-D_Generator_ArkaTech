/**
 * @authors Giacomo Germinario, Gabriele Sanna, Nicolò Tola
 * @version 1.0
 */

 package com.springDeD.createPg.weapons;

public class Scimtar implements Wieldable
{
	public String getName() {
		return name;
	}

	private String  name="Scimtar";
	private String damageDie = "1d6";
	private String damageType = "Slashing";
	private int weight = 3;
	private String properties = "Finesse, light";
	
	public Scimtar()
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