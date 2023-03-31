import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-crea',
  templateUrl: './crea.component.html',
  styleUrls: ['./crea.component.scss']
})
export class CreaComponent {

  createCampagna = new FormGroup({
    name: new FormControl(''),
  });
  create(){
    let arrayCampagne:any = JSON.parse( localStorage.getItem("arrayCampagne")||"[]");

    let jsoCampagna= {
      name:this.createCampagna.controls['name'].value
    }
    
    arrayCampagne.push(jsoCampagna)
    console.log(arrayCampagne)
    localStorage.setItem("arrayCampagne", JSON.stringify(arrayCampagne));

  }
}
