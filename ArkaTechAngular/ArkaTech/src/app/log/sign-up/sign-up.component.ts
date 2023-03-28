import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.scss']
})
export class SignUpComponent {
  addUserForm = new FormGroup({
    username: new FormControl('', [Validators.required]),
    email: new FormControl('', [Validators.required]),
    password: new FormControl('', [Validators.required]),

  });
  jsonUser:any = {
    username:this.addUserForm.controls['username'].value,
    email:this.addUserForm.controls['email'].value,
    password:this.addUserForm.controls['password'].value,
  }
  constructor(private httpClient : HttpClient){}
  createUser(){
    // let flagEmailExist:any="false";
    // let flagUsernameExist:any="false";
    //    fetch(`http://localhost:8080/usersCheckEmail/${this.profileForm.controls['email'].value}`)
    //     .then((response) => response.text())
    //     .then((flag) => {
    //       flagEmailExist = flag;
    //       console.log(flagEmailExist+" email");
    //       if (flagEmailExist=="true") {
    //         alert("email esistente")
    //       }
    //     });
   
    //     fetch(`http://localhost:8080/usersCheckUsername/${this.profileForm.controls['username'].value}`)
    //     .then((response) => response.text())
    //     .then((flag) => {
    //       flagUsernameExist = flag;
    //       console.log(flagUsernameExist +" username");
    //       if (flagUsernameExist=="true") {
    //         alert("Username esistente")
    //       }
    //     });
let jsonUser:any = {
  username:this.addUserForm.controls['username'].value,
  email:this.addUserForm.controls['email'].value,
  password:this.addUserForm.controls['password'].value,
}



this.httpClient
      .post<any>('http://localhost:8080/users', jsonUser)
      .subscribe((response: any) => {
        console.log(response);
      });
    }
}
