package enocaBackChallenge2.question5.order.web.controller;

import enocaBackChallenge2.question5.order.service.OrderService;
import enocaBackChallenge2.question5.order.service.dto.OrderDto;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Tag(name= "Order Controller")
@RequestMapping("/order")
@RestController
public class OrderController {
        private final OrderService orderService;

        @Autowired
        public OrderController(OrderService orderService){
            this.orderService = orderService;
        }

        @Schema(description = "Get Order List")
        @GetMapping("/get")
        public ResponseEntity<List<OrderDto>> getOrderList(){
            List<OrderDto> orderDtoList = this.orderService.getOrders();
            return  new ResponseEntity<>(orderDtoList, HttpStatus.OK);
        }
        @Schema(description = "Insert Order")
        @PostMapping("/post")
        public ResponseEntity<OrderDto>insertCar(OrderDto orderDto){
            orderDto = this.orderService.insertOrder(orderDto);
            return new ResponseEntity<>(orderDto,HttpStatus.OK);
        }
        @Schema(description = "Delete Order")
        @DeleteMapping("/delete")
        public void removeOrder(Long id){
            this.orderService.removeOrder(id);
        }

        @Schema(description = "Update Order")
        @PutMapping("/put")
        public ResponseEntity<OrderDto>updateOrder(OrderDto orderDto){
            orderDto = this.orderService.updateOrder(orderDto);
            return new ResponseEntity<>(orderDto,HttpStatus.OK);
        }
}
