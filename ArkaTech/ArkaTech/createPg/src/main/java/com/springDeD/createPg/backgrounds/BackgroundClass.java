package com.springDeD.createPg.backgrounds;

import javax.persistence.Entity;

@Entity
public class BackgroundClass {
      Acolyte acolyte = new Acolyte();
      Charlatan charlatan = new Charlatan();
      Criminal criminal = new Criminal();
      Entertainer entertainer = new Entertainer();
      FolkHero folkHero = new FolkHero();
      GuildArtisan guildArtisan = new GuildArtisan();
      Hermit hermit = new Hermit();
      Noble noble = new Noble();
      Outlander outlander = new Outlander();
      Sage sage = new Sage();
      Sailor sailor = new Sailor();
      Soldier soldier = new Soldier();
      Urchin urchin = new Urchin();

public BackgroundClass(){

    }

/**
 * @return the acolyte
 */
public Acolyte getAcolyte() {
    return acolyte;
}

/**
 * @return the charlatan
 */
public Charlatan getCharlatan() {
    return charlatan;
}

/**
 * @return the criminal
 */
public Criminal getCriminal() {
    return criminal;
}

/**
 * @return the entertainer
 */
public Entertainer getEntertainer() {
    return entertainer;
}

/**
 * @return the folkHero
 */
public FolkHero getFolkHero() {
    return folkHero;
}

/**
 * @return the guildArtisan
 */
public GuildArtisan getGuildArtisan() {
    return guildArtisan;
}

/**
 * @return the hermit
 */
public Hermit getHermit() {
    return hermit;
}

/**
 * @return the noble
 */
public Noble getNoble() {
    return noble;
}

/**
 * @return the outlander
 */
public Outlander getOutlander() {
    return outlander;
}

/**
 * @return the sage
 */
public Sage getSage() {
    return sage;
}

/**
 * @return the sailor
 */
public Sailor getSailor() {
    return sailor;
}

/**
 * @return the soldier
 */
public Soldier getSoldier() {
    return soldier;
}

/**
 * @return the urchin
 */
public Urchin getUrchin() {
    return urchin;
}



    
}
