import { Component, OnInit } from '@angular/core';
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

export class DetalleProfesor implements OnInit{

	profesor:Profesor;


	ngOnInit() : void {
		this.libroService.getLibro().then(libro => this.profesor = libro.autora);
	}


	constructor(private libroService:LibroService){}
}