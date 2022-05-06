package com.dcpappsolutions.notekeeperapp;

import androidx.cardview.widget.CardView;

import com.dcpappsolutions.notekeeperapp.models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);

}
