import { HttpClientTestingModule } from '@angular/common/http/testing';
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { UserNavbarComponent } from './user-navbar.component';

describe('UserNavbarComponent', () => {
  let component: UserNavbarComponent;
  beforeEach(()=>TestBed.configureTestingModule({
    imports:[HttpClientTestingModule],
    providers:[UserNavbarComponent]
  }))
  beforeEach(() => {
    const fixture = TestBed.createComponent(UserNavbarComponent);
    component = fixture.componentInstance;
  });
  it('test_case15', () => {
    expect(component).toBeTruthy();
  });
});