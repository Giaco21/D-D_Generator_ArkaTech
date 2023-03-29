import { HttpClient } from '@angular/common/http';
import { Component, Input} from '@angular/core';

@Component({
  selector: 'app-card-pg',
  templateUrl: './card-pg.component.html',
  styleUrls: ['./card-pg.component.scss']
})
export class CardPgComponent {
  @Input() pg:any;
 
  ngOnInit(){}
  constructor(private http:HttpClient){}
  delete(id:string){
  
  this.http.delete(`http://localhost:8080/pg/${id}`)
  .subscribe((responce) => {
    alert('Delete successful')
    console.log(responce)
    location.href="http://localhost:4200/archivio"
  }
    );
  }
  arrayCompare:any = []

  
  addInCompare(pg:any){
    this.arrayCompare.push(pg)
    console.log(this.arrayCompare)
  }
}
