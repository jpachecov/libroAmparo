import { Component, Input } from '@angular/core';
import { Capitulo } from './capitulo';
import {Http, Response, RequestOptions, ResponseContentType} from '@angular/http';

@Component({
	selector: 'contenido-capitulo',
	templateUrl: './contenido-capitulo.component.html',
	styleUrls: ['./contenido-capitulo.component.css']
})

export class ContenidoCapitulo {
	tituloLibro = "Introducción al desarrollo de programas con Java";
	edicion = "Tercera edición";
	titulo = "Resumen del capítulo";
	@Input() capituloSel:Capitulo;
}
