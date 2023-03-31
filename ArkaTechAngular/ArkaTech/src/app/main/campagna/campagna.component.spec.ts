import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CampagnaComponent } from './campagna.component';

describe('CampagnaComponent', () => {
  let component: CampagnaComponent;
  let fixture: ComponentFixture<CampagnaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CampagnaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CampagnaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
