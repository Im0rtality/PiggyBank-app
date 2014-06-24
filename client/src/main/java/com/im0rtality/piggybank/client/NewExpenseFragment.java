package com.im0rtality.piggybank.client;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

import com.im0rtality.piggybank.client.entity.Category;
import com.im0rtality.piggybank.client.fixtures.CategoryFixture;

import java.util.ArrayList;

public class NewExpenseFragment extends Fragment {
    private CategoryFixture categoryFixture = new CategoryFixture(new ColorGenerator());

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_new_expense, container, false);

        ArrayList<Category> categoryList = new ArrayList<Category>();
        for (int i = 0; i < 20; i++) {
            categoryList.add(categoryFixture.nextCategory());
        }

        CategorySpinnerAdapter categoryAdapter = new CategorySpinnerAdapter(getActivity(), categoryList);
        categoryAdapter.setDropDownViewResource(R.layout.spinner_item);

        Spinner categories = (Spinner) view.findViewById(R.id.spinnerCategory);
        categories.setAdapter(categoryAdapter);

        return view;
    }
}
