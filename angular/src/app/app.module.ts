import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './auth/login/login.component';
import { SignupComponent } from './auth/signup/signup.component';
import { AdminSideComponent } from './admin-side/admin-side.component';
import { UserSideComponent } from './user-side/user-side.component';
import { SuperAdminSideComponent } from './super-admin-side/super-admin-side.component';
import { AdminNavbarComponent } from './admin-side/admin-navbar/admin-navbar.component';
import { UserNavbarComponent } from './user-side/user-navbar/user-navbar.component';
import { SuperAdminNavbarComponent } from './super-admin-side/super-admin-navbar/super-admin-navbar.component';
import { AdminDashboardComponent } from './admin-side/admin-dashboard/admin-dashboard.component';
import { AdminProfileComponent } from './admin-side/admin-profile/admin-profile.component';
import { UserDashboardComponent } from './user-side/user-dashboard/user-dashboard.component';
import { UserProfileComponent } from './user-side/user-profile/user-profile.component';
import { SuperAdminDashboardComponent } from './super-admin-side/super-admin-dashboard/super-admin-dashboard.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SignupComponent,
    AdminSideComponent,
    UserSideComponent,
    SuperAdminSideComponent,
    AdminNavbarComponent,
    UserNavbarComponent,
    SuperAdminNavbarComponent,
    AdminDashboardComponent,
    AdminProfileComponent,
    UserDashboardComponent,
    UserProfileComponent,
    SuperAdminDashboardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
