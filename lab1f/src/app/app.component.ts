import { Component } from '@angular/core';
import { Danimals } from './interfaces/danimals';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'lab1f';
  danimalsList:Danimals[]=[];
}