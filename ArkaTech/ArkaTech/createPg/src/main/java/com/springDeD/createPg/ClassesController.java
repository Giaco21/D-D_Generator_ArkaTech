package com.springDeD.createPg;

import java.net.URI;
import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springDeD.createPg.backgrounds.BackgroundDto;
import com.springDeD.createPg.classes.Barbarian;
import com.springDeD.createPg.classes.Bard;
import com.springDeD.createPg.classes.ClassDto;
import com.springDeD.createPg.classes.ClassesClass;
import com.springDeD.createPg.classes.Cleric;
import com.springDeD.createPg.classes.Druid;
import com.springDeD.createPg.classes.Fighter;
import com.springDeD.createPg.classes.Monk;
import com.springDeD.createPg.classes.Paladin;
import com.springDeD.createPg.classes.Ranger;
import com.springDeD.createPg.classes.Rogue;
import com.springDeD.createPg.classes.Sorcerer;
import com.springDeD.createPg.classes.Warlock;
import com.springDeD.createPg.classes.Wizard;

@RestController
public class ClassesController {

    ClassesClass clasClass = new ClassesClass();
    ArrayList<String[]> classesTxt = new ArrayList<>();
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/classes")
    public String [] getClasses(){
        String [] classes = {clasClass.getBarbarian().getClassName(),clasClass.getBard().getClassName(),clasClass.getCleric().getClassName(),clasClass.getDruid().getClassName(),clasClass.getFighter().getClassName(),clasClass.getMonk().getClassName(),clasClass.getPaladin().getClassName(),clasClass.getRanger().getClassName(),clasClass.getRogue().getClassName(),clasClass.getSorcerer().getClassName(),clasClass.getWarlock().getClassName(),clasClass.getWizard().getClassName(),};
        return classes;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/classes/{aclass}")
    public ClassDto getClassesDto(@PathVariable String aclass){
        switch(aclass){
            case "Barbarian":
                Barbarian barbarian = clasClass.getBarbarian();
                return new ClassDto(barbarian.getClassName(), barbarian.getNumHitDie(), barbarian.getHitDice(), barbarian.getProficiencyBonus(), barbarian.getSavingThrows(), barbarian.getSkills(), barbarian.getFeatures(), barbarian.getProficiencies(), barbarian.getFirstEquipmentChoice(), barbarian.getSecondEquipmentChoice(), barbarian.getGuaranteedEquipment());
                case "Bard":
                Bard bard = clasClass.getBard();
                return new ClassDto(bard.getClassName(), bard.getNumHitDie(), bard.getHitDice(), bard.getProficiencyBonus(), bard.getSavingThrows(), bard.getSkills(), bard.getFeatures(), bard.getProficiencies(), bard.getFirstEquipmentChoice(), bard.getSecondEquipmentChoice(), bard.getGuaranteedEquipment());
                case "Cleric":
                Cleric cleric = clasClass.getCleric();
                return new ClassDto(cleric.getClassName(), cleric.getNumHitDie(), cleric.getHitDice(), cleric.getProficiencyBonus(), cleric.getSavingThrows(), cleric.getSkills(), cleric.getFeatures(), cleric.getProficiencies(), cleric.getFirstEquipmentChoice(), cleric.getSecondEquipmentChoice(), cleric.getGuaranteedEquipment());
                case "Druid":
                Druid druid = clasClass.getDruid();
                return new ClassDto(druid.getClassName(), druid.getNumHitDie(), druid.getHitDice(), druid.getProficiencyBonus(), druid.getSavingThrows(), druid.getSkills(), druid.getFeatures(), druid.getProficiencies(), druid.getFirstEquipmentChoice(), druid.getSecondEquipmentChoice(), druid.getGuaranteedEquipment());
                case "Fighter":
                Fighter fighter = clasClass.getFighter();
                return new ClassDto(fighter.getClassName(), fighter.getNumHitDie(), fighter.getHitDice(), fighter.getProficiencyBonus(), fighter.getSavingThrows(), fighter.getSkills(), fighter.getFeatures(), fighter.getProficiencies(), fighter.getFirstEquipmentChoice(), fighter.getSecondEquipmentChoice(), fighter.getGuaranteedEquipment());
                case "Monk":
                Monk monk = clasClass.getMonk();
                return new ClassDto(monk.getClassName(), monk.getNumHitDie(), monk.getHitDice(), monk.getProficiencyBonus(), monk.getSavingThrows(), monk.getSkills(), monk.getFeatures(), monk.getProficiencies(), monk.getFirstEquipmentChoice(), monk.getSecondEquipmentChoice(), monk.getGuaranteedEquipment());
                case "Paladin":
                Paladin paladin = clasClass.getPaladin();
                return new ClassDto(paladin.getClassName(), paladin.getNumHitDie(), paladin.getHitDice(), paladin.getProficiencyBonus(), paladin.getSavingThrows(), paladin.getSkills(), paladin.getFeatures(), paladin.getProficiencies(), paladin.getFirstEquipmentChoice(), paladin.getSecondEquipmentChoice(), paladin.getGuaranteedEquipment());
                case "Ranger":
                Ranger ranger = clasClass.getRanger();
                return new ClassDto(ranger.getClassName(), ranger.getNumHitDie(), ranger.getHitDice(), ranger.getProficiencyBonus(), ranger.getSavingThrows(), ranger.getSkills(), ranger.getFeatures(), ranger.getProficiencies(), ranger.getFirstEquipmentChoice(), ranger.getSecondEquipmentChoice(), ranger.getGuaranteedEquipment());
                case "Rogue":
                Rogue rogue = clasClass.getRogue();
                return new ClassDto(rogue.getClassName(), rogue.getNumHitDie(), rogue.getHitDice(), rogue.getProficiencyBonus(), rogue.getSavingThrows(), rogue.getSkills(), rogue.getFeatures(), rogue.getProficiencies(), rogue.getFirstEquipmentChoice(), rogue.getSecondEquipmentChoice(), rogue.getGuaranteedEquipment());
                case "Sorcerer":
                Sorcerer sorcerer = clasClass.getSorcerer();
                return new ClassDto(sorcerer.getClassName(), sorcerer.getNumHitDie(), sorcerer.getHitDice(), sorcerer.getProficiencyBonus(), sorcerer.getSavingThrows(), sorcerer.getSkills(), sorcerer.getFeatures(), sorcerer.getProficiencies(), sorcerer.getFirstEquipmentChoice(), sorcerer.getSecondEquipmentChoice(), sorcerer.getGuaranteedEquipment());
                case "Warlock":
                Warlock warlock = clasClass.getWarlock();
                return new ClassDto(warlock.getClassName(), warlock.getNumHitDie(), warlock.getHitDice(), warlock.getProficiencyBonus(), warlock.getSavingThrows(), warlock.getSkills(), warlock.getFeatures(), warlock.getProficiencies(), warlock.getFirstEquipmentChoice(), warlock.getSecondEquipmentChoice(), warlock.getGuaranteedEquipment());
                case "Wizard":
                Wizard wizard = clasClass.getWizard();
                return new ClassDto(wizard.getClassName(), wizard.getNumHitDie(), wizard.getHitDice(), wizard.getProficiencyBonus(), wizard.getSavingThrows(), wizard.getSkills(), wizard.getFeatures(), wizard.getProficiencies(), wizard.getFirstEquipmentChoice(), wizard.getSecondEquipmentChoice(), wizard.getGuaranteedEquipment());
            
                default:
            throw new IllegalArgumentException("Class not valid: " + aclass);
        }
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/classes")
    public ResponseEntity<String> addClass(@RequestBody ClassDto classDto) {
    // crea un oggetto di classe corrispondente ai dati ricevuti
    ClassesClass newClass = new ClassesClass(classDto.getClassName(), classDto.getNumHitDie(), classDto.getHitDice(), classDto.getProficiencyBonus(), classDto.getSavingThrows(), classDto.getSkills(), classDto.getFeatures(), classDto.getProficiencies(), classDto.getFirstEquipmentChoice(), classDto.getSecondEquipmentChoice(), classDto.getGuaranteedEquipment());
    // aggiungi la nuova classe alla lista delle classi disponibili
    clasClass.addClass(newClass);
    // restituisci una risposta con lo status code 201 Created e l'URI della nuova risorsa
    return ResponseEntity.created(URI.create("/classes/" + newClass.getClassName())).build();
}

}
