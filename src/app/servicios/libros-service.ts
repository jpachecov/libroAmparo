import { Injectable } from '@angular/core';
import { Libro } from '../libro/libro';
import { Capitulo} from '../capitulos/capitulo';
import { libroAmparo } from '../libro/libro-amparo';


@Injectable()
export class LibroService {
	getLibroAmparo(): Libro {
		return libroAmparo;
	}
	getCapitulos():Promise<Capitulo[]>{
		return Promise.resolve(libroAmparo.capitulos);
	}
	getCapitulo(id:number): Promise<Capitulo> {
		return this.getCapitulos().then(caps => caps.find(cap => cap.id === id));
	
	}

}