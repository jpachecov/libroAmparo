import {Libro} from './libro';
import { CAPITULOS } from '../capitulos/capitulos';
import {amparo} from '../profesora/amparo';


export const libroAmparo:Libro = {
	id:"1",
	titulo:"Introducción al desarrollo de programas con Java",
	edicion:"Tercera edición",
	capitulos: CAPITULOS,
	autora: amparo
};