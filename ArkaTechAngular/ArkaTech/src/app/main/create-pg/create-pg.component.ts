import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
// import * as saveAs from 'file-saver';
import { PgServiceService } from 'src/app/service/pg-service.service';
import jsPDF from 'jspdf';
import html2canvas from 'html2canvas';
@Component({
  selector: 'app-create-pg',
  templateUrl: './create-pg.component.html',
  styleUrls: ['./create-pg.component.scss'],
})
export class CreatePgComponent {
  flagLoadData: boolean = false;
  arrayClassesAtr: any;
  constructor(public pgService: PgServiceService, private http: HttpClient) {}
  createPgForm = new FormGroup({
    characterName: new FormControl('', [Validators.required]),
    aClass: new FormControl('', [Validators.required]),
    race: new FormControl('', [Validators.required]),
    background: new FormControl(' ', [Validators.required]),
    alignment: new FormControl('', [Validators.required]),
    personalityTraits: new FormControl('', [Validators.required]),
    ideals: new FormControl('', [Validators.required]),
    bonds: new FormControl('', [Validators.required]),
    flaws: new FormControl('', [Validators.required]),
    STR: new FormControl(4, [
      Validators.required,
      Validators.max(20),
      Validators.min(0),
    ]),
    DEX: new FormControl(4, [Validators.required]),
    CON: new FormControl(4, [Validators.required]),
    INT: new FormControl(4, [Validators.required]),
    WIS: new FormControl(4, [Validators.required]),
    CHA: new FormControl(4, [Validators.required]),
  });
  getCharacterName() {
    return this.createPgForm.controls['characterName'].value;
  }
  getaClasse() {
    return this.createPgForm.controls['aClass'].value;
  }
  getAlignment() {
    return this.createPgForm.controls['alignment'].value;
  }
  getRace() {
    return this.createPgForm.controls['race'].value;
  }

  getpersonalityTraits() {
    return this.createPgForm.controls['personalityTraits'].value;
  }
  getideals() {
    return this.createPgForm.controls['ideals'].value;
  }
  getbonds() {
    return this.createPgForm.controls['bonds'].value;
  }
  getflaws() {
    return this.createPgForm.controls['flaws'].value;
  }
  getDEX() {
    return this.createPgForm.controls['DEX'].value;
  }
  getCON() {
    return this.createPgForm.controls['CON'].value;
  }
  getINT() {
    return this.createPgForm.controls['INT'].value;
  }
  getWIS() {
    return this.createPgForm.controls['WIS'].value;
  }
  getCHA() {
    return this.createPgForm.controls['CHA'].value;
  }
  positionForm: number = 0;
   jsonPg: any 
  arrayBackground: any;
  arrayRace: any;
  arrayAligmen: any = [' N', 'L/N', 'L/B', 'L/M', 'C/M', 'C/B', 'C/N'];
  arrayClasses: any;
  arrayBackgroundText: any = [];
  arrayRaceAttribute: any = [];
  arrayPg: any;
  user: any;
  async ngOnInit() {
    await this.getDataRaces();
    await this.getDataBg();
    await this.getDataClasses();

    console.log(this.user);
    this.flagLoadData = true;
    console.log(localStorage.getItem('arrayPg'));

    this.arrayPg = JSON.parse(localStorage.getItem('arrayPg') || '[]');
    this.user = JSON.parse(localStorage.getItem('User') || '');
    console.log(this.arrayPg);
  }

  next() {
    switch (this.positionForm) {
      case 0:
        if (
          this.getAlignment() != '' &&
          this.getCharacterName() != '' &&
          this.getAlignment() != '' &&
          this.getRace() != ''
        ) {
          this.positionForm++;
        } else {
          alert('Compila il form prima');
        }
        break;
      case 1:
        if (
          this.getCHA() != 0 &&
          this.getCON() != 0 &&
          this.getDEX() != 0 &&
          this.getINT() != 0
        ) {
          this.positionForm++;
        } else {
          alert('Compila il form prima');
        }
        break;
      case 2:
        this.positionForm++;
        break;
      default:
        break;
    }
  }
  back() {
    this.positionForm--;
  }

  //classes
  async getDataClasses() {
    this.http.get('http://localhost:8080/classes').subscribe((response) => {
      this.arrayClasses = response;
      console.log(this.arrayClasses)
    });
  }
  getDataClassesForType() {
    if (this.createPgForm.controls['background'].value == undefined) {
      alert('errore');
    } else {
      this.http
        .get(
          'http://localhost:8080/classes/' +
            this.createPgForm.controls['aClass'].value
        )
        .subscribe((response) => {
          console.log(response);
          this.arrayClassesAtr = response;
        });
    }
    console.log(this.arrayClassesAtr);
  }
  //bg
  async getDataBg() {
    this.http.get('http://localhost:8080/bg').subscribe((response) => {
      this.arrayBackground = response;
    });
  }
  getDataBgForType() {
    if (this.createPgForm.controls['background'].value == undefined) {
      alert('errore');
    } else {
      this.http
        .get(
          'http://localhost:8080/bg/' +
            this.createPgForm.controls['background'].value
        )
        .subscribe((response) => {
          console.log(response);
          this.arrayBackgroundText = response;
        });
    }
    console.log(name);
  }
  //races
  async getDataRaces() {
    this.http.get('http://localhost:8080/races').subscribe((response) => {
      console.log(response);
      setTimeout(() => {
        this.arrayRace = response;
      }, 1000);
    });
  }
  getDataRaceAttribute() {
    if (this.createPgForm.controls['race'].value == undefined) {
      alert('errore');
    } else {
      this.http
        .get(
          'http://localhost:8080/race/' +
            this.createPgForm.controls['race'].value
        )
        .subscribe((response) => {
          console.log(response);
          this.arrayRaceAttribute = response;
        });
    }
    console.log(name);
  }
  getNum() {
    let num = Math.round(Math.random() * 1000000000000);
    return num;
  }
  fileUrl:any;
  createPg() {  
     this.jsonPg = {
     
      userId: this.user.id,
      characterName: this.getCharacterName(),
      aclasse: this.getaClasse(),
    let jsonPg: any = {

      userId: this.user.id,
      characterName: this.getCharacterName(),
      aClasse: this.getaClasse(),
      race: this.getRace(),
      background: this.createPgForm.controls['background'].value,
      alignment: this.getAlignment(),
      personalityTraits: this.getpersonalityTraits(),
      ideals: this.getideals(),
      bonds: this.getbonds(),
      flaws: this.getflaws(),
      str: this.createPgForm.controls['STR'].value,
      dex: this.getDEX(),
      con: this.getCON(),
      oint: this.getINT(),
      wis: this.getWIS(),
      cha: this.getCHA(),
      classLevel: 1,
      xp: 5,
      strMod: 5,
      dexMod: 5,
      conMod: 5,
      intMod: 5,
      wisMod: 5,
      chaMod: 5,
      passive: 5,
      profBonus: 5,
      initiative: 5,
      speed: 5,
      hpMax: 5,
      hdTotal: 5,
      hd: 5,
      raceBonuses: 'raceBonusesidentifierName',
      raceAndFeatures: 'raceAndFeaturesidentifierName',
      featuresAndTraits: 'featuresAndTraitsidentifierName',
      description:
        "First of all their character is NOT as dumb as is humanly possible which is 3, 3, 3 and even staying within that doesn't have to mean they are 'damaged' to the point of almost being an animal.",
    };

    console.log(this.jsonPg);
    console.log(this.arrayPg);
    this.arrayPg.push(this.jsonPg);
    localStorage.setItem('arrayPg', JSON.stringify(this.arrayPg));
    this.http
      .post<any>('http://localhost:8080/pg', this.jsonPg)
      .subscribe((response: any) => {
        console.log(response);
      });

    console.log(this.jsonPg);
   
  }

  saveCharacterData() {
    const characterData = {
      characterName: this.getCharacterName(),
      aClass: this.getaClasse(),
      race: this.getRace(),
      background: this.createPgForm.controls['background'].value,
      alignment: this.getAlignment(),
      personalityTraits: this.getpersonalityTraits(),
      ideals: this.getideals(),
      bonds: this.getbonds(),
      flaws: this.getflaws(),
      STR: this.createPgForm.controls['STR'].value,
      DEX: this.getDEX(),
      CON: this.getCON(),
      INT: this.getINT(),
      WIS: this.getWIS(),
      CHA: this.getCHA(),
    };

    const fileContent = JSON.stringify(characterData);
    const blob = new Blob([fileContent], { type: 'text/plain;charset=utf-8' });
    // saveAs(blob, `${this.getCharacterName()}.txt`);
  }
  public openPDF(): void {
    let DATA: any = document.getElementById('htmlData');
    html2canvas(DATA).then((canvas) => {
      let fileWidth = 208;
      let fileHeight = (canvas.height * fileWidth) / canvas.width;
      const FILEURI = canvas.toDataURL('image/png');
      let PDF = new jsPDF('p', 'mm', 'a4');
      let position = 0;
      PDF.addImage(FILEURI, 'PNG', 0, position, fileWidth, fileHeight);
      PDF.save('angular-demo.pdf');
    });
  }
}
