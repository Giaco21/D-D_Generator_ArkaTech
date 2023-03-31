import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CardCampagnaComponent } from './card-campagna.component';

describe('CardCampagnaComponent', () => {
  let component: CardCampagnaComponent;
  let fixture: ComponentFixture<CardCampagnaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CardCampagnaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CardCampagnaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
