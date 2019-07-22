import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { HttpHeaders } from '@angular/common/http';
import 'rxjs/add/operator/map';
import { BehaviorSubject } from 'rxjs/BehaviorSubject';


@Injectable()
export class AuthenticationService {

  isLoggedIn: Boolean = false;
  isLoggedInSubject: BehaviorSubject<Boolean>;
  constructor(private httpclient: HttpClient) {
    this.isLoggedInSubject = new BehaviorSubject(this.isLoggedIn);
  }

  authenticateUser(data) {
    return this.httpclient.post('http://localhost:8089/api/v1/auth/login', data);
  }

  registerUser(data) {
    return this.httpclient.post('http://localhost:8089/api/v1/auth/register', data);
  }

  setBearerToken(token) {
    localStorage.setItem('bearerToken', token);
  }

  getBearerToken() {
    return localStorage.getItem('bearerToken');
  }

  setUserId(userId) {
    localStorage.setItem('userId', userId);
  }

  getUserId() {
    return localStorage.getItem('userId');
  }

  isUserAuthenticated(token): Promise<boolean> {
    if (null != token) {

      const obs: Observable<any> = this.httpclient.post('http://localhost:8089/api/v1/auth/authenticate', {}, {
        headers: new HttpHeaders().set('Authorization', `Bearer ${token}`)
      });
      return obs.map(response => {
        console.log('inside Auth Service', response);
        this.isLoggedIn = response['isAuthenticated'];
        this.isLoggedInSubject.next(this.isLoggedIn);
        return response['isAuthenticated'];
      }).toPromise();
    }
  }

  logout() {
    localStorage.removeItem('bearerToken');
    localStorage.removeItem('userId');
    this.isLoggedInSubject.next(false);
  }

  isUserLoggedIn() {
    return this.isLoggedInSubject;
  }

}
