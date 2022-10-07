import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CoordinatordashboardComponent } from './coordinatordashboard.component';

describe('CoordinatordashboardComponent', () => {
  let component: CoordinatordashboardComponent;
  let fixture: ComponentFixture<CoordinatordashboardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CoordinatordashboardComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CoordinatordashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
