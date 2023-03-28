import { Component, Input} from '@angular/core';

@Component({
  selector: 'app-card-pg',
  templateUrl: './card-pg.component.html',
  styleUrls: ['./card-pg.component.scss']
})
export class CardPgComponent {
  @Input() pg:any;
  arrayPg: any;
  ngOnInit(){}

  delete(id:string){
  //   fetch(`http://localhost:8080/pg/${id}`, 
  //   {  method: "DELETE"})
  //   .then(response => {
  //       console.log(response.status); 
  //       window.location.href="http://localhost:4200/archivio"
  //     }).catch(error=>(console.log(error)));   
      this.arrayPg =  JSON.parse(localStorage.getItem("arrayPg") || "[]");
      this.arrayPg= this.arrayPg.filter((ele:any)=>ele.id!=this.pg.id)
      localStorage.setItem("arrayPg", JSON.stringify(this.arrayPg));
      console.log(this.arrayPg)
      location.href="http://localhost:4200/archivio"
  }
  arrayCompare:any = []

  
  addInCompare(pg:any){
    this.arrayCompare.push(pg)
    console.log(this.arrayCompare)
  }
}
