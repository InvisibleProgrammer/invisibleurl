import {Component, OnInit } from '@angular/core';
import {CommonModule } from "@angular/common";
import {RouterOutlet} from '@angular/router';
import {DashboardItem} from "./dashboard/dashboard-item";
import {DashboardService} from "./dashboard/dashboard.service";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, CommonModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'invisbleurl-web';

  dashboardItems: DashboardItem[] = [];

  constructor(private dashboardService: DashboardService) {
  }

  ngOnInit(): void {
    this.dashboardService.getDashboard().subscribe(
      data => {
        this.dashboardItems = data;
      }
    );
  }
}
