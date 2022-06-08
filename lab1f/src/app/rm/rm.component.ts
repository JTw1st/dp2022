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


  ngOnInit(): void {
    this.getRest();
  }

  getRest():void{
    this.service.getRest().subscribe(
      (rest1)=>{
        this.danimalsList=rest1._embedded.danimalses;
      }
    )
  }
  
  removeRest(danimals:Danimals){
    this.service.deleteRest(danimals).subscribe(
      ()=>{
        this.getRest();
      }
    )
  }

}
