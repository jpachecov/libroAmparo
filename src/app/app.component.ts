import { Component } from '@angular/core';
import { Capitulo } from './capitulos/capitulo';
import { CAPITULOS } from './capitulos/capitulos';
import {Http, Response, RequestOptions, ResponseContentType} from '@angular/http';
import { saveAs } from 'file-saver';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  titulo = 'Capítulos';
  capitulos = CAPITULOS;
  capituloSel : Capitulo;
// Inject HttpClient into your component or service.
  constructor(private http: Http) {}

  onSelect(capitulo : Capitulo) : void {
    	console.log("Capitulo Seleccionado");
      this.capituloSel = capitulo;
  }
  descarga(archivo : String) : void {

    this.http
      .get('assets/archivos/' + archivo, {responseType: ResponseContentType.Blob})
      // The Observable returned by get() is of type Observable<string>
      // because a text response was specified. There's no need to pass
      // a <string> type parameter to get().
      .subscribe(data => this.save(data, archivo));
  }

  save(res: Response, file: String) : void {

    console.log(res);
// TODO save as
    let blob: Blob = res.blob();
    window['saveAs'](blob, file);
    
  }
}
