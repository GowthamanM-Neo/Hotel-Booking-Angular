import { Component, OnInit } from '@angular/core';
import { Login } from 'src/app/models/login';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginFlag:any;
  userPassword:any = "";
  userEmail:any="";
  userData:Login = new Login();
  adminEmail:any="";
  adminPassword:any="";
  adminData:Login = new Login();
  constructor(private loginService:LoginService) { }

  ngOnInit(): void {
  }
  userSubmit(){
    this.userData.email = this.userEmail;
    this.userData.password = this.userPassword;
    this.loginService.checkUser(this.userData).subscribe((data)=>{
      this.loginFlag = data;
    });
    // this.loginService.checkUser(this.userData).subscribe();
  }

  adminSubmit(){
    this.adminData.email = this.adminEmail;
    this.adminData.password = this.adminPassword;
    this.loginService.checkAdmin(this.adminData).subscribe((data)=>{
      this.loginFlag = data;
    });
  }
}
