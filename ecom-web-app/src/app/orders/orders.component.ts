import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-orders',
  templateUrl: './orders.component.html',
  styleUrls: ['./orders.component.css']
})
export class OrdersComponent implements OnInit{

  public orders: any;
  customerId!: number;
  constructor(private http: HttpClient, private router: Router,private activatedRoute: ActivatedRoute) {
    this.customerId = this.activatedRoute.snapshot.params['customerId'];
  }
  ngOnInit(): void {
    this.http.get('http://localhost:9999/order-service/orders/search/byCustomerId?projection=fullOrder&customerId='+this.customerId)
      .subscribe(
      {
        next: data => {
          this.orders = data;
        },
        error: error => {
          console.log(error);
        }
      }
    )
  }

  getOrderDetails(o: any) {
  this.router.navigate(['/orders-details/', o.id]);
  }
}
