import {Libro} from './libro';
import { CAPITULOS_PRACTICAS } from '../capitulos/capitulos_practicas';
import {amparo} from '../profesora/amparo';


export const libroPracticas:Libro = {
	id:"1",
	titulo:"Introducción al desarrollo de programas con Java",
	edicion:"Tercera edición practicas",
	capitulos: CAPITULOS_PRACTICAS,
	autora: amparo
};