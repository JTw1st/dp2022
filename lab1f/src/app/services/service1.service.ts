import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';
import { Danimals } from '../interfaces/danimals';

@Injectable({
  providedIn: 'root'
})
export class Service1Service {

  list = new BehaviorSubject<Danimals[]>([]);
  url:string="http://localhost:8080/lab1/servlet1";

  constructor(private http:HttpClient) { }

  getDanimals():Observable<Danimals[]>{
    return this.http.get<Danimals[]>(this.url)
  }
  postDanimals(danimals:Danimals):Observable<Danimals[]>{
    return this.http.post<Danimals[]>(this.url, danimals)
  }
  putDanimals(danimals:Danimals):Observable<Danimals[]>{
    return this.http.put<Danimals[]>(this.url+"/"+danimals.id, danimals)
  }
  deleteDanimals(danimals:Danimals):Observable<Danimals[]>{
    return this.http.delete<Danimals[]>(this.url+"/"+danimals.id)
  }
  setList(list:Danimals[]){
    this.list.next(list);
  }
}
