/**
 * @authors Giacomo Germinario, Gabriele Sanna, Nicolò Tola
 * @version 1.0
 */

package com.springDeD.createPg.weapons;

public class LightHammer implements Wieldable
{
	public String getName() {
		return name;
	}

	private String  name="LightHammer";
	private String damageDie = "1d4";
	private String damageType = "Bludgeoning";
	private int weight = 2;
	private String properties = "Light, thrown (range 20/60)";
	
	public LightHammer()
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