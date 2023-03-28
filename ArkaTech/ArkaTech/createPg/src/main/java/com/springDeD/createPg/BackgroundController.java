package com.springDeD.createPg;

import java.util.ArrayList;

import com.springDeD.createPg.backgrounds.Acolyte;
import com.springDeD.createPg.backgrounds.BackgroundClass;
import com.springDeD.createPg.backgrounds.BackgroundDto;
import com.springDeD.createPg.backgrounds.Charlatan;
import com.springDeD.createPg.backgrounds.Criminal;
import com.springDeD.createPg.backgrounds.Entertainer;
import com.springDeD.createPg.backgrounds.FolkHero;
import com.springDeD.createPg.backgrounds.GuildArtisan;
import com.springDeD.createPg.backgrounds.Hermit;
import com.springDeD.createPg.backgrounds.Noble;
import com.springDeD.createPg.backgrounds.Outlander;
import com.springDeD.createPg.backgrounds.Sage;
import com.springDeD.createPg.backgrounds.Sailor;
import com.springDeD.createPg.backgrounds.Soldier;
import com.springDeD.createPg.backgrounds.Urchin;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackgroundController {
    BackgroundClass backClass = new BackgroundClass();
    ArrayList<String[]> acolyteTxt = new ArrayList<>();
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/bg")
    public String [] getBackgrounds(){
        String [] bgname = {backClass.getAcolyte().getBackgroundName(), backClass.getCharlatan().getBackgroundName(), backClass.getCriminal().getBackgroundName(), backClass.getEntertainer().getBackgroundName(),backClass.getFolkHero().getBackgroundName(), backClass.getGuildArtisan().getBackgroundName(), backClass.getHermit().getBackgroundName(), backClass.getNoble().getBackgroundName(), backClass.getOutlander().getBackgroundName(), backClass.getSage().getBackgroundName(),backClass.getSailor().getBackgroundName(), backClass.getSoldier().getBackgroundName(), backClass.getUrchin().getBackgroundName()};
        return bgname;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/bg/{backgrounds}")
    public BackgroundDto getBackgroundsDto(@PathVariable String backgrounds){
        switch(backgrounds){
            case "Acolyte":
                Acolyte acolyte = backClass.getAcolyte();
                return new BackgroundDto(acolyte.getBackgroundName(), acolyte.getPersonalityTraits(), acolyte.getIdeals(), acolyte.getBonds(), acolyte.getFlaws());
            case "Charlatan":
                Charlatan charlatan = backClass.getCharlatan();
                return new BackgroundDto(charlatan.getBackgroundName(), charlatan.getPersonalityTraits(),  charlatan.getIdeals(), charlatan.getBonds(), charlatan.getFlaws());
            case "Criminal":
                Criminal criminal = backClass.getCriminal();
                return new BackgroundDto(criminal.getBackgroundName(), criminal.getPersonalityTraits(), criminal.getIdeals(), criminal.getBonds(), criminal.getFlaws());
            case "Entertainer":
                Entertainer entertainer = backClass.getEntertainer();
                return new BackgroundDto(entertainer.getBackgroundName(), entertainer.getPersonalityTraits(),  entertainer.getIdeals(), entertainer.getBonds(), entertainer.getFlaws());
            case "Folk Hero":
                FolkHero folkHero = backClass.getFolkHero();
                return new BackgroundDto(folkHero.getBackgroundName(), folkHero.getPersonalityTraits(), folkHero.getIdeals(), folkHero.getBonds(), folkHero.getFlaws());
            case "Guild Artisan":
                GuildArtisan guildArtisan = backClass.getGuildArtisan();
                return new BackgroundDto(guildArtisan.getBackgroundName(), guildArtisan.getPersonalityTraits(),  guildArtisan.getIdeals(), guildArtisan.getBonds(), guildArtisan.getFlaws());
            case "Hermit":
                Hermit hermit = backClass.getHermit();
                return new BackgroundDto(hermit.getBackgroundName(), hermit.getPersonalityTraits(), hermit.getIdeals(), hermit.getBonds(), hermit.getFlaws());
            case "Noble":
                Noble noble = backClass.getNoble();
                return new BackgroundDto(noble.getBackgroundName(), noble.getPersonalityTraits(),  noble.getIdeals(), noble.getBonds(), noble.getFlaws());
            case "Outlander":
                Outlander outlander = backClass.getOutlander();
                return new BackgroundDto(outlander.getBackgroundName(), outlander.getPersonalityTraits(), outlander.getIdeals(), outlander.getBonds(), outlander.getFlaws());
            case "Sage":
                Sage sage = backClass.getSage();
                return new BackgroundDto(sage.getBackgroundName(), sage.getPersonalityTraits(),  sage.getIdeals(), sage.getBonds(), sage.getFlaws());
            case "Sailor":
                Sailor sailor = backClass.getSailor();
                return new BackgroundDto(sailor.getBackgroundName(), sailor.getPersonalityTraits(),  sailor.getIdeals(), sailor.getBonds(), sailor.getFlaws());
            case "Soldier":
                Soldier soldier = backClass.getSoldier();
                return new BackgroundDto(soldier.getBackgroundName(), soldier.getPersonalityTraits(), soldier.getIdeals(), soldier.getBonds(), soldier.getFlaws());
            case "Urchin":
                Urchin urchin = backClass.getUrchin();
                return new BackgroundDto(urchin.getBackgroundName(), urchin.getPersonalityTraits(),  urchin.getIdeals(), urchin.getBonds(), urchin.getFlaws());
        default:
        throw new IllegalArgumentException("Background not valid: " + backgrounds);
    }
}
}