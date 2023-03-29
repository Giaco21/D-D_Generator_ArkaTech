import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-archivio',
  templateUrl: './archivio.component.html',
  styleUrls: ['./archivio.component.scss']
})
export class ArchivioComponent {
  arrayPg: any;
  user:any
  flagDownloadData:boolean = false;
  constructor(private httpClient:HttpClient){}
  async ngOnInit() {
     this.getData()

   this.user = JSON.parse(localStorage.getItem("User") || "");
   setTimeout(() => {
    this.flagDownloadData = true;
    console.log(this.flagDownloadData)
   }, 1000);
    /* this.httpClient.get('http://localhost:8080/'+this.user.id).subscribe(
    response =>{
      this.user =  response;
      console.log(this.user)
    }) */
  }
  flagLoadData: boolean = false;
  fileUrl:any;
  async getData() {
   
    this.httpClient.get('http://localhost:8080/pg').subscribe(
      response =>{
        this.arrayPg = response
      
        this.arrayPg = this.arrayPg.filter((ele:any)=>ele.userId==this.user.id)
        console.log(this.arrayPg)
        console.log(response)
      }
    )
   
    }
    addInCompare(pg:any){

    }
    delete(id:string){
  
      this.httpClient.delete(`http://localhost:8080/pg/${id}`)
      .subscribe((responce) => {
        alert('Delete successful')
        console.log(responce)
        this.getData()
      }
        );
      }
      
}
