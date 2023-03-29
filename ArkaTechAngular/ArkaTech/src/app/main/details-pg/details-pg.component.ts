import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import jsPDF from 'jspdf';
import html2canvas from 'html2canvas';

@Component({
  selector: 'app-details-pg',
  templateUrl: './details-pg.component.html',
  styleUrls: ['./details-pg.component.scss']
})
export class DetailsPgComponent {
id:any
pgPrevId:any
pg:any
pgNextId:any
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
      for (let i = 0; i < arrayPg.length; i++) {
        if (arrayPg[i].id==this.id) {
          i==0?  this.pgPrevId=arrayPg[arrayPg.length-1]:this.pgPrevId=arrayPg[i-1].id
          this.pg = arrayPg[i]
          i==arrayPg.length-1? this.pgNextId=arrayPg[0]:this.pgNextId=arrayPg[i+1].id
        }
        
      }
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
public openPDF(): void {
  let DATA: any = document.getElementById('printPg');
  html2canvas(DATA).then((canvas) => {
    let fileWidth = 208;
    let fileHeight = (canvas.height * fileWidth) / canvas.width;
    const FILEURI = canvas.toDataURL('image/png');
    let PDF = new jsPDF('p', 'mm', 'a4');
    let position = 0;
    PDF.addImage(FILEURI, 'PNG', 0, position, fileWidth, fileHeight);
    PDF.save('angular-demo.pdf');
  });
}

}


