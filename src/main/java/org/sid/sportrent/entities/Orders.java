package org.sid.sportrent.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
//@Table(name="orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    @OneToMany(mappedBy = "order")
    public Collection<OrderItem> orderItems;

    //public Client client;
    //private double totalAmount;

    //public Client getClient() { return client; }

   // public void setClient(Client client) { this.client = client; }

    //public Date getDate() { return date; }

    //public void setDate(Date date) { this.date = date; }



}
