/**
 * @authors Giacomo Germinario, Gabriele Sanna, Nicolò Tola
 * @version 1.0
 */

package com.springDeD.createPg.backgrounds;

public interface Background 
{
	String[] getSkillProficiencies();
	
	String[] getEquipment();
	
	String[] getFeatures();
	
	String[] getPersonalityTraits();
	
	String[] getIdeals();
	
	String[] getBonds();
	
	String[] getFlaws();
	
	String getBackgroundName();
}