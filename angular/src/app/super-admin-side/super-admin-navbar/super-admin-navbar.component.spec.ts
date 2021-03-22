import { ComponentFixture, TestBed } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { SuperAdminNavbarComponent } from './super-admin-navbar.component';

describe('SuperAdminNavbarComponent', () => {
  let component: SuperAdminNavbarComponent;
  beforeEach(() => {
    const fixture = TestBed.createComponent(SuperAdminNavbarComponent);
    component = fixture.componentInstance;
  });
  it('test_case16', () => {
    expect(component).toBeTruthy();
  });
});