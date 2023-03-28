package com.springDeD.createPg;

import com.springDeD.createPg.weapons.*;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.ArrayList;

@RestController
public class WeaponController {

    WeaponsClass weaponsClass = new WeaponsClass();
    Battleaxe battleaxe = new Battleaxe();
    Blowgun blowgun = new Blowgun();
    Club club = new Club();
    Dagger dagger=new Dagger();
    Dart dart = new Dart();
    Flail flail= new Flail();
    Glaive  glaive =new Glaive();
    Greataxe greataxe = new Greataxe();
    Greatclub greatclub = new Greatclub();
    Greatsword greatsword = new Greatsword();
    Halberd halberd = new Halberd();
    Handaxe handaxe= new Handaxe();
    HandCrossbow handCrossbow= new HandCrossbow();
    HeavyCrossbow heavyCrossbow = new HeavyCrossbow();
    Javelin javelin =new Javelin();
    Lance lance = new Lance();
    LightCrossbow lightCrossbow = new LightCrossbow();
    LightHammer lightHammer = new LightHammer();
    Longbow longbow = new Longbow();
    Longsword longsword =new Longsword();
    Mace mace = new Mace();
    Maul maul = new Maul();
    Morningstar morningstar = new Morningstar();
    Net net= new Net();
    Pike pike = new Pike();
    Quarterstaff quarterstaff = new Quarterstaff();
    Rapier rapier = new Rapier();
    Scimtar scimtar = new Scimtar();
    Shortbow shortbow = new Shortbow();
    Shortsword shortsword = new Shortsword();
    Sickle sickle = new Sickle();
    Sling sling = new Sling();
    Spear spear =new Spear();
    Trident trident = new Trident();
    Warhammer warhammer = new Warhammer();
    WarPick warPick = new WarPick();
    Whip whip = new Whip();
    ArrayList<String[]> classesTxt = new ArrayList<>();
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/weapons")
    public String [] getClasses(){
        String [] weaponsName = {battleaxe.getName(), blowgun.getName(), club.getName(), dagger.getName(), dart.getName(), flail.getName(), glaive.getName(), greataxe.getName(), greatclub.getName(), greatsword.getName(), halberd.getName(), handaxe.getName(), handCrossbow.getName(), heavyCrossbow.getName(), javelin.getName(), lance.getName(), lightCrossbow.getName(), lightHammer.getName(), longbow.getName(), longsword.getName(), mace.getName(), maul.getName(), morningstar.getName(), net.getName(), pike.getName(), quarterstaff.getName(), rapier.getName(), scimtar.getName(), shortbow.getName(), shortsword.getName(), sickle.getName(), sling.getName(), spear.getName(),trident.getName(), warhammer.getName(), warPick.getName(), whip.getName()};
        return weaponsName;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/weapons/{name}")
    public WeaponsClass getWeapon(@PathVariable String name){
        switch(name){
            case "Battleaxe":
                return weaponsClass = new WeaponsClass(battleaxe.getName(),battleaxe.getDamageDie(), battleaxe.getDamageType(), battleaxe.getWeight(), battleaxe.getProperties());
            case "Blowgun":
                    return new WeaponsClass(blowgun.getName(),blowgun.getDamageDie(), blowgun.getDamageType(), blowgun.getWeight(), blowgun.getProperties());
            case "Club":
                return new WeaponsClass(blowgun.getName(),blowgun.getDamageDie(), blowgun.getDamageType(), blowgun.getWeight(), blowgun.getProperties());
            case "Dagger":
                return new WeaponsClass(blowgun.getName(),blowgun.getDamageDie(), blowgun.getDamageType(), blowgun.getWeight(), blowgun.getProperties());
            case "Dart":
                return new WeaponsClass(blowgun.getName(),blowgun.getDamageDie(), blowgun.getDamageType(), blowgun.getWeight(), blowgun.getProperties());
            case "Flail":
                return new WeaponsClass(blowgun.getName(),blowgun.getDamageDie(), blowgun.getDamageType(), blowgun.getWeight(), blowgun.getProperties());
            case "Glaive":
                return new WeaponsClass(blowgun.getName(),blowgun.getDamageDie(), blowgun.getDamageType(), blowgun.getWeight(), blowgun.getProperties());
            case "Greataxe":
                return new WeaponsClass(blowgun.getName(),blowgun.getDamageDie(), blowgun.getDamageType(), blowgun.getWeight(), blowgun.getProperties());
            case "Greatclub":
                return new WeaponsClass(blowgun.getName(),blowgun.getDamageDie(), blowgun.getDamageType(), blowgun.getWeight(), blowgun.getProperties());

                default:
            throw new IllegalArgumentException("Class not valid: " + weaponsClass);
        }
    }
    /**
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/weapons")
    public ResponseEntity<String> addWeapon(@RequestBody WeaponDto weaponDto) {
    // crea un oggetto di classe corrispondente ai dati ricevuti
    WeaponsClass newClass = new WeaponsClass(weaponDto.getClassName(), weaponDto.getNumHitDie(), weaponDto.getHitDice(), classDto.getProficiencyBonus(), classDto.getSavingThrows(), classDto.getSkills(), classDto.getFeatures(), classDto.getProficiencies(), classDto.getFirstEquipmentChoice(), classDto.getSecondEquipmentChoice(), classDto.getGuaranteedEquipment());
    // aggiungi la nuova classe alla lista delle classi disponibili
    clasClass.addClass(newClass);
    // restituisci una risposta con lo status code 201 Created e l'URI della nuova risorsa
    return ResponseEntity.created(URI.create("/classes/" + newClass.getClassName())).build();
}**/

}
