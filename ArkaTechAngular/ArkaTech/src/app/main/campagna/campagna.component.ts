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
  arrayCampagneNotConfirm:any =[]
  ngOnInit() {
   console.log(this.arrayCampagne)
    this.getDataCampagne()
    }
  constructor(){

    }
    getDataCampagne(){
      this.arrayCampagne.forEach((obj:any) => {
        console.log(obj.users)
        obj.users.forEach((ele:any) => {
          if (ele.username==this.user.username ) {
            if (!ele.approved) {
              this.arrayCampagneNotConfirm.push(obj)
            }else{
              this.arrayInCampagne.push(obj)
            }
          }
        });
      });
      console.log(this.arrayInCampagne)
    }
    confirmInvite(invite:any){
      this.arrayCampagne.forEach((obj:any) => {
        if (obj.name==invite.name) {
        obj.users.forEach((ele:any) => {
            if (this.user.username==ele.username) {
              ele.approved=true;
              localStorage.setItem("arrayCampagne",JSON.stringify(this.arrayCampagne))
              this.arrayCampagne= JSON.parse( localStorage.getItem("arrayCampagne")||"[]");
             this.getDataCampagne()
            }
          });
        }
      });

    }
}
