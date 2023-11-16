import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from '../../environments/environment.development';

@Injectable({
  providedIn: 'root'
})
export class ApiCallService {

  constructor(private _http: HttpClient) { }

  getAllMatches() {
    return this._http.get(`${environment.apiUrl}/all-matches`);
  }

  getLiveMatches() {
    return this._http.get(`${environment.apiUrl}/live-matches`)
  }

  getPointTable() {
    return this._http.get(`${environment.apiUrl}/point-table`)
  }

}
