import { Component, OnInit, Input, Output } from '@angular/core';
import { Danimals } from '../interfaces/danimals';
import { Service1Service } from '../services/service1.service';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.scss']
})
export class AddComponent implements OnInit {

  danimalsList:Danimals[]=[];

  constructor(private service:Service1Service) { }


  ngOnInit(): void {

  }

  getDanimals():void{
    this.service.getDanimals().subscribe(
      (danimals)=>{
        this.danimalsList=danimals;
        this.service.setList(danimals);
      }
    )
  }

  addDanimals(danimals:Danimals){
    this.service.postDanimals(danimals).subscribe(
      ()=>{
        this.getDanimals();
      }
    )
  }

}
