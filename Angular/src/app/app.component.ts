import {Component, OnInit} from '@angular/core';
import {Observable} from 'rxjs';
import { AppService } from '../app/app.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'fingesoAngular';

  ideas: Observable<any>;

  constructor(private appService: AppService) { }

  ngOnInit() {
    this.getIdeas();
  }

  getIdeas(): void {
    this.appService.getIdeasList().subscribe(
      data => this.ideas = data);
  }

}

