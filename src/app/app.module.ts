import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
/*
import { ContenidoCapitulo } from './capitulos/contenido-capitulo.component';
import { MenuCapitulosComponent } from './capitulos/menu.component'; 
*/
import { HttpModule }    from '@angular/http';

import { HeaderComponent } from './header/header.component';
import { AppComponent } from './app.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent
  ],
  imports: [
    BrowserModule,
    HttpModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
