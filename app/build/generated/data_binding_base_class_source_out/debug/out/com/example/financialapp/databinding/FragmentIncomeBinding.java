// Generated by view binder compiler. Do not edit!
package com.example.financialapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.financialapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentIncomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText amountEditText;

  @NonNull
  public final EditText dateEditText;

  @NonNull
  public final TableRow headerRow;

  @NonNull
  public final EditText notesEditText;

  @NonNull
  public final Button saveButton;

  @NonNull
  public final EditText sourceEditText;

  @NonNull
  public final TableLayout tableLayout;

  @NonNull
  public final TextView topicTextView;

  private FragmentIncomeBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText amountEditText, @NonNull EditText dateEditText, @NonNull TableRow headerRow,
      @NonNull EditText notesEditText, @NonNull Button saveButton, @NonNull EditText sourceEditText,
      @NonNull TableLayout tableLayout, @NonNull TextView topicTextView) {
    this.rootView = rootView;
    this.amountEditText = amountEditText;
    this.dateEditText = dateEditText;
    this.headerRow = headerRow;
    this.notesEditText = notesEditText;
    this.saveButton = saveButton;
    this.sourceEditText = sourceEditText;
    this.tableLayout = tableLayout;
    this.topicTextView = topicTextView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentIncomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentIncomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_income, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentIncomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.amountEditText;
      EditText amountEditText = ViewBindings.findChildViewById(rootView, id);
      if (amountEditText == null) {
        break missingId;
      }

      id = R.id.dateEditText;
      EditText dateEditText = ViewBindings.findChildViewById(rootView, id);
      if (dateEditText == null) {
        break missingId;
      }

      id = R.id.headerRow;
      TableRow headerRow = ViewBindings.findChildViewById(rootView, id);
      if (headerRow == null) {
        break missingId;
      }

      id = R.id.notesEditText;
      EditText notesEditText = ViewBindings.findChildViewById(rootView, id);
      if (notesEditText == null) {
        break missingId;
      }

      id = R.id.saveButton;
      Button saveButton = ViewBindings.findChildViewById(rootView, id);
      if (saveButton == null) {
        break missingId;
      }

      id = R.id.sourceEditText;
      EditText sourceEditText = ViewBindings.findChildViewById(rootView, id);
      if (sourceEditText == null) {
        break missingId;
      }

      id = R.id.tableLayout;
      TableLayout tableLayout = ViewBindings.findChildViewById(rootView, id);
      if (tableLayout == null) {
        break missingId;
      }

      id = R.id.topicTextView;
      TextView topicTextView = ViewBindings.findChildViewById(rootView, id);
      if (topicTextView == null) {
        break missingId;
      }

      return new FragmentIncomeBinding((ConstraintLayout) rootView, amountEditText, dateEditText,
          headerRow, notesEditText, saveButton, sourceEditText, tableLayout, topicTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
