package com.im0rtality.piggybank.client;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.im0rtality.piggybank.client.entity.Category;

import java.util.List;

public class CategorySpinnerAdapter extends ArrayAdapter {

    private Context context;
    private List<Category> categories;

    public CategorySpinnerAdapter(Context context, List<Category> categories) {
        super(context, android.R.layout.simple_spinner_item, categories);

        this.context = context;
        this.categories = categories;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.spinner_item, parent, false);

        TextView title = (TextView) view.findViewById(R.id.textCategoryTitle);
        title.setText(categories.get(position).getTitle());
        ImageView image = (ImageView) view.findViewById(R.id.imageCategoryColor);
        image.setBackgroundColor(categories.get(position).getColor());

        return view;
    }
}
