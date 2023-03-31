import { Component } from '@angular/core';

@Component({
  selector: 'app-compare',
  templateUrl: './compare.component.html',
  styleUrls: ['./compare.component.scss']
})
export class CompareComponent {
  hpPgA:any =100
  hpPgB:any =100
  pg1:any
  pg2:any
  ngOnInit() {
   
   
  let arrayPgCompara = JSON.parse(localStorage.getItem("arrayPgCompara")||"[]")
    console.log(arrayPgCompara)
    this.pg1=arrayPgCompara[0]
    this.pg2=arrayPgCompara[1]
  }
  attackPg1(){
    this.hpPgA-=20
    if (this.hpPgA<=0) {
      this.hpPgA=100
      this.hpPgB=100
      alert(this.pg2.characterName+" ha vinto")
    }
  }

  attackPg2(){
    this.hpPgB-=20
    if (this.hpPgB<=0) {
      this.hpPgB=100
      this.hpPgA=100
      alert(this.pg1.characterName+" ha vinto")
    }
  }
}
