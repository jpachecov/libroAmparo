import { Capitulo } from './capitulo';
export const CAPITULOS: Capitulo[] = [

	{	id: 1, nombre: 'Proceso de programación',
		resumen: 'En este capítulo se detalla cada una de las actividades necesarias para escribir programas que funcionen adecuadamente como solución a un problema particular. Estas actividades incluyen la definición del problema, el diseño de la solución, así como la codificación, la depuración, las pruebas, la validación, la documentación y el mantenimiento de la solución.', 
		listaArchivos: ['Main.java']
	},
	{	id: 2, nombre: 'Creación  y uso de datos primitivos.',
		resumen: 'En este capítulo se describe la forma de crear y utilizar datos de los tipos predefinidos por Java, primitivos, en expresiones que devuelven un valor. Se describe la forma en que Java evalúa las expresiones de acuerdo con la prioridad y reglas de asociación de los operadores involucrados, así como la forma de trabajar con expresiones que contengan elementos de diferente tipo.', 
		listaArchivos: ['Main.java']
	}

];
export var capituloSeleccionado:Capitulo;