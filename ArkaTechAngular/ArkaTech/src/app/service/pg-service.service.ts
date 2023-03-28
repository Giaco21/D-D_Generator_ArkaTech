import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PgServiceService {
  constructor(private http:HttpClient) { }

  //bg
  async  getDataBg() {
     this.http.get('http://localhost:8080/bg').subscribe(
      response =>{
        console.log(response)
        return response
        
      }
      )
      
  }
   getDataBgForType(name:String|undefined) {
    if (name==undefined) {
      alert("errore")
    }else{
      this.http.get('http://localhost:8080/bg/'+name).subscribe(
       response =>{
        console.log(response)
        return response
       }
     )
    }
    console.log(name)
  }
  //races
   async getDataRaces() {
     this.http.get('http://localhost:8080/races').subscribe(
      response =>{
        console.log(response)
       return response
      
      }
    )
   
  }
   getDataRaceAttribute(name:String|undefined) {
    if (name==undefined) {
      alert("errore")
    }else{
      this.http.get('http://localhost:8080/race/'+name).subscribe(
       response =>{
         console.log(response)
        return response
       }
     )

    }
    console.log(name)
  }
}
