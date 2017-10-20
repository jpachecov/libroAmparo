import { Capitulo } from './capitulo';
import { DetalleArchivo } from './DetalleArchivo';
export const CAPITULOS_PRACTICAS: Capitulo[] = [

	
	{	id: 1, nombre: 'Envío de mensajes al usuario',
		resumen: 'En este capítulo se presenta una práctica para que el alumno tenga un primer contacto con Java, que conozca la estructura de los programas en Java, aprenda a compilar programas, corregir errores y ejecutar programas a la vez que se ejercita en el uso de las instrucciones proporcionadas para mostrar mensajes al usuario en la pantalla de la computadora. ', 
		listaArchivos: null	
	},
	{	id: 2, nombre: 'Elementos de Java',
		resumen: 'En este capítulo se incluyen prácticas para que el alumno trabaje con variables para almacenar sus datos, siendo éstas para tipos primitivos. Con estas prácticas también se podrá ejercitarse en distinguir las palabras reservadas de las qe no lo son, así como en declarar variables y hacer operaciones con ellas. ', 
		listaArchivos: null
	},
	{	id: 3, nombre: 'La clase String',
		resumen: 'En este capítulo se tiene un conjunto de prácticas para que el alumno se familiare con la creación y uso de clases existentes a través del uso de los métodos incluídos en ella. Las prácticas consistenen desarrolar programas sencillos que utilicen objetos de las clase Scanner y String proporcionadas por Java.', 
		listaArchivos: [
			{
				nombre:'Felicitación',
				descripcion:'',
				ruta:'Felicitacion.java',
				tipo:'java'
			},
			{
				nombre:'Felicitación en 2 líneas',
				descripcion:'',
				ruta:'FelicitacionEn2Lineas.java',
				tipo:'java'
			},
			{
				nombre:'Felicitación personalizada',
				descripcion:'',
				ruta:'FelicitacionPersonalizada.java',
				tipo:'java'
			},
			{
				nombre:'Convertidor de nombres',
				descripcion:'',
				ruta:'ConvertidorNombres.java',
				tipo:'java'
			},
			{
				nombre:'Volados',
				descripcion:'',
				ruta:'Volados.java',
				tipo:'java'
			},
			{
				nombre:'Mayor valor',
				descripcion:'',
				ruta:'MayorValor.java',
				tipo:'java'
			},
			{
				nombre:'Moneda',
				descripcion:'',
				ruta:'Moneda.class',
				tipo:'class'
			},
			{
				nombre:'Dado',
				descripcion:'',
				ruta:'Dado.class',
				tipo:'class'
			}
		]
	},
	{	id: 4, nombre: 'Creación y uso de objetos',
		resumen: 'En este capítulo se presentan prácticas para que el alumno refuerce sus conocimientos acerca de la creación y manipulación de objetos en Java y del uso de la instrucción condicional if. Las prácticas contenidas en este capítulo consisten en desarrollar programas utilizando clases previamente definidas y proporcinadas para este fin. A partir de este capítulo se hará hincapié en la importancia que tiene la documentación de un programa. El alumno deberá docuentar su programa utilizando las etiquetas requeridas por el programa javadoc. ', 
		listaArchivos: [
			{
				nombre:'Punto',
				descripcion:'',
				ruta:'Punto.java',
				tipo:'java'
			},
			{
				nombre:'Documentación de la clase Punto',
				descripcion:'',
				ruta:'javadoc.zip',
				tipo:'html'
			},
			{
				nombre:'Prueba de la clase Punto',
				descripcion:'',
				ruta:'PruebaPunto.java',
				tipo:'java'
			},
			{
				nombre:'Prueba de la clase Punto completa',
				descripcion:'',
				ruta:'PruebaPuntoV2.java',
				tipo:'java'
			},
			{
				nombre:'Diferencia entre referencia y objeto',
				descripcion:'',
				ruta:'Diferencia.java',
				tipo:'java'
			},
			{
				nombre:'Diferencia entre referencia y objeto (versión 2)',
				descripcion:'',
				ruta:'DiferenciaV2.java',
				tipo:'java'
			},
			{
				nombre:'Hora',
				descripcion:'',
				ruta:'Hora.java',
				tipo:'java'
			},
			{
				nombre:'Documentación de la clase Hora',
				descripcion:'',
				ruta:'javadoc.zip',
				tipo:'html'
			}	
		]
	},
	{	id: 5, nombre: 'Creación y uso de clases',
		resumen: 'Este capítulo contiene un conjunto de prácticas para que el alumno se ejercite en la creación y elaboración de clases que le ayuden a resolver diversos problemas. Algunas de las clases desarrolladas pueden verse como una extensión a los tipos de datos proporcionados por Java. Se hace énfasis en la división del trabajo en métodos, incluyendo dos que son buena práctica de programación: equals y toString. También se insiste en la documentación y pruebas de las clases desarrolladas.', 
		listaArchivos: [
			{
				nombre:'Línea',
				descripcion:'',
				ruta:'Linea.java',
				tipo:'java'
			},
			{
				nombre:'Boleto',
				descripcion:'',
				ruta:'Boleto.java',
				tipo:'java'
			},
			{
				nombre:'Cajero',
				descripcion:'',
				ruta:'Cajero.java',
				tipo:'java'
			},
			{
				nombre:'Caja',
				descripcion:'',
				ruta:'Caja.java',
				tipo:'java'
			},
			{
				nombre:'Máquina de boletos',
				descripcion:'',
				ruta:'MaquinaBoletos.java',
				tipo:'java'
			},
			{
				nombre:'Expendedora',
				descripcion:'',
				ruta:'Expendedora.java',
				tipo:'java'
			}	
		]
	},
	{	id: 6, nombre: 'Objetos como atributos',
		resumen: 'En este capítulo se incluyen prácticas para que el alumno consolide sus conocimientos acerca del concepto de agragación, así como su habilidad para constuir clases que involucren el uso de clases existentes, de las cuales no se tien el código fuente, sólo se tiene el código ejecutable y documentación.', 
		listaArchivos: [
			{
				nombre:'Alumno',
				descripcion:'',
				ruta:'Alumno.java',
				tipo:'java'
			},
			{
				nombre:'Prueba de la clase Alumno',
				descripcion:'',
				ruta:'PruebaAlumno.java',
				tipo:'java'
			},
			{
				nombre:'Prueba de la clase Alumno (versión 2)',
				descripcion:'',
				ruta:'PruebaAlumno2.java',
				tipo:'java'
			},
			{
				nombre:'Prueba de la clase Alumno (con parámetros en el main)',
				descripcion:'',
				ruta:'PruebaAlumnoParametros.java',
				tipo:'java'
			},
			{
				nombre:'Cambios en variables y en arreglos',
				descripcion:'',
				ruta:'Cambios.java',
				tipo:'java'
			},
			{
				nombre:'Sección escolar',
				descripcion:'',
				ruta:'SeccionEscolar.java',
				tipo:'java'
			},
			{
				nombre:'Sección escolar (versión ordenara)',
				descripcion:'',
				ruta:'SeccionEscolarOrdenada.java',
				tipo:'java'
			}
		]
	},
	{	id: 7, nombre: 'Arreglos',
		resumen: 'En este capítulo se presentan prácticas para que el alumno se ejercite en el desarrollo de programas que manejan varios datos del mismo tipo, sea este primitivo o clase, agrupados estos en un objeto denominado arreglo y también se ejercite en el uso de instrucción de iteración.', 
		listaArchivos: [
			{
				nombre:'Cuenta',
				descripcion:'',
				ruta:'Cuenta.java',
				tipo:'java'
			},
			{
				nombre:'Cuenta con servicios',
				descripcion:'',
				ruta:'CuentaConServicios.java',
				tipo:'java'
			},
			{
				nombre:'Uso de la clase Cuenta',
				descripcion:'',
				ruta:'UsaCuentas.java',
				tipo:'java'
			},
			{
				nombre:'Cuenta de crédito',
				descripcion:'',
				ruta:'CuentaDeCredito.java',
				tipo:'java'
			},
			{
				nombre:'Prueba de jerarquía de cuentas',
				descripcion:'',
				ruta:'PruebaCuentas.java',
				tipo:'java'
			},
			{
				nombre:'Obra',
				descripcion:'',
				ruta:'Obra.java',
				tipo:'java'
			},
			{
				nombre:'Libro',
				descripcion:'',
				ruta:'Libro.java',
				tipo:'java'
			},
			{
				nombre:'Tesis',
				descripcion:'',
				ruta:'Tesis.java',
				tipo:'java'
			},
			{
				nombre:'Artículo',
				descripcion:'',
				ruta:'Articulo.java',
				tipo:'java'
			},	
		]
	},
	{	id: 8, nombre: 'Paso de parámetros',
		resumen: 'En este capítulo se tienen prácticas para que el alumno refuerce sus conocimientos acerca del paso de parámetros por valor, la diferencia entre parámetro formal y parámetro real o actual, así como el paso de parámetros al método main. ', 
		listaArchivos: [
			{
				nombre:'Cuenta con excepciones (versión 1)',
				descripcion:'',
				ruta:'Cuenta1.java',
				tipo:'java'
			},
			{
				nombre:'Prueba excepciones cuenta',
				descripcion:'',
				ruta:'PruebaExcepcionesCuenta.java',
				tipo:'java'
			},
			{
				nombre:'Excepción bancaria',
				descripcion:'',
				ruta:'ExcepcionBancaria.java',
				tipo:'java'
			},
			{
				nombre:'Excepción monto negativo',
				descripcion:'',
				ruta:'ExcepcionMontoNegativo.java',
				tipo:'java'
			},
			{
				nombre:'Excepción retiro negativo',
				descripcion:'',
				ruta:'ExcepcionRetiroNegativo.java',
				tipo:'java'
			},
			{
				nombre:'Excepción depósito negativo',
				descripcion:'',
				ruta:'ExcepcionDepositoNegativo.java',
				tipo:'java'
			},
			{
				nombre:'Excepción falta de fondos',
				descripcion:'',
				ruta:'ExcepcionFaltaDeFondos.java',
				tipo:'java'
			},
			{
				nombre:'Excepción crédito no autorizado',
				descripcion:'',
				ruta:'ExcepcionCreditoNoAutorizado.java',
				tipo:'java'
			},
			{
				nombre:'Prueba con excepciones bancarias',
				descripcion:'',
				ruta:'Cuenta.java',
				tipo:'java'
			},
			{
				nombre:'Prueba de excepciones propias',
				descripcion:'',
				ruta:'PruebaExcepcionesPropias.java',
				tipo:'java'
			},
			{
				nombre:'Prueba de excepciones con dos try-catch',
				descripcion:'',
				ruta:'ExcepcionesCon2Try.java',
				tipo:'java'
			},	
		]
	},
	// Falta clase Contrato.java para compilar clase Nomina.java, Permanente.java, Horas.java, TiempoCompleto.java
	{	id: 9, nombre: 'Herencia',
		resumen: 'En este capítulo se tienen prácticas que sirven para que el alumno se ejercite en la creación de jerarquías de herencia de clases, ya sea empezando de la raíz o bien especializando clases existentes. Además de que refuerce sus conocimientos acerca del concepto de polimorfismo y de datos protegidos. ', 
		listaArchivos: [
			{
				nombre:'Empleado',
				descripcion:'',
				ruta:'Empleado.java',
				tipo:'java'
			},
			{
				nombre:'Empleado temporal',
				descripcion:'',
				ruta:'Temporal.java',
				tipo:'java'
			},
			{
				nombre:'Empleado permanente',
				descripcion:'',
				ruta:'Permanente.java',
				tipo:'java'
			},
			{
				nombre:'Empleado por horas',
				descripcion:'',
				ruta:'PorHoras.java',
				tipo:'java'
			},
			{
				nombre:'Empleado de tiempo completo',
				descripcion:'',
				ruta:'TiempoCompleto.java',
				tipo:'java'
			},
			{
				nombre:'Nómina',
				descripcion:'',
				ruta:'Nomina.java',
				tipo:'java'
			},
			{
				nombre:'Interfaz inflable',
				descripcion:'',
				ruta:'Inflable.java',
				tipo:'java'
			},
			{
				nombre:'Círculo',
				descripcion:'',
				ruta:'Circulo.java',
				tipo:'java'
			},
			{
				nombre:'Rectángulo',
				descripcion:'',
				ruta:'Rectangulo.java',
				tipo:'java'
			},
			{
				nombre:'Prueba círculos inflables',
				descripcion:'',
				ruta:'PruebaCirculosInflables.java',
				tipo:'java'
			},
			{
				nombre:'Prueba de polimorfismo con interfaces',
				descripcion:'',
				ruta:'PruebaPolimorfismoInterfaces1.java',
				tipo:'java'
			},
			{
				nombre:'Objeto mayor',
				descripcion:'',
				ruta:'ObjetoMayor.java',
				tipo:'java'
			},
			{
				nombre:'Clase Persona',
				descripcion:'',
				ruta:'Persona.java',
				tipo:'java'
			},
			{
				nombre:'Interfaz Clasificable',
				descripcion:'',
				ruta:'Clasificable.java',
				tipo:'java'
			},
			{
				nombre:'Interfaz Solucionable',
				descripcion:'',
				ruta:'Solucionable.java',
				tipo:'java'
			},
			{
				nombre:'Biomatemático',
				descripcion:'',
				ruta:'Biomatematico.java',
				tipo:'java'
			},
			{
				nombre:'Programador',
				descripcion:'',
				ruta:'Programador.java',
				tipo:'java'
			},
			{
				nombre:'Persona común',
				descripcion:'',
				ruta:'PersonaComun.java',
				tipo:'java'
			},
			{
				nombre:'Otra prueba de polimorfismo con interfaces',
				descripcion:'',
				ruta:'PruebaPolimorfismoInterfaces.java',
				tipo:'java'
			},
		]
	},
	{	id: 10, nombre: 'Excepciones',
		resumen: 'En este capítulo se presentan prácticas para que el alumno se ejercite en el manejo de excepciones como un mecanismo para escribir programas robustos. Estas excepciones pueden ser de las proporcionadas por Java o bien desarrolladas para el programa particular que se esté desarrollando. El manejo de las excepciones incluye su lanzamiento, atrapado y recuperación. ', 
		listaArchivos: [
			{
				nombre:'Persona',
				descripcion:'',
				ruta:'Persona.java',
				tipo:'java'
			},
			{
				nombre:'Prueba de serialización',
				descripcion:'',
				ruta:'PruebaSerializacion.java',
				tipo:'java'
			},
			{
				nombre:'Prueba de deserialización',
				descripcion:'',
				ruta:'PruebaDeserializacion.java',
				tipo:'java'
			},
			{
				nombre:'Colección persistente',
				descripcion:'',
				ruta:'ColeccionPersistente.java',
				tipo:'java'
			},
			{
				nombre:'Prueba de la colección',
				descripcion:'',
				ruta:'PruebaColeccion.java',
				tipo:'java'
			},
		]
	},
	{	id: 11, nombre: 'Clases abstractas',
		resumen: 'Este capítulo contiene un conjunto de prácticas para que el alumno adquiera experiencia en la creación de jerarquías de clases que contengan al menos una clase que no puede definirse completamente al momento de su creación y obliga a que sus subclases implementen los métodos que no se pueden definir en ella. Estas clases se conocen como clases abstractas. ', 
		listaArchivos: [
			{
				nombre:'Persona',
				descripcion:'',
				ruta:'Persona.java',
				tipo:'java'
			},
			{
				nombre:'Prueba de serialización',
				descripcion:'',
				ruta:'PruebaSerializacion.java',
				tipo:'java'
			},
			{
				nombre:'Prueba de deserialización',
				descripcion:'',
				ruta:'PruebaDeserializacion.java',
				tipo:'java'
			},
			{
				nombre:'Colección persistente',
				descripcion:'',
				ruta:'ColeccionPersistente.java',
				tipo:'java'
			},
			{
				nombre:'Prueba de la colección',
				descripcion:'',
				ruta:'PruebaColeccion.java',
				tipo:'java'
			},
		]
	},
	{	id: 12, nombre: 'Interfaces',
		resumen: 'En este capítulo se incluye una serie de prácticas para que el programador ejercite sus conocimientos acerca de la utilidad y programación de interfaces durante el desarrollo de sus programas. Las prácticas incluyen la implementación de interfaces proporcionadas por Java así como de interfaces definidas para la aplicación. ', 
		listaArchivos: [
			{
				nombre:'Persona',
				descripcion:'',
				ruta:'Persona.java',
				tipo:'java'
			},
			{
				nombre:'Prueba de serialización',
				descripcion:'',
				ruta:'PruebaSerializacion.java',
				tipo:'java'
			},
			{
				nombre:'Prueba de deserialización',
				descripcion:'',
				ruta:'PruebaDeserializacion.java',
				tipo:'java'
			},
			{
				nombre:'Colección persistente',
				descripcion:'',
				ruta:'ColeccionPersistente.java',
				tipo:'java'
			},
			{
				nombre:'Prueba de la colección',
				descripcion:'',
				ruta:'PruebaColeccion.java',
				tipo:'java'
			},
		]
	},
	{	id: 13, nombre: 'Serialización',
		resumen: 'El propósito de las práctias presentadas en este capítulo es que el alumno aprenda los pasos que deben seguirse para lograr que los objetos creados durante la ejecución de un programa persistan más allá de la ejecución del mismo mediante su almacenamiento en archivos en disco. También que conozca el procedimiento para recuperar objetos de archivos. Este proceso se conoce en Java como serializacioón de objetos. ', 
		listaArchivos: [
			{
				nombre:'Persona',
				descripcion:'',
				ruta:'Persona.java',
				tipo:'java'
			},
			{
				nombre:'Prueba de serialización',
				descripcion:'',
				ruta:'PruebaSerializacion.java',
				tipo:'java'
			},
			{
				nombre:'Prueba de deserialización',
				descripcion:'',
				ruta:'PruebaDeserializacion.java',
				tipo:'java'
			},
			{
				nombre:'Colección persistente',
				descripcion:'',
				ruta:'ColeccionPersistente.java',
				tipo:'java'
			},
			{
				nombre:'Prueba de la colección',
				descripcion:'',
				ruta:'PruebaColeccion.java',
				tipo:'java'
			},
		]
	},

];