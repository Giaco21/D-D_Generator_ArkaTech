import { TestBed } from '@angular/core/testing';

import { PgServiceService } from './pg-service.service';

describe('PgServiceService', () => {
  let service: PgServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PgServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
