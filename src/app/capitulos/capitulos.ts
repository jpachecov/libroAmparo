import { Capitulo } from './capitulo';
import { DetalleArchivo } from './DetalleArchivo';
export const CAPITULOS: Capitulo[] = [

	
	{	id: 1, nombre: 'Proceso de programación',
		resumen: 'En este capítulo se detalla cada una de las actividades necesarias para escribir programas que funcionen adecuadamente como solución a un problema particular. Estas actividades incluyen la definición del problema, el diseño de la solución, así como la codificación, la depuración, las pruebas, la validación, la documentación y el mantenimiento de la solución.', 
		listaArchivos: null	
	},
	{	id: 2, nombre: 'Creación  y uso de datos primitivos',
		resumen: 'En este capítulo se describe la forma de crear y utilizar datos de los tipos predefinidos por Java, primitivos, en expresiones que devuelven un valor. Se describe la forma en que Java evalúa las expresiones de acuerdo con la prioridad y reglas de asociación de los operadores involucrados, así como la forma de trabajar con expresiones que contengan elementos de diferente tipo.', 
		listaArchivos: null
	},
	{	id: 3, nombre: 'Creación  y uso de objetos',
		resumen: 'En este capítulo se muestra cómo trabajar con objetos, ya sea de clases definidas en los paquetes Java o bien de clases definidas por el programador. El trabajo con objetos incluye crearlos, interactuar con ellos a través del envío y recepción de mensajes, compararlos, eliminarlos e imprimirlos, entre otras operaciones.', 
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
	{	id: 4, nombre: 'Creación  y uso de clases',
		resumen: 'En este capítulo se muestra la forma en que el programador puede crear sus propias clases. En toda clase se define tanto la estructura como el comportamiento que tendrán sus objetos. La parte estructural de los objetos se define mediante la declaración de datos, éstos pueden ser de cualquier tipo definido por el lenguaje. El comportamiento de los objetos se modela mediante métodos, y es sólo mediante éstos que se puede asignar, alterar y conocer el estado de un objeto.', 
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
				ruta:'docsPunto.tar.gz',
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
				ruta:'docsHora.tar.gz',
				tipo:'html'
			}	
		]
	},
	{	id: 5, nombre: 'Objetos como atributos',
		resumen: 'En este capítulo se presentan problemas que permiten ilustrar los conceptos de modularización, agregación y agregación. Los dos primeros facilitan el diseño de programas grandes y el tercero consiste en incluir objetos en la estructura de objetos de otra clase. También se presentan algunas instrucciones que permiten la ejecución iterativa de un bloque de instrucciones.', 
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
	{	id: 6, nombre: 'Agrupación de objetos',
		resumen: 'En este capítulo se presenta la forma de agrupar objetos y en general datos de cualquier tipo, en un objeto denominado arreglo. Una vez creada la agrupación se analiza la forma de trabajar con cada elemento de ella o con todos como unidad. También se explica el significado del parámetro que recibe el método main y cómo usarlo.', 
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
	{	id: 7, nombre: 'Herencia de clases',
		resumen: 'En este capítulo se muestra la forma de crear nuevas clases por combinación, extensión y/o especialización de clases existentes, a través de la herencia de clases. También se introduce el concepto de polimorfismo, el cual permite determinar en el momento de ejecución a qué clase enviar el mensaje.', 
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
	{	id: 8, nombre: 'La clase Exception',
		resumen: 'En este capítulo se muestra la forma de crear programas robustos utilizando el mecanismo de excepciones, para forzar al usuario a enfrentarse a los errores. Se describe qué sucede después de que ocurre un error, cómo manejarlo, dónde hacerlo y cómo puede el programa recuperarse de tal error.', 
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
	{	id: 9, nombre: 'Clases abstractas e interfaces',
		resumen: 'En este capítulo se describe la forma de crear programas tan generales que representan un concepto abstracto, por lo que no es posible definir la implementación de todos sus métodos y por lo tanto son clases de las que no es posible generar objetos, pero sirven para especificar el comportamiento de sus descendientes. También se describe la forma de definir interfaces que son especificaciones del comportamiento deseado para las clases que las implementan.', 
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
	{	id: 10, nombre: 'Serialización de objetos',
		resumen: 'En este capítulo se presenta la forma de conseguir que los objetos que se crean en un programa no se destruyan al terminar la ejecución del mismo, es decir, que sigan existiendo independientemente de que el programa termine su ejecución.', 
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
	}

];