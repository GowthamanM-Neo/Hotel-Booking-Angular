import { Injectable } from '@angular/core';
import { LoginService } from './login.service';

@Injectable({
  providedIn: 'root'
})
export class SignupService {
  apiURL:string;
  constructor(loginService:LoginService) { 
    this.apiURL = loginService.apiURL;
  }
}
