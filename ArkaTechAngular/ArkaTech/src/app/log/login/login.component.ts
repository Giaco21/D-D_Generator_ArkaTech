import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss'],
})
export class LoginComponent {

  profileForm = new FormGroup({
    email: new FormControl(''),
    password: new FormControl(''),
  });
  arrayUsers: any;
  constructor(private httpClient : HttpClient){}
  arrayPg:any
  ngOnInit() {
    this.getData()
    this.logOut()

    console.log(this.arrayPg)
  }
  async getData() {
    this.httpClient.get('http://localhost:8080/users').subscribe(
      response =>{
        this.arrayUsers = response
        console.log(response)
      }
    )

  }
  logOut(){
    if ( localStorage.getItem('User')==null) {

    }else{
      if (confirm("CONFERMI IL LOGOUT?")) {

        localStorage.removeItem( 'User');
       window.location.href="http://localhost:4200/login"
      }else{
        window.location.href="http://localhost:4200/home"
      }
    }

  }
  log() {
    this.getData()
    let user = this.arrayUsers.filter(
      (ele: any) => ele.email == this.profileForm.controls['email'].value
    )[0];
    if (user == undefined) {
      alert('dati non validi');
    }
    console.log(user);
    if (user.password == this.profileForm.controls['password'].value) {
      console.log('loggato');
      localStorage.setItem( 'User',JSON.stringify(user));
      localStorage.setItem("arrayPg", JSON.stringify([]));
      // localStorage.setItem("arrayCampagne", JSON.stringify([]));
      window.location.href = 'http://localhost:4200/';
    } else {
      alert('dati non validi');
    }
    if (user == undefined) {
      alert('dati non validi');
    }
    console.log(user);
  }
}
