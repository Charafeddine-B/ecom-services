import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  public products: any;

  constructor(private http: HttpClient) {
    this.http.get('http://localhost:9999/inventory-service/products?projection=fullProduct').subscribe(
      {
        next: data => {
          this.products = data;
        },
        error: error => {
          console.log(error);
        }
      }
    )
  }
  ngOnInit(): void {
  }
}
