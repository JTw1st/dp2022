import { Component, OnInit } from '@angular/core';
import { Danimals } from 'src/app/interfaces/danimals';
import { Service1Service } from 'src/app/services/service1.service';

@Component({
  selector: 'app-root',
  templateUrl: './component1.component.html',
  styleUrls: ['./component1.component.scss']
})
export class Component1Component implements OnInit {

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

    this.getDanimals;

    let add = document.getElementsByClassName("addbtn");
    let addform = document.getElementById("add-hidden");
    let rm = document.getElementsByClassName("rmbtn");
    let rmform = document.getElementById("rm-hidden");

    add[0].addEventListener("click", () => {
      if(addform!.style.display == "block"){
        addform!.style.display = "none";
      }
      else{
        addform!.style.display = "block";
      }
    });
      
    rm[0].addEventListener("click", () => {
      if(rmform!.style.display == "block"){
        rmform!.style.display = "none";
      }
      else{
        rmform!.style.display = "block";
      }
    });
  }

}