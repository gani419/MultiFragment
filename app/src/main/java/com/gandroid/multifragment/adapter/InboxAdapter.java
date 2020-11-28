package com.gandroid.multifragment.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gandroid.multifragment.R;
import com.gandroid.multifragment.model.InboxModel;

import java.util.List;

public class InboxAdapter extends RecyclerView.Adapter<InboxAdapter.Holder> {

//    private List<InboxModel> modelList;
    private InboxModel[] modelList;
    private Context context;

    public InboxAdapter(InboxModel[] modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @NonNull
    @Override
    public InboxAdapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_inbox, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull InboxAdapter.Holder holder, int position) {
//        InboxModel model = modelList.get(holder.getAdapterPosition());
        InboxModel model = modelList[holder.getAdapterPosition()];

        holder.tv_from.setText(model.getForm());
        holder.tv_content.setText(model.getContent());
        holder.tv_time.setText(model.getTime());
    }

    @Override
    public int getItemCount() {
        return modelList.length;
    }

    public static class Holder extends RecyclerView.ViewHolder {
        private TextView tv_time, tv_from, tv_content;
        public Holder(@NonNull View itemView) {
            super(itemView);
            tv_time = itemView.findViewById(R.id.tv_time_inbox_rv);
            tv_from = itemView.findViewById(R.id.tv_from_inbox_rv);
            tv_content = itemView.findViewById(R.id.tv_content_inbox_rv);
        }
    }
}