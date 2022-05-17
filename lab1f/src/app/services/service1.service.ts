import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Danimals } from '../interfaces/danimals';

@Injectable({
  providedIn: 'root'
})
export class Service1Service {
url:string="http://localhost:8080/lab1/servlet1"

  constructor(private http:HttpClient) { }

  getDanimals():Observable<Danimals[]>{
    return this.http.get<Danimals[]>(this.url);
  }

}
