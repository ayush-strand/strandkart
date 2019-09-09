package strandkart.ecommerce.orders.DataModels;

import strandkart.ecommerce.book.Datamodel.Book;
//import strandkart.ecommerce.user.datamodel.User;

import java.util.Date;

public class Order {

    private Book book;

//    private User user;

    private Integer quantity;

    private Date purchaseDate;

    private Float orderAmount;

    public Order(Book book, int quantity, Date purchaseDate, Float orderAmount){
        this.book = book;
//        this.user = user;
        this.quantity = quantity;
        this.purchaseDate = purchaseDate;
        this.orderAmount = orderAmount;
    }

    public Book getBook() {
        return book;
    }

//    public User getUser() {
//        return user;
//    }

    public Integer getQuantity() {
        return quantity;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public Float getOrderAmount() {
        return orderAmount;
    }

}
