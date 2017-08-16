import { Component } from '@angular/core';
import { Profesor } from './profesor';
import { LibroService } from '../servicios/libros-service';

@Component({
	selector:"detalle-profesora",
	templateUrl: './detalle-profesora.component.html',
	styleUrls: [
		'./detalle-profesora.component.css',
		'../responsive/profesora.responsive.css'
	]	
})

export class DetalleProfesor {

	profesor:Profesor;

	constructor(private libroService:LibroService){
		this.profesor = libroService.getLibroAmparo().autora;
	}
}