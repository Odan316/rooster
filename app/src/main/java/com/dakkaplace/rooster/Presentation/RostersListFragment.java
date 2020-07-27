package com.dakkaplace.rooster.Presentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dakkaplace.rooster.Application.RosterStorage;
import com.dakkaplace.rooster.EditRosterActivity;
import com.dakkaplace.rooster.Infrastructure.StubRosterStorage;
import com.dakkaplace.rooster.R;

public class RostersListFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.rosters_list_fragment, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.rosters_list);

        // use a linear layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);

        RosterStorage rosterStorage = new StubRosterStorage();

        RosterAdapter rosterAdapter = new RosterAdapter(rosterStorage.getAll());
        recyclerView.setAdapter(rosterAdapter);

        view.findViewById(R.id.addRosterButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), EditRosterActivity.class);
                startActivity(intent);

                /*NavHostFragment.findNavController(RostersListFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);*/
            }
        });
    }
}