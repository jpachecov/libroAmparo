import { Component, OnInit } from '@angular/core';
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

export class Footer implements OnInit{

	profesor: Profesor;
	
	ngOnInit(): void {
		
	}

	constructor(private libroService:LibroService){
		//this.libroService.getLibro().then(libro => this.profesor = libro.autora);
		this.profesor = this.libroService.getLibroAmparo("").autora;

	}
}