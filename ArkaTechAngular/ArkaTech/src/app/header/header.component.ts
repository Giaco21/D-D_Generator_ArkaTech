import { Component } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent {
  user:any;
  flagLog:boolean=false;
  ngOnInit() {
    this.user = localStorage.getItem("User")
    if (this.user!=null) {
      this.flagLog=true;
    }
  }
  
  logOut(){
    
    localStorage.removeItem( 'User');
    window.location.href="http://localhost:4200/login"
  }
}
