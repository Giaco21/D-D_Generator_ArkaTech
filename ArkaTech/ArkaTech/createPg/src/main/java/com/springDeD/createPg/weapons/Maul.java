/**
 * @authors Giacomo Germinario, Gabriele Sanna, Nicolò Tola
 * @version 1.0
 */

 package com.springDeD.createPg.weapons;

public class Maul implements Wieldable
{
	public String getName() {
		return name;
	}

	private String  name="Maul";
	private String damageDie = "2d6";
	private String damageType = "Bludgeoning";
	private int weight = 10;
	private String properties = "Heavy, two-handed";
	
	public Maul()
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