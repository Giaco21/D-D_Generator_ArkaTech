import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CardPgComponent } from './card-pg.component';

describe('CardPgComponent', () => {
  let component: CardPgComponent;
  let fixture: ComponentFixture<CardPgComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CardPgComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CardPgComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
