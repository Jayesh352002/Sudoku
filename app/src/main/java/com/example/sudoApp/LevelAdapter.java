package com.example.sudoApp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class LevelAdapter extends ArrayAdapter {
    private final Activity context;
    private final Integer[] imageSudoarray;
    private final String[] nameArray;
    private final Integer[] imageNextArray;

    public LevelAdapter(Activity context, String[] nameArrayParam, Integer[] infoArrayParam, Integer[] imageIDArrayParam){

        super(context,R.layout.list_single_row , nameArrayParam);
        this.context=context;
        this.imageSudoarray = imageIDArrayParam;
        this.imageNextArray = infoArrayParam;
        this.nameArray = nameArrayParam;


    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.list_single_row, null,true);

        TextView nameTextField = (TextView) rowView.findViewById(R.id.nameTextViewID);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView1ID);
        ImageView imageView1 = (ImageView) rowView.findViewById(R.id.imageView2ID);

        nameTextField.setText(nameArray[position]);
        imageView.setImageResource(imageSudoarray[position]);
        imageView1.setImageResource(imageNextArray[position]);

        return rowView;

    };
}
