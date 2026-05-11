import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  private baseUrl = "http://localhost:8080/api";

  constructor(private http: HttpClient) { }

  getClients() {
    return this.http.get(this.baseUrl + "/clients");
  }

  addClient(client: any) {
    return this.http.post(this.baseUrl + "/clients", client);
  }

  getContrats() {
    return this.http.get(this.baseUrl + "/contrats");
  }

  getPaiements() {
    return this.http.get(this.baseUrl + "/paiements");
  }
}
