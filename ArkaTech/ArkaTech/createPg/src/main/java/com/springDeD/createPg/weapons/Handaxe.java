/**
 * @authors Giacomo Germinario, Gabriele Sanna, Nicolò Tola
 * @version 1.0
 */

 package com.springDeD.createPg.weapons;

public class Handaxe implements Wieldable
{
	private String  name="Handaxe";

	private String damageDie = "1d6";
	private String damageType = "Slashing";
	private int weight = 2;
	private String properties = "Light, thrown (range 20/60)";
	
	public Handaxe()
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