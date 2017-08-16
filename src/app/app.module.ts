import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { DetalleProfesor } from './profesora/detalle-profesora.component';
import { ContenidoCapitulo } from './capitulos/contenido-capitulo.component';
/*
import { MenuCapitulosComponent } from './capitulos/menu.component'; 
*/
import { HttpModule }    from '@angular/http';

import { HeaderComponent } from './header/header.component';
import { AppComponent } from './app.component';
import { LibroService } from './servicios/libros-service';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    ContenidoCapitulo,
    DetalleProfesor
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    HttpModule
  ],
  providers: [LibroService],
  bootstrap: [AppComponent]
})
export class AppModule { }
