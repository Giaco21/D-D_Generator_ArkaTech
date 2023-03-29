package com.springDeD.createPg;

import javax.persistence.Table;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
@Table(name = "pg")
public class Pg {
    public Pg(Long id, Long userId, String characterName, String race, String alignment, Integer classLevel, String background, String personalityTraits, String ideals, String bonds, String flaws, Integer XP, Integer STR, Integer strMod, Integer DEX, Integer dexMod, Integer CON, Integer conMod, Integer OINT, Integer intMod, Integer WIS, Integer wisMod, Integer CHA, Integer chaMod, Integer passive, Integer profBonus, Integer initiative, Integer speed, Integer hpMax, Integer hdTotal, Integer HD, String raceBonuses, String raceAndFeatures, String featuresAndTraits, String aClass) {
        this.id = id;
        this.userId = userId;
        this.characterName = characterName;
        this.race = race;
        this.alignment = alignment;
        this.classLevel = classLevel;
        this.background = background;
        this.personalityTraits = personalityTraits;
        this.ideals = ideals;
        this.bonds = bonds;
        this.flaws = flaws;
        this.XP = XP;
        this.STR = STR;
        this.strMod = strMod;
        this.DEX = DEX;
        this.dexMod = dexMod;
        this.CON = CON;
        this.conMod = conMod;
        this.OINT = OINT;
        this.intMod = intMod;
        this.WIS = WIS;
        this.wisMod = wisMod;
        this.CHA = CHA;
        this.chaMod = chaMod;
        this.passive = passive;
        this.profBonus = profBonus;
        this.initiative = initiative;
        this.speed = speed;
        this.hpMax = hpMax;
        this.hdTotal = hdTotal;
        this.HD = HD;
        this.raceBonuses = raceBonuses;
        this.raceAndFeatures = raceAndFeatures;
        this.featuresAndTraits = featuresAndTraits;
        this.aClasse = aClass;
    }

    public Pg() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "IDuser")
    private Long userId;

    @Column(name = "CharacterName")
    private String characterName;

    @Column(name = "Race")
    private String race;

    @Column(name = "Alignment")
    private String alignment;

    @Column(name = "ClassLevel")
    private Integer classLevel;

    @Column(name = "Background")
    private String background;

    @Column(name = "PersonalityTraits")
    private String personalityTraits;

    @Column(name = "Ideals")
    private String ideals;

    @Column(name = "Bonds")
    private String bonds;

    @Column(name = "Flaws")
    private String flaws;

    @Column(name = "XP")
    private Integer XP;

    @Column(name = "STR")
    private Integer STR;

    @Column(name = "STRmod")
    private Integer strMod;

    @Column(name = "DEX")
    private Integer DEX;

    @Column(name = "DEXmod")
    private Integer dexMod;

    @Column(name = "CON")
    private Integer CON;

    @Column(name = "CONmod")
    private Integer conMod;

    @Column(name = "OINT")
    private Integer OINT;

    @Column(name = "INTmod")
    private Integer intMod;

    @Column(name = "WIS")
    private Integer WIS;

    @Column(name = "WISmod")
    private Integer wisMod;

    @Column(name = "CHA")
    private Integer CHA;

    @Column(name = "CHAmod")
    private Integer chaMod;

    @Column(name = "Passive")
    private Integer passive;

    @Column(name = "ProfBonus")
    private Integer profBonus;

    @Column(name = "Initiative")
    private Integer initiative;

    @Column(name = "Speed")
    private Integer speed;

    @Column(name = "HPMax")
    private Integer hpMax;

    @Column(name = "HDTotal")
    private Integer hdTotal;

    @Column(name = "HD")
    private Integer HD;

    @Column(name = "RaceBonuses")
    private String raceBonuses;

    @Column(name = "RaceAndFeatures")
    private String raceAndFeatures;

    @Column(name = "FeaturesAndTraits")
    private String featuresAndTraits;

    @Column(name = "Classe")
    private String aClasse;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public Integer getClassLevel() {
        return classLevel;
    }

    public void setClassLevel(Integer classLevel) {
        this.classLevel = classLevel;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getPersonalityTraits() {
        return personalityTraits;
    }

    public void setPersonalityTraits(String personalityTraits) {
        this.personalityTraits = personalityTraits;
    }

    public String getIdeals() {
        return ideals;
    }

    public void setIdeals(String ideals) {
        this.ideals = ideals;
    }

    public String getBonds() {
        return bonds;
    }

    public void setBonds(String bonds) {
        this.bonds = bonds;
    }

    public String getFlaws() {
        return flaws;
    }

    public void setFlaws(String flaws) {
        this.flaws = flaws;
    }

    public Integer getXP() {
        return XP;
    }

    public void setXP(Integer xP) {
        XP = xP;
    }

    public Integer getSTR() {
        return STR;
    }

    public void setSTR(Integer sTR) {
        STR = sTR;
    }

    public Integer getStrMod() {
        return strMod;
    }

    public void setStrMod(Integer strMod) {
        this.strMod = strMod;
    }

    public Integer getDEX() {
        return DEX;
    }

    public void setDEX(Integer dEX) {
        DEX = dEX;
    }

    public Integer getDexMod() {
        return dexMod;
    }

    public void setDexMod(Integer dexMod) {
        this.dexMod = dexMod;
    }

    public Integer getCON() {
        return CON;
    }

    public void setCON(Integer cON) {
        CON = cON;
    }

    public Integer getConMod() {
        return conMod;
    }

    public void setConMod(Integer conMod) {
        this.conMod = conMod;
    }

    public Integer getOINT() {
        return OINT;
    }

    public void setOINT(Integer iNT) {
        OINT = iNT;
    }

    public Integer getIntMod() {
        return intMod;
    }

    public void setIntMod(Integer intMod) {
        this.intMod = intMod;
    }

    public Integer getWIS() {
        return WIS;
    }

    public void setWIS(Integer wIS) {
        WIS = wIS;
    }

    public Integer getWisMod() {
        return wisMod;
    }

    public void setWisMod(Integer wisMod) {
        this.wisMod = wisMod;
    }

    public Integer getCHA() {
        return CHA;
    }

    public void setCHA(Integer cHA) {
        CHA = cHA;
    }

    public Integer getChaMod() {
        return chaMod;
    }

    public void setChaMod(Integer chaMod) {
        this.chaMod = chaMod;
    }

    public Integer getPassive() {
        return passive;
    }

    public void setPassive(Integer passive) {
        this.passive = passive;
    }

    public Integer getProfBonus() {
        return profBonus;
    }

    public void setProfBonus(Integer profBonus) {
        this.profBonus = profBonus;
    }

    public Integer getInitiative() {
        return initiative;
    }

    public void setInitiative(Integer initiative) {
        this.initiative = initiative;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getHpMax() {
        return hpMax;
    }

    public void setHpMax(Integer hpMax) {
        this.hpMax = hpMax;
    }

    public Integer getHdTotal() {
        return hdTotal;
    }

    public void setHdTotal(Integer hdTotal) {
        this.hdTotal = hdTotal;
    }

    public Integer getHD() {
        return HD;
    }

    public void setHD(Integer hD) {
        HD = hD;
    }

    public String getRaceBonuses() {
        return raceBonuses;
    }

    public void setRaceBonuses(String raceBonuses) {
        this.raceBonuses = raceBonuses;
    }

    public String getRaceAndFeatures() {
        return raceAndFeatures;
    }

    public void setRaceAndFeatures(String raceAndFeatures) {
        this.raceAndFeatures = raceAndFeatures;
    }

    public String getFeaturesAndTraits() {
        return featuresAndTraits;
    }

    public void setFeaturesAndTraits(String featuresAndTraits) {
        this.featuresAndTraits = featuresAndTraits;
    }

    public String getaClasse(){
        return aClasse;
    }
    public void setaClasse(String aClasse) {
        this.aClasse = aClasse;
    }
}
