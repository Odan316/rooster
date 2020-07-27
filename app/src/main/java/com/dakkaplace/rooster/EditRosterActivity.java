package com.dakkaplace.rooster;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;

import com.dakkaplace.rooster.Presentation.RosterFormFragment;
import com.dakkaplace.rooster.Presentation.RosterInitFormFragment;

public class EditRosterActivity extends AppCompatActivity {

    public static final String EXTRA_ROSTER_UID = "storageId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_roster);

        Intent intent = getIntent();
        String rosterUid = intent.getStringExtra(EXTRA_ROSTER_UID);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.addToBackStack(null);

        if(null == rosterUid){
            RosterInitFormFragment startingFragment = new RosterInitFormFragment();
            transaction.replace(R.id.form_fragment_container, startingFragment);
        } else {
            RosterFormFragment startingFragment = new RosterFormFragment();
            transaction.replace(R.id.form_fragment_container, startingFragment);
        }

        transaction.commit();

    }
}