import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { RouterModule }   from '@angular/router';

import { PageNotFound } from './404/404.component';
import { DetalleProfesor } from './profesora/detalle-profesora.component';
import { ContenidoCapitulo } from './capitulos/contenido-capitulo.component';
import { Footer } from './footer/footer.component';
/*
import { MenuCapitulosComponent } from './capitulos/menu.component'; 
*/
import { HttpModule }    from '@angular/http';

import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AppComponent } from './app.component';
import { LibroService } from './servicios/libros-service';


var ruta2 = [
  {
    path: ':version',
    component: HomeComponent,
    children:[
      {
        path: '',
        redirectTo: 'introduccion',
        pathMatch: 'full'
      },
      {
        path: 'capitulo/:id',
        component: ContenidoCapitulo
      },
      {
        path: 'introduccion',
        component: HomeComponent
      },

    ]
  },
 

  { path: '**', component: PageNotFound }

];

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    ContenidoCapitulo,
    DetalleProfesor,
    HomeComponent,
    PageNotFound,
    Footer
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    HttpModule,
    RouterModule.forRoot([

/*   
      {
        path: '',
        redirectTo: 'introduccion',
        pathMatch: 'full'
      },
      {
        path: 'capitulo/:id',
        component: ContenidoCapitulo
      },
      {
        path: 'introduccion',
        component: HomeComponent
      }, 
*/

      {
        path: '',
        redirectTo: 'introduccion',
        pathMatch: 'full'
      },
      {
        path: 'capitulo/:id',
        component: ContenidoCapitulo
      },
      {
        path: 'introduccion',
        component: HomeComponent
      }, 



/*
      {
        path: '',
        redirectTo: 'teoria',
        pathMatch: 'full'
      },

      { path: 'teoria', 
        component: HomeComponent, 
  

        children : [
          {
            path: '',
            redirectTo: 'introduccion',
            pathMatch: 'full'
          },
          {
            path: 'capitulo/:id',
            component: ContenidoCapitulo
          },
          {
            path: 'introduccion',
            component: HomeComponent
          },          
        
          ]
        
        },

*/

      { path: 'practicas', 
        component: HomeComponent,  

/*
        children : [
          {
            path: '',
            redirectTo: 'practicas/introduccion',
            pathMatch: 'full'
          },
          {
            path: 'capitulo/:id',
            component: ContenidoCapitulo
          },
          {
            path: 'introduccion',
            component: HomeComponent
          },

        ]
*/        
      },

      { path: '**', component: PageNotFound }
    ])
  ],
  providers: [LibroService],
  bootstrap: [AppComponent]
})
export class AppModule { }
