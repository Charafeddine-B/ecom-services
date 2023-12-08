import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-order-details',
  templateUrl: './order-details.component.html',
  styleUrls: ['./order-details.component.css']
})
export class OrderDetailsComponent implements OnInit{
  public orderDetails: any;
  orderId: number = 1;
  constructor(private http: HttpClient, private router: Router,private activatedRoute: ActivatedRoute) {
    this.orderId = this.activatedRoute.snapshot.params['orderId'];
  }
  ngOnInit(): void {
    this.http.get('http://localhost:9999/order-service/fullOrder/'+this.orderId)
      .subscribe(
        {
          next: data => {
            this.orderDetails = data;
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
