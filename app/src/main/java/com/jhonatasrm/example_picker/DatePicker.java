package com.jhonatasrm.example_picker;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;

public class DatePicker extends DialogFragment implements DatePickerDialog.OnDateSetListener{

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return  new DatePickerDialog(getActivity(),this, 2018, 9, 19);
    }

    @Override
    public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        String msg = String.format("You picked the date %02d/%02d/%d", monthOfYear, dayOfMonth, year);
        Toast.makeText( getActivity(), msg, Toast.LENGTH_LONG ).show();
    }
}
