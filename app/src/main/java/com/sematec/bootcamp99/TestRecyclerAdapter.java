package com.sematec.bootcamp99;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TestRecyclerAdapter extends RecyclerView.Adapter<TestRecyclerAdapter.TestViewHolder> {

    ArrayList<String> list;
    public TestRecyclerAdapter(ArrayList<String> names) {
        list = names;
    }

    @NonNull
    @Override
    public TestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_list_item, parent, false);
        TestViewHolder holder = new TestViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull TestViewHolder holder, int position) {
        String name = list.get(position);
        holder.txtName.setText(name);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class TestViewHolder extends RecyclerView.ViewHolder {

        TextView txtName;

        public TestViewHolder(@NonNull final View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name = list.get(getAdapterPosition());
                    Toast.makeText(itemView.getContext(), name, Toast.LENGTH_LONG).show();
                }
            });
        }
    }
}
