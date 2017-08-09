import { Component } from '@angular/core';
import { Capitulo } from './capitulo';

@Component({
	selector: 'contenido-capitulo',
	templateUrl: './contenido-capitulo.component.html',
	styleUrls: ['./contenido-capitulo.component.css']
})

export class ContenidoCapitulo {

	titulo = "Resumen del capítulo";
	capituloSeleccionado:Capitulo;
}
