import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PgServiceService {
 
  constructor(private http:HttpClient) { }
  //bg
   getDataBg() {
     this.http.get('http://localhost:8080/bg').subscribe(
      response =>{
        console.log(response)
        return response
      
      }
    )
   
  }
   getDataBgForType(name:String) {
    console.log(name)
     this.http.get('http://localhost:8080/bg/'+name).subscribe(
      response =>{
       console.log(response)
       return response
      }
    )
  }
  //races
   getDataRaces() {
     this.http.get('http://localhost:8080/races').subscribe(
      response =>{
        console.log(response)
       return response
      
      }
    )
   
  }
   getDataRaceAttribute(name:String) {
    console.log(name)
     this.http.get('http://localhost:8080/race/'+name).subscribe(
      response =>{
        console.log(response)
       return response
      }
    )
  }

}
