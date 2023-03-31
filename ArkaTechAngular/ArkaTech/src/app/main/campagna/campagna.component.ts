import { Component } from '@angular/core';

@Component({
  selector: 'app-campagna',
  templateUrl: './campagna.component.html',
  styleUrls: ['./campagna.component.scss']
})
export class CampagnaComponent {
  arrayCampagne:any[] = JSON.parse( localStorage.getItem("arrayCampagne")||"[]");
  ngOnInit() {
   console.log(this.arrayCampagne)
    }
  constructor(){

    }
}
