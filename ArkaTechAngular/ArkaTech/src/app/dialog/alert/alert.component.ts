import { Component , Output, EventEmitter} from '@angular/core';
import {
  trigger,
  state,
  style,
  animate,
  transition,
  // ...
} from '@angular/animations';
@Component({
  selector: 'app-alert',
  templateUrl: './alert.component.html',
  animations: [
    trigger('openClose', [
      // ...
      state('open', style({
      
       color:'black',
        position:'absolute',
        backgroundColor: 'yellow',
        opacity: 1,
        height: '200px',
        width:'200px',
        top:'50px',
        left:'50px',
      })),
      state('closed', style({
       
        position:'absolute',
        
        top:'0px',
        left:'0px',
        height: '0px',
        width:'0px',
        backgroundColor: 'blue',
        opacity: 0.8,
      })),
      transition('open => closed', [
        animate('0.5s')
      ]),
      transition('closed => open', [
        animate('0.5s')
      ]),
    ]),
  ],
  styleUrls: ['./alert.component.scss']
})
export class AlertComponent {
  @Output() flag = new EventEmitter<boolean>();
 
  isOpen = false;
  
  toggle() {
    this.isOpen = !this.isOpen;
  }
  choise(flag:boolean) {
    this.flag.emit(flag);
    console.log(flag)
    this.toggle()
}
}
