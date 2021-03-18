import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Login } from '../models/login';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  apiURL:string;
  constructor(private http: HttpClient) {
    this.apiURL = 'http://localhost:8080';
  }

  public checkUser(data:Login):Observable<Boolean> {
    return this.http.post<Boolean>(this.apiURL+'/user/login', data);
  }

  public checkAdmin(data:Login):Observable<Boolean> {
    return this.http.post<Boolean>(this.apiURL+'/admin/login', data);
  }
}
