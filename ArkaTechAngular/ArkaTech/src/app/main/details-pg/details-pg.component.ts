import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-details-pg',
  templateUrl: './details-pg.component.html',
  styleUrls: ['./details-pg.component.scss']
})
export class DetailsPgComponent {
id:any
pg:any
user:any
constructor(private route: ActivatedRoute,private http:HttpClient) {
  
}
async ngOnInit() {
  this.route.params.subscribe((params:any) => {
    this.id = params["id"]
   console.log(params["id"]) ;
  });

  let arrayPg:any;
  this.http.get('http://localhost:8080/pg').subscribe(
    (response: any) =>{
      arrayPg = response
    
      this.pg = arrayPg.filter((ele:any)=>
        ele.id==this.id 
       )[0]
      console.log(this.pg)
      console.log(response)
    }
  )

this.user = JSON.parse(localStorage.getItem("User") || "");

 /* this.httpClient.get('http://localhost:8080/'+this.user.id).subscribe(
 response =>{
   this.user =  response;
   console.log(this.user)
 }) */

}
pdfDownload(){
  
}

}


