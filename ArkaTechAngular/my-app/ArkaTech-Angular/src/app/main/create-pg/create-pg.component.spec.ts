import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreatePgComponent } from './create-pg.component';

describe('CreatePgComponent', () => {
  let component: CreatePgComponent;
  let fixture: ComponentFixture<CreatePgComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreatePgComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CreatePgComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
