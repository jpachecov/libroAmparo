import { Injectable } from '@angular/core';
import {Libro} from '../libro/libro';
import {libroAmparo} from '../libro/libro-amparo';


@Injectable()
export class LibroService {
	getLibroAmparo(): Libro {
		return libroAmparo;
	}
}