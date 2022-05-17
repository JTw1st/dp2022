import { Component } from '@angular/core';
import { Danimals } from 'src/app/interfaces/danimals';
import { Service1Service } from 'src/app/services/service1.service';
@Component({
  selector: 'app-root',
  templateUrl: './component1.component.html',
  styleUrls: ['./component1.component.scss']
})
export class Component1Component {
  title = 'lab1f';
  danimalsList:Danimals[]=[];

  constructor(private service:Service1Service){}

  getDanimals():void{
    this.service.getDanimals().subscribe(
      (danimals)=>{
        this.danimalsList=danimals;
      }
    )
  }
}
