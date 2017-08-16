import { Component } from '@angular/core';
import { Capitulo } from './capitulos/capitulo';
import { Libro } from './libro/libro';
import { LibroService } from './servicios/libros-service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: [
    './app.component.css',
    'responsive/menu.responsive.css',
    'responsive/footer.responsive.css',
    '../font-awesome-4.7.0/css/font-awesome.min.css'
  ]
})
export class AppComponent {

  libro: Libro;
  capituloSel : Capitulo;

  onSelect(capitulo : Capitulo) : void {
      this.capituloSel = capitulo;
  }

  constructor(private libroService:LibroService){
    this.libro = this.libroService.getLibroAmparo();
  }
}
