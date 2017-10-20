import { Injectable } from '@angular/core';
import { Libro } from '../libro/libro';
import { Capitulo} from '../capitulos/capitulo';
import { libroAmparo } from '../libro/libro-amparo';
import { libroPracticas } from '../libro/libro-practicas';

import { Http, RequestOptionsArgs }    from '@angular/http';
import { environment } from '../../environments/environment';


  
import 'rxjs/add/operator/toPromise';


@Injectable()
export class LibroService {

	private api_url = "";

	constructor(private http: Http){
		console.log( environment );
		this.api_url = environment.apiUrl;
	}

	getLibroAmparo(tipo:String): Libro {
		var libro:Libro = libroAmparo;
		if(tipo == "practicas") {
			libro = libroPracticas;
		}



		return libro;
	}
	getCapitulos():Promise<Capitulo[]>{
		return this.getLibro().then(l => l.capitulos);
	}
	getCapitulo(id:number): Promise<Capitulo> {
		return this.getCapitulos().then(caps => caps.find(cap => cap.id === id));
	
	}

	getLibro(): Promise<Libro>{

		return Promise.resolve(libroAmparo);
/*
	  return this.http.get(this.api_url + "/libro")
         .toPromise()
         .then(response => response.json().data as Libro)
         .catch(this.handleErrorBook);
*/
	}

	private handleErrorBook(error: any): Promise<any> {
	  console.error('Ocurrio un error al obtener datos del libro', error);
	  return Promise.reject(error.message || error);
	}
}