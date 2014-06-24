package com.im0rtality.piggybank.client;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.im0rtality.piggybank.client.entity.Category;

import java.util.ArrayList;

public class NewExpenseFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_new_expense, container, false);

        ArrayList<Category> categoryList = new ArrayList<Category>();
        categoryList.add(new Category("Food", null));
        categoryList.add(new Category("Transport", null));
        categoryList.add(new Category("Taxes", null));

        ArrayAdapter<Category> categoryAdapter = new ArrayAdapter<Category>(getActivity(), android.R.layout.simple_spinner_item, categoryList);

        Spinner categories = (Spinner) view.findViewById(R.id.spinnerCategory);
        categories.setAdapter(categoryAdapter);

        return view;
    }
}
