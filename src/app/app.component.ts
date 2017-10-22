import { Component, OnInit } from '@angular/core';
import 'hammerjs';
import 'hammer-timejs';

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
import { Router,ActivatedRoute } from '@angular/router';

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

  private parentUrl:string;
  libro: Libro;
  capituloSel : Capitulo;

  // init cycle 
  ngOnInit() : void {
    this.libro = this.libroService.getLibroAmparo("");
    //this.libroService.getLibro().then(libro => this.libro = libro);
    var color_principal = "#822727";
    $(".cont-pic").css("background", color_principal);
    $("footer").css("background", color_principal);
  }
  


  // Constructor
  constructor(private libroService:LibroService, private router: Router, private route: ActivatedRoute){

    //console.log(this.route.parent.url);
  }

  /**
  * Manejador para cuando seleccionan un capitulo
  */
  onSelectCap(event: any, capitulo: Capitulo): void {
    event.preventDefault();
    this.onSelect(capitulo);
    var that = this;
    setTimeout(function(){
      that.hideMenu();
    }, 100);
  }

  onSelect(capitulo : Capitulo) : void {
      this.capituloSel = capitulo;
      this.router.navigate(['capitulo', this.capituloSel.id]);
      var sub = this.router.routerState.root;
      console.log(sub);
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


    var styles = window.getComputedStyle(document.getElementsByClassName("container")[0]);
    var anchomenu = styles.getPropertyValue('--ancho-menu'); //get
    var anchoMenu = parseInt(anchomenu);

    // Padding del contenido del captitulo
    $(".contenido-capitulo").velocity({
      paddingLeft: anchoMenu + 50,
    }, {
      duration: 180
    });


    if($(window).width() > 768){

      // Padding del footer
      $(".footer").velocity({
        paddingLeft: "330px",
      }, {
        duration: 180
      });




      // Ancho de imagen piccasso
      $("#picasso").velocity({
        width: $(window).width() - anchoMenu,
      }, {
        duration: 200
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


    if($(window).width() >= 768){

      // Padding del footer
      $(".footer").velocity({
        paddingLeft: "100px",
      }, {
        duration: 200,
        easing : [.07,.83,.89,.94],
      });

      //document.body.style.setProperty('--ancho-menu', "500px");//set
      
      // Ancho de imagen piccasso
      $("#picasso").velocity({
        width: "100%",
      }, {
        duration: 200,
        easing : [.07,.83,.89,.94],
      });

    }



    $(".menu-capitulos").velocity({
       translateX: "-265px",
    }, {
      enqueue : false,
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
      paddingLeft: 5 + 100,
    }, {
      duration: 200
    });
  }



  x: number = 0;
  y: number = 0;

  startX: number = 0;
  startY: number = 0;

  onPanStart(event: any): void {

    console.log("onPanStart");
    event.preventDefault();
    this.startX = this.x;
    this.startY = this.y;
  
  }


  onPan(event: any): void {
/*
    event.preventDefault();
    this.x = this.startX + event.deltaX;
    this.y = this.startY + event.deltaY;


    var styles = window.getComputedStyle(document.getElementsByClassName("container")[0]);
    var anchomenu = styles.getPropertyValue('--ancho-menu'); //get
    var anchoMenu = parseInt(anchomenu);



    var style = window.getComputedStyle($('.menu-capitulos')[0]);  // Need the DOM object
    var matrix = new WebKitCSSMatrix(style.webkitTransform);


    //console.log("x= " + this.x);
    //console.log("y= " + this.y);
    //var delta = matrix.m41 + this.x;
    var delta = this.x;
    console.log(matrix.m41);
    if(matrix.m41 >= 0){

      console.log("Derecha");
      return;
    } else {
      console.log("izquierda");
    }



    $(".menu-capitulos").css("transform", "translateX(" + delta + "px)");



    //Se mueve a la izq
    if(this.x < 0) {

    }
    //Se mueve a la der
    if(this.x > 0) {

    }
    

*/

  }

  onClose(event: any): void {
    event.preventDefault();
    this.hideMenu();
  }
  onOpen(event: any): void {
    event.preventDefault();
    this.showMenu();
  }
  bajaCaps(event: any): void {
    event.preventDefault();
    console.log("swipedown");
  } 
  subeCaps(event: any): void {
    event.preventDefault();
    console.log("swipeup");
  }
}
