/**
 * @authors Giacomo Germinario, Gabriele Sanna, Nicolò Tola
 * @version 1.0
 */

package com.springDeD.createPg.weapons;

public class Lance implements Wieldable
{
	private String damageDie = "1d12";
	private String damageType = "Piercing";
	private int weight = 6;
	private String properties = "Reach, special";
	
	public Lance()
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