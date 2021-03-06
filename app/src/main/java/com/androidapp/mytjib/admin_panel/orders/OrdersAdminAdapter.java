package com.androidapp.mytjib.admin_panel.orders;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.androidapp.mytjib.R;
import com.androidapp.mytjib.buy_tickets.Ticket;
import com.androidapp.mytjib.customer.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Adapter for order data to display in recycler view
 */

public class OrdersAdminAdapter extends RecyclerView.Adapter<OrdersAdminAdapter.ViewHolder>{

    private final Context context;
    private List<Order> orders;

    public OrdersAdminAdapter(Context context) { // constructor
        this.context = context;
        orders = new ArrayList<>();
    }

    @NonNull
    @Override
    public OrdersAdminAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { // create and inflate view holder
        View view = LayoutInflater.from(context).inflate(R.layout.order_row, parent, false);
        return new OrdersAdminAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrdersAdminAdapter.ViewHolder holder, int position) { // update ui with data of current order
        final Order order = orders.get(position);
        List<Ticket> orderTickets = order.getTickets();

        String orderDetails = "";
        orderDetails += "Order Number: " + order.getOrderNum() + "\n\n";
        orderDetails += "Total Price: " + order.getPrice() + "₩\n";
        orderDetails += "Order Date: " + order.getOrderTime().toString() + "\n\n";
        orderDetails += "Customer Details:\n" + order.getCustomer().toString() + "\n\n";
        orderDetails += "Shipping Details:\n" + order.getShippingDetails().toString() + "\n\n";
        orderDetails += "Tickets:\n";

        for(int i=0; i<orderTickets.size(); i++){
            orderDetails += orderTickets.get(i).toString()+ "\n";
        }

        holder.detailsTextView.setText(orderDetails);
    }

    // getters and setters

    @Override
    public int getItemCount() {
        return orders.size();
    }

    public void setOrders(List<Order> orders) {
        this.orders  = orders;
        notifyDataSetChanged(); // refresh the UI
    }

    public class ViewHolder extends RecyclerView.ViewHolder { // view holder for order details

        public final TextView detailsTextView;

        public ViewHolder(@NonNull View itemView) { // constructor
            super(itemView);
            detailsTextView = itemView.findViewById(R.id.order_details);
        }
    }

}
