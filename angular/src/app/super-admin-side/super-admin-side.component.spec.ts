import { ComponentFixture, TestBed } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { SuperAdminSideComponent } from './super-admin-side.component';

describe('SuperAdminSideComponent', () => {
  let component: SuperAdminSideComponent;
  beforeEach(() => {
    const fixture = TestBed.createComponent(SuperAdminSideComponent);
    component = fixture.componentInstance;
  });
  it('test_case4', () => {
    expect(component).toBeTruthy();
  });
});