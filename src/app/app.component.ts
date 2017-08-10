import { Component } from '@angular/core';
import { Capitulo } from './capitulos/capitulo';
import { CAPITULOS } from './capitulos/capitulos';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  titulo = 'Capítulos';
  capitulos = CAPITULOS;
  capituloSel : Capitulo;

  onSelect(capitulo : Capitulo) : void {
    	console.log("Capitulo Seleccionado");
      this.capituloSel = capitulo;
  }
}
