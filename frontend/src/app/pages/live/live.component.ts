import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ApiCallService } from '../../services/api-call.service';
import { MatchCardComponent } from '../../components/match-card/match-card.component';

@Component({
  selector: 'app-live',
  standalone: true,
  imports: [CommonModule, MatchCardComponent],
  templateUrl: './live.component.html',
  styleUrl: './live.component.css',
})
export class LiveComponent implements OnInit {

  liveMatch: any;
  constructor(private _api: ApiCallService) {}

  ngOnInit(): void {
    this.getLiveMatchData();
  }

  private getLiveMatchData() {
    this._api.getLiveMatches().subscribe({
      next: (data) => {
        this.liveMatch = data;
        // console.log(data);
      },
      error: (err) => {
        console.log(err);
      },
      complete: () => {
        console.log('Request complete for live matches');
      },
    });
  }
}
