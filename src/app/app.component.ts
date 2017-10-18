import { Component, OnInit } from '@angular/core';

import {
  trigger,
  state,
  style,
  animate,
  transition,
  group,
  query
} from '@angular/animations';


import { Capitulo } from './capitulos/capitulo';
import { Libro } from './libro/libro';
import { LibroService } from './servicios/libros-service';
import { Router } from '@angular/router';

declare var $ :any;

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: [
    './app.component.css',
    'responsive/app.component.responsive.css',
    'responsive/menu.responsive.css',
    'responsive/footer.responsive.css',
    '../font-awesome-4.7.0/css/font-awesome.min.css'
  ],
  animations:[
  /*
    trigger('menuState', [
      state('activo', style({
      })),
      state('inactivo', style({

      })),
      transition('activo => inactivo', 
        group([
          
          query(".menu-capitulos",[animate('500ms ease-out', style({
        transform:'translateX(-350px)',
        opacity:0,
        display:'none'
       }))],  {optional:true}),

          query(".contenido-capitulo",[animate('500ms ease-out', style({paddingLeft:"100px"}))],  {optional:true})

        ]),


         animate('300ms ease-out')),
      transition('inactivo => activo', animate('300ms ease-in'))
    ])
    */
  ]
})
export class AppComponent implements OnInit{

  libro: Libro;
  capituloSel : Capitulo;

  ngOnInit() : void {

    var color_principal = "#822727";

    $(".cont-pic").css("background", color_principal);
    $("footer").css("background", color_principal);

    
  }
  
  constructor(private libroService:LibroService, private router: Router){
    this.libro = this.libroService.getLibroAmparo("practicas");
  }

  onSelect(capitulo : Capitulo) : void {
      this.capituloSel = capitulo;
      this.router.navigate(['/capitulo', this.capituloSel.id]);
  }


  enTope : boolean = false;

  showMenu():void {
    $(".menu-capitulos").addClass("showed-menu");
    $(".menu-capitulos").velocity({
       translateX: "0px",
    }, {
      enqueue : false,
      duration: 200,
      easing: [.07,.83,.89,.94],
      complete: function(){
        //$(this).css("display", "none");
        $(this).removeClass("menu-hide");
      }
    });


    // Padding del contenido del captitulo
    $(".contenido-capitulo").velocity({
      paddingLeft: "470px",
    }, {
      duration: 180
    });


    if($(window).width() >= 800){

      // Padding del footer
      $(".footer").velocity({
        paddingLeft: "330px",
      }, {
        duration: 180
      });


      // Ancho de imagen piccasso
      $("#picasso").velocity({
        width: "80%",
      }, {
        duration: 250
      });

    }

  }

  subeIcono():void {
    $(".cont-pic > a").velocity({
       height: "25px",
    }, {
      enqueue : true,
      duration: 200,
      easing : [.07,.83,.89,.94],
      complete: function(){
        //$(this).css("display", "none");
        $(this).addClass("menu-hide");
        $(".menu-capitulos").removeClass("showed-menu");
      }
    });

  }
  bajaIcono():void {
    $(".cont-pic > a").velocity({
       height: "100px",
    }, {
      enqueue : true,
      duration: 200,
      easing : [.07,.83,.89,.94],
      complete: function(){
        //$(this).css("display", "none");
        $(this).removeClass("menu-hide");
        $(".menu-capitulos").addClass("showed-menu");
      }
    });

  }


  hideMenu():void {
    console.log("hideMenu");
    $(".menu-capitulos").velocity({
       translateX: "-250px",
    }, {
      enqueue : true,
      duration: 200,
      easing : [.07,.83,.89,.94],
      complete: function(){
        //$(this).css("display", "none");
        $(this).addClass("menu-hide");
        $(".menu-capitulos").removeClass("showed-menu");
      }
    });

    // Padding del contenido del captitulo
    $(".contenido-capitulo").velocity({
      paddingLeft: "280px",
    }, {
      duration: 250
    });




    if($(window).width() >= 800){

      // Padding del footer
      $(".footer").velocity({
        paddingLeft: "100px",
      }, {
        duration: 250
      });

      // Ancho de imagen piccasso
      $("#picasso").velocity({
        width: "97%",
      }, {
        duration: 250
      });

    }

  }

}
