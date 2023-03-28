import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HomeLogComponent } from './home-log.component';

describe('HomeLogComponent', () => {
  let component: HomeLogComponent;
  let fixture: ComponentFixture<HomeLogComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HomeLogComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HomeLogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
