import { Component } from '@angular/core';
import { ApiService } from '../../services/api';
import { CommonModule } from '@angular/common';
@Component({
  selector: 'app-clients',
   standalone: true,
    imports: [CommonModule],
  templateUrl: './clients.html'
})
export class ClientsComponent {

  clients: any[] = [];

  constructor(private api: ApiService) {}

  ngOnInit() {
    this.api.getClients().subscribe((data: any) => {
      this.clients = data;
    });
  }
}
