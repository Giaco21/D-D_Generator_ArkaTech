package com.springDeD.createPg;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springDeD.createPg.races.DarkElf;
import com.springDeD.createPg.races.Dragonborn;
import com.springDeD.createPg.races.Dwarf;
import com.springDeD.createPg.races.Elf;
import com.springDeD.createPg.races.ForestGnome;
import com.springDeD.createPg.races.Gnome;
import com.springDeD.createPg.races.HalfElf;
import com.springDeD.createPg.races.HalfOrc;
import com.springDeD.createPg.races.Halfling;
import com.springDeD.createPg.races.HighElf;
import com.springDeD.createPg.races.HillDwarf;
import com.springDeD.createPg.races.Human;
import com.springDeD.createPg.races.LightFoot;
import com.springDeD.createPg.races.MountainDwarf;
import com.springDeD.createPg.races.RacesClass;
import com.springDeD.createPg.races.RacesDto;
import com.springDeD.createPg.races.RockGnome;
import com.springDeD.createPg.races.Stout;
import com.springDeD.createPg.races.Tiefling;
import com.springDeD.createPg.races.WoodElf;



@RestController
public class RacesController {
    RacesClass racesClass = new RacesClass();
    ArrayList<String[]> racesTxt = new ArrayList<>();

    @CrossOrigin(origins = "http://localhost:4200/")
    @GetMapping("/races")
    public String[] getRaces(){
        String [] racesName = {racesClass.getDarkElf().getRacesName(),racesClass.getDragonborn().getRacesName(),racesClass.getDwarf().getRacesName(),racesClass.getElf().getRacesName(),racesClass.getForestGnome().getRacesName(),racesClass.getGnome().getRacesName(),racesClass.getHalfElf().getRacesName(),racesClass.getHalfling().getRacesName(),racesClass.getHalfOrc().getRacesName(),racesClass.getHighElf().getRacesName(),racesClass.getHillDwarf().getRacesName(),racesClass.getHuman().getRacesName(),racesClass.getLightFoot().getRacesName(),racesClass.getMountainDwarf().getRacesName(),racesClass.getRockGnome().getRacesName(),racesClass.getStout().getRacesName(),racesClass.getTiefling().getRacesName(),racesClass.getWoodElf().getRacesName(),};
        return racesName;
    }

    @GetMapping("/races/{race}")
    public RacesDto getRacesDto(@PathVariable String race){
        switch(race){
            case "Dark Elf":
            DarkElf darkElf = racesClass.getDarkElf();
            return new RacesDto(darkElf.getRacesName(),darkElf.getStrength(), darkElf.getDexterity(), darkElf.getConstitution(), darkElf.getIntelligence(), darkElf.getWisdom(), darkElf.getCharisma());
            case "Dragonborn":
            Dragonborn dragonborn = racesClass.getDragonborn();
            return new RacesDto(dragonborn.getRacesName(),dragonborn.getStrength(), dragonborn.getDexterity(), dragonborn.getConstitution(), dragonborn.getIntelligence(), dragonborn.getWisdom(), dragonborn.getCharisma());
            case "Dwarf":
            Dwarf dwarf = racesClass.getDwarf();
            return new RacesDto(dwarf.getRacesName(),dwarf.getStrength(), dwarf.getDexterity(), dwarf.getConstitution(), dwarf.getIntelligence(), dwarf.getWisdom(), dwarf.getCharisma());
            case "Elf":
            Elf elf = racesClass.getElf();
            return new RacesDto(elf.getRacesName(),elf.getStrength(), elf.getDexterity(), elf.getConstitution(), elf.getIntelligence(), elf.getWisdom(), elf.getCharisma());
            case "Forest Gnome":
            ForestGnome forestGnome = racesClass.getForestGnome();
            return new RacesDto(forestGnome.getRacesName(),forestGnome.getStrength(), forestGnome.getDexterity(), forestGnome.getConstitution(), forestGnome.getIntelligence(), forestGnome.getWisdom(), forestGnome.getCharisma());
            case "Gnome":
            Gnome gnome = racesClass.getGnome();
            return new RacesDto(gnome.getRacesName(),gnome.getStrength(), gnome.getDexterity(), gnome.getConstitution(), gnome.getIntelligence(), gnome.getWisdom(), gnome.getCharisma());
            case "Half Elf":
            HalfElf halfElf = racesClass.getHalfElf();
            return new RacesDto(halfElf.getRacesName(),halfElf.getStrength(), halfElf.getDexterity(), halfElf.getConstitution(), halfElf.getIntelligence(), halfElf.getWisdom(), halfElf.getCharisma());
            case "Halfling":
            Halfling halfling = racesClass.getHalfling();
            return new RacesDto(halfling.getRacesName(),halfling.getStrength(), halfling.getDexterity(), halfling.getConstitution(), halfling.getIntelligence(), halfling.getWisdom(), halfling.getCharisma());
            case "Half Orc":
            HalfOrc halfOrc = racesClass.getHalfOrc();
            return new RacesDto(halfOrc.getRacesName(),halfOrc.getStrength(), halfOrc.getDexterity(), halfOrc.getConstitution(), halfOrc.getIntelligence(), halfOrc.getWisdom(), halfOrc.getCharisma());
            case "High Elf":
            HighElf highElf = racesClass.getHighElf();
            return new RacesDto(highElf.getRacesName(),highElf.getStrength(), highElf.getDexterity(), highElf.getConstitution(), highElf.getIntelligence(), highElf.getWisdom(), highElf.getCharisma());
            case "Hill Dwarf":
            HillDwarf hillDwarf = racesClass.getHillDwarf();
            return new RacesDto(hillDwarf.getRacesName(),hillDwarf.getStrength(), hillDwarf.getDexterity(), hillDwarf.getConstitution(), hillDwarf.getIntelligence(), hillDwarf.getWisdom(), hillDwarf.getCharisma());
            case "Human":
            Human human = racesClass.getHuman();
            return new RacesDto(human.getRacesName(),human.getStrength(), human.getDexterity(), human.getConstitution(), human.getIntelligence(), human.getWisdom(), human.getCharisma());
            case "Light Foot":
            LightFoot lightFoot = racesClass.getLightFoot();
            return new RacesDto(lightFoot.getRacesName(),lightFoot.getStrength(), lightFoot.getDexterity(), lightFoot.getConstitution(), lightFoot.getIntelligence(), lightFoot.getWisdom(), lightFoot.getCharisma());
            case "Mountain Dwarf":
            MountainDwarf mountainDwarf = racesClass.getMountainDwarf();
            return new RacesDto(mountainDwarf.getRacesName(),mountainDwarf.getStrength(), mountainDwarf.getDexterity(), mountainDwarf.getConstitution(), mountainDwarf.getIntelligence(), mountainDwarf.getWisdom(), mountainDwarf.getCharisma());
            case "Rock Gnome":
            RockGnome rockGnome = racesClass.getRockGnome();
            return new RacesDto(rockGnome.getRacesName(),rockGnome.getStrength(), rockGnome.getDexterity(), rockGnome.getConstitution(), rockGnome.getIntelligence(), rockGnome.getWisdom(), rockGnome.getCharisma());
            case "Stout":
            Stout stout = racesClass.getStout();
            return new RacesDto(stout.getRacesName(),stout.getStrength(), stout.getDexterity(), stout.getConstitution(), stout.getIntelligence(), stout.getWisdom(), stout.getCharisma());
            case "Tiefling":
            Tiefling tiefling = racesClass.getTiefling();
            return new RacesDto(tiefling.getRacesName(),tiefling.getStrength(), tiefling.getDexterity(), tiefling.getConstitution(), tiefling.getIntelligence(), tiefling.getWisdom(), tiefling.getCharisma());
            case "Wood Elf":
            WoodElf woodElf = racesClass.getWoodElf();
            return new RacesDto(woodElf.getRacesName(),woodElf.getStrength(), woodElf.getDexterity(), woodElf.getConstitution(), woodElf.getIntelligence(), woodElf.getWisdom(), woodElf.getCharisma());

            default:
            throw new IllegalArgumentException("Race not valid: " + race);
        }
    }
}
