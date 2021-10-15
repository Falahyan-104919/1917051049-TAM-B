package com.college.momskitchenrecipe.View.Detail;

import com.college.momskitchenrecipe.Model.Meals;

public interface DetailView {
    void showLoading();
    void hideLoading();
    void setMeal(Meals.Meal meal);
    void onErrorLoading(String message);
}
