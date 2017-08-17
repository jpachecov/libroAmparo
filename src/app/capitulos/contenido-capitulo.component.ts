import { Component, Input, OnInit } from '@angular/core';
import { Capitulo } from './capitulo';
import { LibroService } from '../servicios/libros-service';
import { Libro } from '../libro/libro';
import { Http, Response, RequestOptions, ResponseContentType } from '@angular/http';
import { ActivatedRoute, ParamMap } from '@angular/router';
import { Location }                 from '@angular/common';
import 'rxjs/add/operator/switchMap';

@Component({
	selector: 'contenido-capitulo',
	templateUrl: './contenido-capitulo.component.html',
	styleUrls: [
		'./contenido-capitulo.component.css',
		'../responsive/capitulos.responsive.css',
		'../../font-awesome-4.7.0/css/font-awesome.min.css'
	]
})

export class ContenidoCapitulo implements OnInit{
	libro:Libro;
	@Input() capituloSel:Capitulo;
	constructor(private libroService:LibroService, private route: ActivatedRoute, private location: Location){
		this.libro = this.libroService.getLibroAmparo();
	}
	ngOnInit(): void {
		  this.route.paramMap
    .switchMap((params: ParamMap) => this.libroService.getCapitulo(+params.get('id')))
    .subscribe(hero => this.capituloSel = hero);
	}
}
