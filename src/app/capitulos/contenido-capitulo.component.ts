import { Component, Input, OnInit } from '@angular/core';
import {
  trigger,
  state,
  style,
  animate,
  transition
} from '@angular/animations';

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
	],
	animations:[
    trigger('menuState', [
      state('activo', style({
        transform:'translateX(0)'
      })),
      state('inactivo', style({
        transform:'translateX(-350px)',
        opacity:0,
        display:'none'
      })),
      transition('activo => inactivo', animate('300ms ease-out')),
      transition('inactivo => activo', animate('300ms ease-in'))
    ])
  ]
})

export class ContenidoCapitulo implements OnInit{
	libro:Libro;
	@Input() capituloSel:Capitulo;
	constructor(private libroService:LibroService, private route: ActivatedRoute, private location: Location){}
	ngOnInit(): void {
		
    this.route.paramMap
    .switchMap((params: ParamMap) => (


     this.libroService.getCapitulo(+params.get('id')))

     // this.libroService.getLibro().then(libro => libro.capitulos.find(cap => cap.id == +params.get('id'))



    )
    .subscribe(cap => this.capituloSel = cap);
    this.libroService.getLibro().then(libro => this.libro = libro);
	}
}
