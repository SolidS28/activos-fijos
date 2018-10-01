import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Observable} from 'rxjs';
import { Activo } from './activo';

@Injectable({
  providedIn: 'root'
})
export class ActivosService {

  private activosURL = 'http://localhost:8080/activo/all';  // URL to web api

  constructor(private http: HttpClient) { }

  getActivos(): Observable<Activo[]> {
    console.log("Entra al servicio");
    return this.http.get<Activo[]>(this.activosURL);
  }
}
