import { Component } from '@angular/core';

import {
  trigger,
  state,
  style,
  animate,
  transition
} from '@angular/animations';


import { Capitulo } from './capitulos/capitulo';
import { Libro } from './libro/libro';
import { LibroService } from './servicios/libros-service';
import { Router } from '@angular/router';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: [
    './app.component.css',
    'responsive/menu.responsive.css',
    'responsive/footer.responsive.css',
    '../font-awesome-4.7.0/css/font-awesome.min.css'
  ],
  animations:[
    trigger('menuState', [
      state('activo', style({
        transform:'translateX(0)'
      })),
      state('inactivo', style({
        transform:'translateX(-350px)',
        opacity:0,
        display:'none'
      })),
      transition('activo => inactivo', animate('300ms ease-out')),
      transition('inactivo => activo', animate('300ms ease-in'))
    ])
  ]
})
export class AppComponent {

  libro: Libro;
  capituloSel : Capitulo;

  menuState:string = "activo";
  onSelect(capitulo : Capitulo) : void {
      this.capituloSel = capitulo;
      this.router.navigate(['/capitulo', this.capituloSel.id]);
  }

  mueveMenu(): void {
    if(this.menuState == "activo"){
      this.menuState = "inactivo";
    } else {
      this.menuState = "activo";
    }
  }
  constructor(private libroService:LibroService, private router: Router){
    this.libro = this.libroService.getLibroAmparo();
  }
}
