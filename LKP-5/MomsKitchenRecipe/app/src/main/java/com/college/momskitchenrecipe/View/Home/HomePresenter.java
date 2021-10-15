package com.college.momskitchenrecipe.View.Home;

import androidx.annotation.NonNull;

import com.college.momskitchenrecipe.Model.Categories;
import com.college.momskitchenrecipe.Model.Meals;
import com.college.momskitchenrecipe.Utils.Utils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomePresenter {
    private HomeView view;

    public HomePresenter(HomeView view){
        this.view = view;
    }

    void getMeals(){
        view.showLoading();

        Call<Meals> mealsCall = Utils.getAPI().getMeal();
        mealsCall.enqueue(new Callback<Meals>() {
            @Override
            public void onResponse(@NonNull Call<Meals> call, @NonNull Response<Meals> response) {
                view.hideLoading();

                if(response.isSuccessful() && response.body() != null){
                    view.setMeal(response.body().getMeals());
                }else{
                    view.onErrorLoading(response.message());
                }
            }

            @Override
            public void onFailure(@NonNull Call<Meals> call, @NonNull Throwable t) {
                view.hideLoading();
                view.onErrorLoading(t.getLocalizedMessage());
            }
        });
    }

    void getCategories(){
        view.showLoading();

        Call<Categories> categoriesCall = Utils.getAPI().getCategories();
        categoriesCall.enqueue(new Callback<Categories>() {
            @Override
            public void onResponse(@NonNull Call<Categories> call, @NonNull Response<Categories> response) {
                view.hideLoading();
                if(response.isSuccessful() && response.body() != null){
                    view.setCategory(response.body().getCategories());
                }else {
                    view.onErrorLoading(response.message());
                }
            }

            @Override
            public void onFailure(@NonNull Call<Categories> call, @NonNull Throwable t) {
                view.hideLoading();
                view.onErrorLoading(t.getLocalizedMessage());
            }
        });
    }
}
