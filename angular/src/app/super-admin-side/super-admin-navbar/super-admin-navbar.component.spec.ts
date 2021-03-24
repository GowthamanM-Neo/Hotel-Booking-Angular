import { HttpClientTestingModule } from '@angular/common/http/testing';
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { SuperAdminSideComponent } from '../super-admin-side.component';
import { SuperAdminNavbarComponent } from './super-admin-navbar.component';

describe('SuperAdminNavbarComponent', () => {
  let component: SuperAdminNavbarComponent;
  beforeEach(() => TestBed.configureTestingModule({
    imports: [HttpClientTestingModule], 
    providers: [SuperAdminSideComponent]
  }));
  beforeEach(() => {
    const fixture = TestBed.createComponent(SuperAdminNavbarComponent);
    component = fixture.componentInstance;
  });
  it('test_case16', () => {
    expect(component).toBeTruthy();
  });
});