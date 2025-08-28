package com.example.surveyapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
public class adapters extends ArrayAdapter<tej> {
    public adapters(@NonNull Context context, ArrayList<tej> arrayList)
    {
        super(context, 0, arrayList);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull
            ViewGroup parent) {
        View currentItemView = convertView;
        if (currentItemView == null) {
            currentItemView =
                    LayoutInflater.from(getContext()).inflate(R.layout.custom_layout, parent,
                            false);
        }
        tej currentNumberPosition = getItem(position);
        ImageView numbersImage =
                currentItemView.findViewById(R.id.imageView);
        assert currentNumberPosition != null;

        numbersImage.setImageResource(currentNumberPosition.getNumbersImageId());
        TextView textView1 = currentItemView.findViewById(R.id.textView1);
        textView1.setText(currentNumberPosition.getNumberInDigit());
        TextView textView2 = currentItemView.findViewById(R.id.textView2);
        textView2.setText(currentNumberPosition.getNumbersInText());
        return currentItemView;
    }
}
