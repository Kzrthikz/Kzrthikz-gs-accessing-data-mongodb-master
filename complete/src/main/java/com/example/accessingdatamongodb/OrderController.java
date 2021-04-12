package com.example.accessingdatamongodb;

//import com.example.icn.mlp.tenantmanagement.api.controller.model.TenantPatchRequest;
//import com.example.icn.mlp.tenantmanagement.model.Tenant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    @Autowired
    private OrderService orderService ;

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createOrder(@RequestBody Order order) {
        String response = orderService.createOrder(order);
        return new ResponseEntity<String>(response, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HashMap<String, Order>> getAllOrders() {
        HashMap<String, Order> response = orderService.getAllOrders();
        return new ResponseEntity<HashMap<String, Order>>(response, HttpStatus.OK);
    }

    @RequestMapping(value = "/{orderId}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Order> getOrderById(@PathVariable("orderId") String orderId) {
        Order response = orderService.getOrderById(orderId);
        return new ResponseEntity<Order>(response, HttpStatus.OK);
    }

    @RequestMapping(value = "/{orderId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteOrder(@PathVariable("orderId") String orderId) {
        String response = orderService.deleteOrderById(orderId);
        return new ResponseEntity<String>(response, HttpStatus.OK);
    }
}
