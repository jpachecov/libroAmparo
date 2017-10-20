import { Component, OnInit } from '@angular/core';
import { LibroService } from '../servicios/libros-service';
import { Libro } from '../libro/libro';

@Component({
  selector: 'home-page',
  templateUrl: './home.component.html',
  styleUrls: [
    './home.component.css',
    '../responsive/home.responsive.css',
    '../capitulos/contenido-capitulo.component.css',
    '../../font-awesome-4.7.0/css/font-awesome.min.css'
  ],
})
export class HomeComponent implements OnInit{
	libro:Libro;

  ngOnInit():void {
    //this.libroService.getLibro().then(libro => this.libro = libro);
    this.libro = this.libroService.getLibroAmparo("");
  }

	constructor(private libroService: LibroService){}
}