// Generated by view binder compiler. Do not edit!
package com.example.financialapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.financialapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentExpensesBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonAddExpense;

  @NonNull
  public final EditText editTextExpenseAmount;

  @NonNull
  public final EditText editTextExpenseDate;

  @NonNull
  public final EditText editTextExpenseNote;

  @NonNull
  public final ImageView imageViewCalendar;

  @NonNull
  public final RecyclerView recyclerViewExpenses;

  @NonNull
  public final Spinner spinnerExpenseType;

  private FragmentExpensesBinding(@NonNull LinearLayout rootView, @NonNull Button buttonAddExpense,
      @NonNull EditText editTextExpenseAmount, @NonNull EditText editTextExpenseDate,
      @NonNull EditText editTextExpenseNote, @NonNull ImageView imageViewCalendar,
      @NonNull RecyclerView recyclerViewExpenses, @NonNull Spinner spinnerExpenseType) {
    this.rootView = rootView;
    this.buttonAddExpense = buttonAddExpense;
    this.editTextExpenseAmount = editTextExpenseAmount;
    this.editTextExpenseDate = editTextExpenseDate;
    this.editTextExpenseNote = editTextExpenseNote;
    this.imageViewCalendar = imageViewCalendar;
    this.recyclerViewExpenses = recyclerViewExpenses;
    this.spinnerExpenseType = spinnerExpenseType;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentExpensesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentExpensesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_expenses, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentExpensesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonAddExpense;
      Button buttonAddExpense = ViewBindings.findChildViewById(rootView, id);
      if (buttonAddExpense == null) {
        break missingId;
      }

      id = R.id.editTextExpenseAmount;
      EditText editTextExpenseAmount = ViewBindings.findChildViewById(rootView, id);
      if (editTextExpenseAmount == null) {
        break missingId;
      }

      id = R.id.editTextExpenseDate;
      EditText editTextExpenseDate = ViewBindings.findChildViewById(rootView, id);
      if (editTextExpenseDate == null) {
        break missingId;
      }

      id = R.id.editTextExpenseNote;
      EditText editTextExpenseNote = ViewBindings.findChildViewById(rootView, id);
      if (editTextExpenseNote == null) {
        break missingId;
      }

      id = R.id.imageViewCalendar;
      ImageView imageViewCalendar = ViewBindings.findChildViewById(rootView, id);
      if (imageViewCalendar == null) {
        break missingId;
      }

      id = R.id.recyclerViewExpenses;
      RecyclerView recyclerViewExpenses = ViewBindings.findChildViewById(rootView, id);
      if (recyclerViewExpenses == null) {
        break missingId;
      }

      id = R.id.spinnerExpenseType;
      Spinner spinnerExpenseType = ViewBindings.findChildViewById(rootView, id);
      if (spinnerExpenseType == null) {
        break missingId;
      }

      return new FragmentExpensesBinding((LinearLayout) rootView, buttonAddExpense,
          editTextExpenseAmount, editTextExpenseDate, editTextExpenseNote, imageViewCalendar,
          recyclerViewExpenses, spinnerExpenseType);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
