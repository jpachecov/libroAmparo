import { Component } from '@angular/core';
import { Capitulo } from './capitulo';
import { CAPITULOS } from './capitulos';

@Component({
  selector: 'menu-capitulos',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})

export class MenuCapitulosComponent {
	titulo = 'Capítulos';
  	capitulos = CAPITULOS;

	  capituloSeleccionado : Capitulo;


}
