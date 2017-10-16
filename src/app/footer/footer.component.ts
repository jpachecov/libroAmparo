import { Component } from '@angular/core';
import { Profesor } from '../profesora/profesor';
import { LibroService } from '../servicios/libros-service';


@Component({
	selector:"footer-profa",
	templateUrl: './footer.component.html',
	styleUrls: [
		'./footer.component.css',
		'../responsive/footer.responsive.css',
		'../../font-awesome-4.7.0/css/font-awesome.min.css'
	]	
})

export class Footer {
	profesor: Profesor;
	constructor(private libroService:LibroService){
		this.profesor = libroService.getLibroAmparo().autora;
	}
}