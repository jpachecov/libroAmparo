import { Component, Input } from '@angular/core';
import { Capitulo } from './capitulo';
import { LibroService } from '../servicios/libros-service';
import { Libro } from '../libro/libro';
import { Http, Response, RequestOptions, ResponseContentType } from '@angular/http';

@Component({
	selector: 'contenido-capitulo',
	templateUrl: './contenido-capitulo.component.html',
	styleUrls: [
		'./contenido-capitulo.component.css',
		'../responsive/capitulos.responsive.css',
		'../../font-awesome-4.7.0/css/font-awesome.min.css'
	]
})

export class ContenidoCapitulo {
	libro:Libro;
	@Input() capituloSel:Capitulo;
	constructor(private libroService:LibroService){
		this.libro = this.libroService.getLibroAmparo();
	}

}
