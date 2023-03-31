import { Component } from '@angular/core';

@Component({
  selector: 'app-campagna',
  templateUrl: './campagna.component.html',
  styleUrls: ['./campagna.component.scss']
})
export class CampagnaComponent {
  user:any = JSON.parse( localStorage.getItem("User")||"");
  arrayCampagne:any[] = JSON.parse( localStorage.getItem("arrayCampagne")||"[]");
  arrayMyCampagne:any = this.arrayCampagne.filter((obj:any)=>obj.master==this.user.username)
  arrayInCampagne:any= []
  ngOnInit() {
   console.log(this.arrayCampagne)
    this.arrayCampagne.forEach((obj:any) => {
      console.log(obj.users)
      obj.users.forEach((ele:any) => {
        if (ele.username==this.user.username) {
          this.arrayInCampagne.push(obj)
        }
      });
    });
    console.log(this.arrayInCampagne)
    }
  constructor(){

    }
}
