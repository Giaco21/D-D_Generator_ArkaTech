/**
 * @authors Giacomo Germinario, Gabriele Sanna, Nicolò Tola
 * @version 1.0
 */

package com.springDeD.createPg.weapons;

public class Greatsword implements Wieldable
{
	private String  name="Greatsword";
	private String damageDie = "2d6";
	private String damageType = "Slashing";
	private int weight = 6;
	private String properties = "Heavy, two-handed";
	
	public Greatsword()
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