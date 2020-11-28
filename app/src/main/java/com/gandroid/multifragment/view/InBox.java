package com.gandroid.multifragment.view;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gandroid.multifragment.R;
import com.gandroid.multifragment.adapter.InboxAdapter;
import com.gandroid.multifragment.databinding.FragmentInBoxBinding;
import com.gandroid.multifragment.model.InboxModel;

import java.util.ArrayList;
import java.util.List;

public class InBox extends Fragment {

    private FragmentInBoxBinding binding;

    private InboxModel[] modelList = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_in_box, container, false);
        View view = binding.getRoot();
        setupRecyclerView();
        return view;
    }

    private void setupRecyclerView() {

        InboxModel model = new InboxModel("Ramesh", "Hi... Good morning", "9:45AP");

        InboxModel[] models = new InboxModel[]{
                new InboxModel("Ramesh", "Hi... Good morning", "9:45AM"),
                new InboxModel("Suresh", "Please send me the project document", "Nov 23 2020 2:24AM"),
                new InboxModel("Rahul", "Hi... Good morning", "Nov 23 2020 9:45AM"),
                new InboxModel("Lalitha", "Hi.. What are you doing?", "Nov 23t 2020 3:33PM"),
                new InboxModel("Pankaj", "Hi.. Are you coming to office today?", "Nov 22 2020 9:00AM"),
                new InboxModel("Lokesh", "Salary credited", "Oct 2 2020 4:45PM"),
                new InboxModel("Satish", "Please pay the rent in time", "Oct 01 2020 9:45AM"),
                new InboxModel("Sarala", "Hi... Good evening", "Oct 01 2020 9:45PM"),
                new InboxModel("Ravali", "Hello", "Oct 01 2020 9:45AM"),
                new InboxModel("Swathi", "Hi... Good night", "Oct 01 2020 9:45PM"),
                new InboxModel("Revathi", "Hi. Are u there?", "Oct 01 2020 11:45PM"),
        };

        binding.recvInbox.setHasFixedSize(true);
        binding.recvInbox.setItemAnimator(new DefaultItemAnimator());
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        manager.setOrientation(RecyclerView.VERTICAL);
        binding.recvInbox.setLayoutManager(manager);
        InboxAdapter adapter = new InboxAdapter(models, getActivity());
        binding.recvInbox.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}