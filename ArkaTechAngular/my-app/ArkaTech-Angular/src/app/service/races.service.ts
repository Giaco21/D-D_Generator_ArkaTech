import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RacesService {

  constructor() { }

  arrayRaces:String[]=[
    "DarkElf",
    "Dragonborn",      
    "Dwarf",
    "Elf",
    "ForestGnome",
    "Gnome",
    "HalfElf",
    "Halfling",
    "HalfOrc",
    "HighElf",
    "HillDwarf",
    "Human",
    "LightFoot",
    "MountainDwarf",
    "NoRace",
    "RockGnome",
    "Stout",
    "Tiefling",
    "WoodElf"]
}
