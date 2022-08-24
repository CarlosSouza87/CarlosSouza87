import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Product } from './products/Product';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  constructor(private http : HttpClient) { }

  insert( product : Product) : Observable<Product>{
    let obj = {
      "name" : product.name,
      "price" : product.price,
      "description" : product.description,
      "categories" : [
          {
              "id": product.categories
          }
      ]
  
  }
    return this.http.post<Product>('http://localhost:8080/products', obj)

  }
}
