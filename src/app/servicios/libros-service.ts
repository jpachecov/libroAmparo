import { Injectable } from '@angular/core';
import { Libro } from '../libro/libro';
import { Capitulo} from '../capitulos/capitulo';
import { libroAmparo } from '../libro/libro-amparo';
import { libroPracticas } from '../libro/libro-practicas';

import { Http, RequestOptionsArgs }    from '@angular/http';


  
import 'rxjs/add/operator/toPromise';


@Injectable()
export class LibroService {

	constructor(private http: Http){}

	getLibroAmparo(tipo:String): Libro {
		var libro:Libro = libroAmparo;
		if(tipo == "practicas") {
			libro = libroPracticas;
		}



		return libro;
	}
	getCapitulos():Promise<Capitulo[]>{
		return Promise.resolve(libroAmparo.capitulos);
	}
	getCapitulo(id:number): Promise<Capitulo> {
		return this.getCapitulos().then(caps => caps.find(cap => cap.id === id));
	
	}

	getLibro(): Promise<Libro>{

	  return this.http.get("https://polar-river-16969.herokuapp.com/api/libro")
         .toPromise()
//         .then(response => response.json().data as Libro)
         .then(response => {console.log(response)})         
         .catch(this.handleErrorBook);
	}

	private handleErrorBook(error: any): Promise<any> {
	  console.error('Ocurrio un error al obtener datos del libro', error);
	  return Promise.reject(error.message || error);
	}
}