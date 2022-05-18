import { Component, OnInit, Input, Output } from '@angular/core';
import { Danimals } from '../interfaces/danimals';
import { Service1Service } from '../services/service1.service';

@Component({
  selector: 'app-rm',
  templateUrl: './rm.component.html',
  styleUrls: ['./rm.component.scss']
})
export class RmComponent implements OnInit {


  danimalsList:Danimals[]=[];
  constructor(private service:Service1Service) { }



  getDanimals():void{
    this.service.getDanimals().subscribe(
      (danimals)=>{
        this.danimalsList=danimals;
        this.service.setList(danimals);
      }
    )
  }
  


  ngOnInit(): void {
    this.getDanimals();
  }
  
  removeDanimals(danimals:Danimals){
    this.service.deleteDanimals(danimals).subscribe(
      ()=>{
        this.getDanimals();
      }
    )
  }
  

}
