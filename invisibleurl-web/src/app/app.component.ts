import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { DashboardService } from './dashboard/dashboard.service';
import { ShortUrl } from './dashboard/short-url';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, CommonModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'invisibleurl-web';

  shortUrls: ShortUrl[] = [];

  constructor (private dashboardService: DashboardService) {}

  ngOnInit() {
    this.loadShortUrls();
  }

  loadShortUrls() {
    this.dashboardService.getShortUrls().subscribe(
      {
        
        next: (data: ShortUrl[]) => {
          this.shortUrls= data;
          console.info('got dashboard items');
          console.table(this.shortUrls);
        },
        error: (error) => { console.error('Error loading dashboard: ', error); }
      }
    );
  }
}
