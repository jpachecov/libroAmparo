import { Injectable } from '@angular/core';
import { Libro } from '../libro/libro';
import { Capitulo} from '../capitulos/capitulo';
import { libroAmparo } from '../libro/libro-amparo';
import { libroPracticas } from '../libro/libro-practicas';


@Injectable()
export class LibroService {
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

	getLibroPracticas(): Libro {
		return libroAmparo;
	}

}