import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-detail',
  templateUrl: './detail.component.html',
  styleUrls: ['./detail.component.scss']
})
export class DetailComponent {
  name:any
  user:any = JSON.parse( localStorage.getItem("User")||"");
  arrayCampagne:any[] = JSON.parse( localStorage.getItem("arrayCampagne")||"[]");
  campagna:any = []
  async ngOnInit() {
    this.route.params.subscribe((params:any) => {
      this.name = params["name"]
      console.log(params["name"]) ;
    });
    this.campagna = this.arrayCampagne.filter((obj:any)=>obj.master==this.user.username && obj.name==this.name)[0]
  console.log(this.campagna)
  }
  constructor(private route: ActivatedRoute,private http:HttpClient) {
  
  }
}
