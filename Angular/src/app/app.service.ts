import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AppService {

  private baseUrlIdeas = 'http://localhost:8080/ideas';

  constructor(private http: HttpClient) {}

  getIdeasList(): Observable<any> {
    return this.http.get('http://localhost:8080/ideas/getideas');
  }
}
