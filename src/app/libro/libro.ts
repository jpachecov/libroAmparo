import {Capitulo} from '../capitulos/capitulo';
import {Profesor} from '../profesora/profesor';
export class Libro{
	id:string;
	titulo:string;
	edicion:string;
	capitulos:Capitulo[];
	autora: Profesor;
}