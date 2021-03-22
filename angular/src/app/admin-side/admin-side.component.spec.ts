import { ComponentFixture, TestBed } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { AdminSideComponent } from './admin-side.component';

describe('AdminSideComponent', () => {
  let component: AdminSideComponent;
  beforeEach(() => {
    const fixture = TestBed.createComponent(AdminSideComponent);
    component = fixture.componentInstance;
  });
  it('test_case2', () => {
    expect(component).toBeTruthy();
  });
});