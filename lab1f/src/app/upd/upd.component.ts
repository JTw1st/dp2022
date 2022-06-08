import { Component, OnInit, Input, Output } from '@angular/core';
import { Danimals } from '../interfaces/danimals';
import { Service1Service } from '../services/service1.service';


@Component({
  selector: 'app-upd',
  templateUrl: './upd.component.html',
  styleUrls: ['./upd.component.scss']
})
export class UpdComponent implements OnInit {

  
  danimalsList:Danimals[]=[];
  selectedItem?:Danimals;
  constructor(private service:Service1Service) { }



  getRest():void{
    this.service.getRest().subscribe(
      (rest1)=>{
        this.danimalsList=rest1._embedded.danimalses;
      }
    )
  }
  
  onSelect(danimals:Danimals){
    this.selectedItem=danimals;
  }


  ngOnInit(): void {
    this.getRest();
  }
  
  updateRest(danimals:Danimals){
    this.service.putRest(this.selectedItem!._links.self.href, danimals).subscribe(
      ()=>{
        this.getRest();
      }
    )
  }
  

}
