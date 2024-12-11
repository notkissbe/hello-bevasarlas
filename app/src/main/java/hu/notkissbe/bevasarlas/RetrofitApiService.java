package hu.notkissbe.bevasarlas;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface RetrofitApiService {

    // GET all users
    @GET("/9gxBka/termekek")
    Call<List<Termek>> getAllTermek();

    // GET user by ID
    @GET("acttFJ/people/{id}")
    Call<Termek> getPeopleById(@Path("id") int id);

    // POST (create a new user)
    @POST("acttFJ/people")
    Call<Termek> createPeople(@Body Termek termek);

    // PUT (update a user)
    @PUT("acttFJ/people/{id}")
    Call<Termek> updatePeople(@Path("id") int id, @Body Termek people);

    // DELETE (delete a user by ID)
    @DELETE("acttFJ/people/{id}")
    Call<Void> deletePeople(@Path("id") int id);
}