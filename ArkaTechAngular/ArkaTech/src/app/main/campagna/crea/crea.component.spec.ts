import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreaComponent } from './crea.component';

describe('CreaComponent', () => {
  let component: CreaComponent;
  let fixture: ComponentFixture<CreaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CreaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
