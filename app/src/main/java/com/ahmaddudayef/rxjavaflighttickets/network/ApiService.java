package com.ahmaddudayef.rxjavaflighttickets.network;

import com.ahmaddudayef.rxjavaflighttickets.network.model.Price;
import com.ahmaddudayef.rxjavaflighttickets.network.model.Ticket;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Ahmad Dudayef on 5/31/2018.
 */

public interface ApiService {
    @GET("airline-tickets.php")
    Single<List<Ticket>> searchTickets(@Query("from") String from, @Query("to") String to);

    @GET("airline-tickets-price.php")
    Single<Price> getPrice(@Query("flight_number") String flightNumber, @Query("from") String from, @Query("to") String to);
}
