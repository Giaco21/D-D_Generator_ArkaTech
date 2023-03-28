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
    Dagger dagger = new Dagger();
    Dart dart = new Dart();
    Flail flail = new Flail();
    Glaive glaive = new Glaive();
    Greataxe greataxe = new Greataxe();
    Greatclub greatclub = new Greatclub();
    Greatsword greatsword = new Greatsword();
    Halberd halberd = new Halberd();
    Handaxe handaxe = new Handaxe();
    HandCrossbow handCrossbow = new HandCrossbow();
    HeavyCrossbow heavyCrossbow = new HeavyCrossbow();
    Javelin javelin = new Javelin();
    Lance lance = new Lance();
    LightCrossbow lightCrossbow = new LightCrossbow();
    LightHammer lightHammer = new LightHammer();
    Longbow longbow = new Longbow();
    Longsword longsword = new Longsword();
    Mace mace = new Mace();
    Maul maul = new Maul();
    Morningstar morningstar = new Morningstar();
    Net net = new Net();
    Pike pike = new Pike();
    Quarterstaff quarterstaff = new Quarterstaff();
    Rapier rapier = new Rapier();
    Scimtar scimtar = new Scimtar();
    Shortbow shortbow = new Shortbow();
    Shortsword shortsword = new Shortsword();
    Sickle sickle = new Sickle();
    Sling sling = new Sling();
    Spear spear = new Spear();
    Trident trident = new Trident();
    Warhammer warhammer = new Warhammer();
    WarPick warPick = new WarPick();
    Whip whip = new Whip();
    ArrayList<String[]> classesTxt = new ArrayList<>();

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/weapons")
    public String[] getClasses() {
        String[] weaponsName = { battleaxe.getName(), blowgun.getName(), club.getName(), dagger.getName(),
                dart.getName(), flail.getName(), glaive.getName(), greataxe.getName(), greatclub.getName(),
                greatsword.getName(), halberd.getName(), handaxe.getName(), handCrossbow.getName(),
                heavyCrossbow.getName(), javelin.getName(), lance.getName(), lightCrossbow.getName(),
                lightHammer.getName(), longbow.getName(), longsword.getName(), mace.getName(), maul.getName(),
                morningstar.getName(), net.getName(), pike.getName(), quarterstaff.getName(), rapier.getName(),
                scimtar.getName(), shortbow.getName(), shortsword.getName(), sickle.getName(), sling.getName(),
                spear.getName(), trident.getName(), warhammer.getName(), warPick.getName(), whip.getName() };
        return weaponsName;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/weapons/{name}")
    public WeaponsClass getWeapon(@PathVariable String name) {
        switch (name) {
            case "Battleaxe":
                return weaponsClass = new WeaponsClass(battleaxe.getName(), battleaxe.getDamageDie(),
                        battleaxe.getDamageType(), battleaxe.getWeight(), battleaxe.getProperties());
            case "Blowgun":
                return new WeaponsClass(blowgun.getName(), blowgun.getDamageDie(), blowgun.getDamageType(),
                        blowgun.getWeight(), blowgun.getProperties());
            case "Club":
                return new WeaponsClass(club.getName(), club.getDamageDie(), club.getDamageType(), club.getWeight(),
                        club.getProperties());
            case "Dagger":
                return new WeaponsClass(dagger.getName(), dagger.getDamageDie(), dagger.getDamageType(),
                        dagger.getWeight(), dagger.getProperties());
            case "Dart":
                return new WeaponsClass(dart.getName(), dart.getDamageDie(), dart.getDamageType(), dart.getWeight(),
                        dart.getProperties());
            case "Flail":
                return new WeaponsClass(flail.getName(), flail.getDamageDie(), flail.getDamageType(), flail.getWeight(),
                        flail.getProperties());
            case "Glaive":
                return new WeaponsClass(glaive.getName(), glaive.getDamageDie(), glaive.getDamageType(),
                        glaive.getWeight(), glaive.getProperties());
            case "Greataxe":
                return new WeaponsClass(greataxe.getName(), greataxe.getDamageDie(), greataxe.getDamageType(),
                        greataxe.getWeight(), greataxe.getProperties());
            case "Greatclub":
                return new WeaponsClass(greatclub.getName(), greatclub.getDamageDie(), greatclub.getDamageType(),
                        greatclub.getWeight(), greatclub.getProperties());
            case "Greatsword":
                return weaponsClass = new WeaponsClass(greatsword.getName(), greatsword.getDamageDie(),
                        greatsword.getDamageType(), greatsword.getWeight(), greatsword.getProperties());
            case "Handaxe":
                return new WeaponsClass(handaxe.getName(), handaxe.getDamageDie(), handaxe.getDamageType(),
                        handaxe.getWeight(), handaxe.getProperties());
            case "HandCrossbow":
                return new WeaponsClass(handCrossbow.getName(), handCrossbow.getDamageDie(),
                        handCrossbow.getDamageType(), handCrossbow.getWeight(), handCrossbow.getProperties());
            case "HeavyCrossbow":
                return new WeaponsClass(heavyCrossbow.getName(), heavyCrossbow.getDamageDie(),
                        heavyCrossbow.getDamageType(), heavyCrossbow.getWeight(), heavyCrossbow.getProperties());
            case "Javelin":
                return new WeaponsClass(javelin.getName(), javelin.getDamageDie(), javelin.getDamageType(),
                        javelin.getWeight(), javelin.getProperties());
            case "LightCrossbow":
                return new WeaponsClass(lightCrossbow.getName(), lightCrossbow.getDamageDie(),
                        lightCrossbow.getDamageType(), lightCrossbow.getWeight(), lightCrossbow.getProperties());
            case "LightHammer":
                return new WeaponsClass(lightHammer.getName(), lightHammer.getDamageDie(), lightHammer.getDamageType(),
                        lightHammer.getWeight(), lightHammer.getProperties());
            case "Longbow":
                return new WeaponsClass(longbow.getName(), longbow.getDamageDie(), longbow.getDamageType(),
                        longbow.getWeight(), longbow.getProperties());
            case "Longsword":
                return new WeaponsClass(longsword.getName(), longsword.getDamageDie(), longsword.getDamageType(),
                        longsword.getWeight(), longsword.getProperties());
            case "Mace":
                return new WeaponsClass(mace.getName(), mace.getDamageDie(), mace.getDamageType(), mace.getWeight(),
                        mace.getProperties());
            case "Maul":
                return new WeaponsClass(maul.getName(), maul.getDamageDie(), maul.getDamageType(), maul.getWeight(),
                        maul.getProperties());
            case "Morningstar":
                return new WeaponsClass(morningstar.getName(), morningstar.getDamageDie(), morningstar.getDamageType(),
                        morningstar.getWeight(), morningstar.getProperties());
            case "Net":
                return new WeaponsClass(net.getName(), net.getDamageDie(), net.getDamageType(), net.getWeight(),
                        greatclub.getProperties());
            case "Pike":
                return weaponsClass = new WeaponsClass(pike.getName(), pike.getDamageDie(), pike.getDamageType(),
                        pike.getWeight(), pike.getProperties());
            case "Quarterstaff":
                return new WeaponsClass(quarterstaff.getName(), quarterstaff.getDamageDie(),
                        quarterstaff.getDamageType(), quarterstaff.getWeight(), quarterstaff.getProperties());
            case "Rapier":
                return new WeaponsClass(rapier.getName(), rapier.getDamageDie(), rapier.getDamageType(),
                        rapier.getWeight(), rapier.getProperties());
            case "Scimtar":
                return new WeaponsClass(scimtar.getName(), scimtar.getDamageDie(), scimtar.getDamageType(),
                        scimtar.getWeight(), scimtar.getProperties());
            case "Shortbow":
                return new WeaponsClass(shortbow.getName(), shortbow.getDamageDie(), shortbow.getDamageType(),
                        shortbow.getWeight(), shortbow.getProperties());
            case "Shortsword":
                return new WeaponsClass(shortsword.getName(), shortsword.getDamageDie(), shortsword.getDamageType(),
                        shortsword.getWeight(), shortsword.getProperties());
            case "Sickle":
                return new WeaponsClass(sickle.getName(), sickle.getDamageDie(), sickle.getDamageType(),
                        sickle.getWeight(), sickle.getProperties());
            case "Sling":
                return new WeaponsClass(sling.getName(), sling.getDamageDie(), sling.getDamageType(), sling.getWeight(),
                        sling.getProperties());
            case "Spear":
                return new WeaponsClass(spear.getName(), spear.getDamageDie(), spear.getDamageType(), spear.getWeight(),
                        spear.getProperties());
            case "Trident":
                return new WeaponsClass(trident.getName(), trident.getDamageDie(), trident.getDamageType(),
                        trident.getWeight(), trident.getProperties());
            case "Warhammer":
                return new WeaponsClass(warhammer.getName(), warhammer.getDamageDie(), warhammer.getDamageType(),
                        warhammer.getWeight(), warhammer.getProperties());
            case "WarPick":
                return new WeaponsClass(warPick.getName(), warPick.getDamageDie(), warPick.getDamageType(),
                        warPick.getWeight(), warPick.getProperties());
            case "Whip":
                return new WeaponsClass(whip.getName(), whip.getDamageDie(), whip.getDamageType(), whip.getWeight(),
                        whip.getProperties());

            default:
                throw new IllegalArgumentException("Class not valid: " + weaponsClass);
        }
    }
    /**
     * @CrossOrigin(origins = "http://localhost:4200")
     *                      @PostMapping("/weapons")
     *                      public ResponseEntity<String> addWeapon(@RequestBody
     *                      WeaponDto weaponDto) {
     *                      // crea un oggetto di classe corrispondente ai dati
     *                      ricevuti
     *                      WeaponsClass newClass = new
     *                      WeaponsClass(weaponDto.getClassName(),
     *                      weaponDto.getNumHitDie(), weaponDto.getHitDice(),
     *                      classDto.getProficiencyBonus(),
     *                      classDto.getSavingThrows(), classDto.getSkills(),
     *                      classDto.getFeatures(), classDto.getProficiencies(),
     *                      classDto.getFirstEquipmentChoice(),
     *                      classDto.getSecondEquipmentChoice(),
     *                      classDto.getGuaranteedEquipment());
     *                      // aggiungi la nuova classe alla lista delle classi
     *                      disponibili
     *                      clasClass.addClass(newClass);
     *                      // restituisci una risposta con lo status code 201
     *                      Created e l'URI della nuova risorsa
     *                      return ResponseEntity.created(URI.create("/classes/" +
     *                      newClass.getClassName())).build();
     *                      }
     **/

}
