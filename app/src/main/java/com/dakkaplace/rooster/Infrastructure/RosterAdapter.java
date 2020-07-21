package com.dakkaplace.rooster.Infrastructure;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dakkaplace.rooster.Domain.Roster;
import com.dakkaplace.rooster.R;

import java.util.ArrayList;

final public class RosterAdapter extends RecyclerView.Adapter<RosterAdapter.RosterViewHolder> {

    private ArrayList<Roster> rosterDataset;

    public static class RosterViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public RosterViewHolder(View v) {
            super(v);
            textView = v.findViewById(R.id.rosterElementView);
        }

        public TextView getTextView() {
            return textView;
        }
    }

    public RosterAdapter(ArrayList<Roster> dataset) {
        rosterDataset = dataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public RosterAdapter.RosterViewHolder onCreateViewHolder(ViewGroup viewGroup,
                                                     int viewType) {
        // create a new view
        View newView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.roster_element_view, viewGroup, false);
        return new RosterViewHolder(newView);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(@NonNull RosterViewHolder holder, int position) {
        holder.textView.setText(rosterDataset.get(position).getTitle());

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return rosterDataset.size();
    }

}
