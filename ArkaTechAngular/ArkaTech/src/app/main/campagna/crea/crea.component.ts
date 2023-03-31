import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-crea',
  templateUrl: './crea.component.html',
  styleUrls: ['./crea.component.scss']
})
export class CreaComponent {
  user=JSON.parse(localStorage.getItem('User')||'')
arrayUsers:any
  createCampagna = new FormGroup({
    name: new FormControl(''),
  });
  arrayUsersSelected:any=[]
  ngOnInit() {
    this.getData()
   

    console.log(this.arrayUsers)
  }
  constructor(private httpClient:HttpClient){

  }

  async getData() {
    this.httpClient.get('http://localhost:8080/users').subscribe(
      response =>{
        this.arrayUsers = response
        this.arrayUsers = this.arrayUsers.filter((obj:any)=>obj.id!=this.user.id)
        console.log(response)
      }
    )

  }
  create(){
    let arrayCampagne:any = JSON.parse( localStorage.getItem("arrayCampagne")||"[]");
    let arrayUsersId:any=[]
    this.arrayUsersSelected.forEach((obj:any) => {
      arrayUsersId.push(obj.username)
    });
    let jsoCampagna= {
      name:this.createCampagna.controls['name'].value,
      users:arrayUsersId,
      master:this.user.username
    }
    
    arrayCampagne.push(jsoCampagna)
    console.log(arrayCampagne)
    localStorage.setItem("arrayCampagne", JSON.stringify(arrayCampagne));

  }
  add(user:any){
    this.arrayUsersSelected.push(user)
    console.log(this.arrayUsersSelected)
    this.arrayUsers = this.arrayUsers.filter((ele:any)=>ele.username!=user.username)
    console.log(this.arrayUsers)
  }
  delete(user:any){
    this.arrayUsers.push(user)
    console.log(this.arrayUsersSelected)
    this.arrayUsersSelected = this.arrayUsersSelected.filter((ele:any)=>ele.username!=user.username)
    console.log(this.arrayUsers)
  }
}