import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-card-campagna',
  templateUrl: './card-campagna.component.html',
  styleUrls: ['./card-campagna.component.scss']
})
export class CardCampagnaComponent {
@Input()campagna :any
}
