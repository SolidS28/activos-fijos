import { Component, OnInit } from '@angular/core';
import { ActivosService } from '../activos.service';
import { Activo } from '../activo';

@Component({
  selector: 'app-activos',
  templateUrl: './activos.component.html',
  styleUrls: ['./activos.component.css']
})
export class ActivosComponent implements OnInit {
  activos: Activo[];

  constructor(private activosService: ActivosService) { }

  ngOnInit() {
    this.getActivos();
  }

  getActivos(): void {
    this.activosService.getActivos().subscribe(activos => this.activos = activos);
  }
}
