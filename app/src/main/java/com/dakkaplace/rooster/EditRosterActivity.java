package com.dakkaplace.rooster;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.dakkaplace.rooster.Presentation.RosterFormFragment;

public class EditRosterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_roster);

        RosterFormFragment newFormFragment = new RosterFormFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.form_fragment_container, newFormFragment);
        transaction.addToBackStack(null);

        transaction.commit();

    }
}