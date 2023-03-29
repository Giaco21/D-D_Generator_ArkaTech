import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailsPgComponent } from './details-pg.component';

describe('DetailsPgComponent', () => {
  let component: DetailsPgComponent;
  let fixture: ComponentFixture<DetailsPgComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DetailsPgComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DetailsPgComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
