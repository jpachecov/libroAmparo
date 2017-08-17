import { Component } from '@angular/core';
import { LibroService } from '../servicios/libros-service';
import { Libro } from '../libro/libro';

@Component({
  selector: 'home-page',
  templateUrl: './home.component.html',
  styleUrls: [
    './home.component.css',
    '../capitulos/contenido-capitulo.component.css',
    '../../font-awesome-4.7.0/css/font-awesome.min.css'
  ],
})
export class HomeComponent {
	libro:Libro;
	constructor(private libroService: LibroService){
		this.libro = this.libroService.getLibroAmparo();
	}
}