import { TestBed } from '@angular/core/testing';

import { CoordinatordashboardService } from './coordinatordashboard.service';

describe('CoordinatordashboardService', () => {
  let service: CoordinatordashboardService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CoordinatordashboardService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
