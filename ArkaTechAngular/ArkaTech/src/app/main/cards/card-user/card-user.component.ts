import { Component ,Input} from '@angular/core';

@Component({
  selector: 'app-card-user',
  templateUrl: './card-user.component.html',
  styleUrls: ['./card-user.component.scss']
})
export class CardUserComponent {
user:any;
ngOnInit(){

   this.getUser();
   if (this.user==null) {
     window.location.href="http://localhost:4200/login";
   }
}
getUser(){
  this.user =  window?.localStorage?.getItem("User");
  console.log(JSON.parse(this.user));
  this.user = JSON.parse(this.user);

}
}
