import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';
import { Danimals } from '../interfaces/danimals';
import { Rest1 } from '../interfaces/rest1';

@Injectable({
  providedIn: 'root'
})
export class Service1Service {

  url:string="http://localhost:8080/danimalses";

  constructor(private http:HttpClient) { }

  getRest():Observable<Rest1>{
    return this.http.get<Rest1>(this.url);
  }

  postRest(danimals:Danimals):Observable<Danimals>{
    return this.http.post<Danimals>(this.url, danimals)
  }

  putRest(link:string, danimals:Danimals):Observable<Danimals>{
    return this.http.put<Danimals>(link, danimals)
  }
  
  deleteRest(danimals:Danimals):Observable<Danimals>{
    return this.http.delete<Danimals>(danimals._links.self.href)
  } 

}
