import {Component} from '@angular/core';
import {Profesor} from './profesor';
import {amparo} from './amparo';

@Component({
	selector:"detalle-profesora",
	templateUrl: './detalle-profesora.component.html',
	styleUrls: ['./detalle-profesora.component.css']	
})

export class DetalleProfesor {
	profesor = amparo;
}