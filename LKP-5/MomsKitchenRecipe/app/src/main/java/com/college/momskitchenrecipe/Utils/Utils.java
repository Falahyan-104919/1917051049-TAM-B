package com.college.momskitchenrecipe.Utils;

import android.app.AlertDialog;
import android.content.Context;

import com.college.momskitchenrecipe.ViewModel.FoodAPI;
import com.college.momskitchenrecipe.ViewModel.FoodClient;

public class Utils {
    public static FoodAPI getAPI() {
        return FoodClient.getFoodClient().create(FoodAPI.class);
    }

    public static AlertDialog showDialogMessage(Context context, String title, String message){
        return new AlertDialog.Builder(context).setTitle(title).setMessage(message).show();
    }
}
