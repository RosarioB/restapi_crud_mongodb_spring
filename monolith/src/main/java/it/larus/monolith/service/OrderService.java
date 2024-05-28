package it.larus.monolith.service;

import it.larus.monolith.entity.Order;
import it.larus.monolith.repository.OrderRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(String id) {
        return orderRepository.findById(id);
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order updateOrder(String id, Order order) {
        Optional<Order> existingOrder = orderRepository.findById(id);
        if (existingOrder.isPresent()) {
            Order _order = existingOrder.get();
            _order.setProduct(order.getProduct());
            _order.setQuantity(order.getQuantity());
            _order.setPrice(order.getPrice());
            _order.setOrderDate(order.getOrderDate());
            return orderRepository.save(_order);
        } else {
            return null;
        }
    }

    public void deleteOrder(String id) {
        orderRepository.deleteById(id);
    }
}
