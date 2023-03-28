import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ArchivioComponent } from './archivio.component';

describe('ArchivioComponent', () => {
  let component: ArchivioComponent;
  let fixture: ComponentFixture<ArchivioComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ArchivioComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ArchivioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
