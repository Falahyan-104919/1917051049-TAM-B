package com.college.momskitchenrecipe.View.Home;

import com.college.momskitchenrecipe.Model.Categories;
import com.college.momskitchenrecipe.Model.Meals;

import java.util.List;

public interface HomeView {
    void showLoading();
    void hideLoading();
    void setMeal(List<Meals.Meal> meal);
    void setCategory(List<Categories.Category> category);
    void onErrorLoading(String message);
}
