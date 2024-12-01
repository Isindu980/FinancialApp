// Generated by view binder compiler. Do not edit!
package com.example.financialapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.financialapp.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCreditCardExpensesBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView backArrow;

  @NonNull
  public final Button buttonAddExpense;

  @NonNull
  public final TextInputEditText editTextAmount;

  @NonNull
  public final TextInputEditText editTextNote;

  @NonNull
  public final ListView listViewExpenses;

  @NonNull
  public final Spinner spinnerExpenseType;

  @NonNull
  public final Spinner spinnerSelectCard;

  @NonNull
  public final TextView textViewAmount;

  @NonNull
  public final TextView textViewExpenseType;

  @NonNull
  public final TextView textViewExpensesLabel;

  @NonNull
  public final TextView textViewNote;

  @NonNull
  public final TextView textViewSelectCard;

  private FragmentCreditCardExpensesBinding(@NonNull LinearLayout rootView,
      @NonNull ImageView backArrow, @NonNull Button buttonAddExpense,
      @NonNull TextInputEditText editTextAmount, @NonNull TextInputEditText editTextNote,
      @NonNull ListView listViewExpenses, @NonNull Spinner spinnerExpenseType,
      @NonNull Spinner spinnerSelectCard, @NonNull TextView textViewAmount,
      @NonNull TextView textViewExpenseType, @NonNull TextView textViewExpensesLabel,
      @NonNull TextView textViewNote, @NonNull TextView textViewSelectCard) {
    this.rootView = rootView;
    this.backArrow = backArrow;
    this.buttonAddExpense = buttonAddExpense;
    this.editTextAmount = editTextAmount;
    this.editTextNote = editTextNote;
    this.listViewExpenses = listViewExpenses;
    this.spinnerExpenseType = spinnerExpenseType;
    this.spinnerSelectCard = spinnerSelectCard;
    this.textViewAmount = textViewAmount;
    this.textViewExpenseType = textViewExpenseType;
    this.textViewExpensesLabel = textViewExpensesLabel;
    this.textViewNote = textViewNote;
    this.textViewSelectCard = textViewSelectCard;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCreditCardExpensesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCreditCardExpensesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_credit_card_expenses, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCreditCardExpensesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backArrow;
      ImageView backArrow = ViewBindings.findChildViewById(rootView, id);
      if (backArrow == null) {
        break missingId;
      }

      id = R.id.buttonAddExpense;
      Button buttonAddExpense = ViewBindings.findChildViewById(rootView, id);
      if (buttonAddExpense == null) {
        break missingId;
      }

      id = R.id.editTextAmount;
      TextInputEditText editTextAmount = ViewBindings.findChildViewById(rootView, id);
      if (editTextAmount == null) {
        break missingId;
      }

      id = R.id.editTextNote;
      TextInputEditText editTextNote = ViewBindings.findChildViewById(rootView, id);
      if (editTextNote == null) {
        break missingId;
      }

      id = R.id.listViewExpenses;
      ListView listViewExpenses = ViewBindings.findChildViewById(rootView, id);
      if (listViewExpenses == null) {
        break missingId;
      }

      id = R.id.spinnerExpenseType;
      Spinner spinnerExpenseType = ViewBindings.findChildViewById(rootView, id);
      if (spinnerExpenseType == null) {
        break missingId;
      }

      id = R.id.spinnerSelectCard;
      Spinner spinnerSelectCard = ViewBindings.findChildViewById(rootView, id);
      if (spinnerSelectCard == null) {
        break missingId;
      }

      id = R.id.textViewAmount;
      TextView textViewAmount = ViewBindings.findChildViewById(rootView, id);
      if (textViewAmount == null) {
        break missingId;
      }

      id = R.id.textViewExpenseType;
      TextView textViewExpenseType = ViewBindings.findChildViewById(rootView, id);
      if (textViewExpenseType == null) {
        break missingId;
      }

      id = R.id.textViewExpensesLabel;
      TextView textViewExpensesLabel = ViewBindings.findChildViewById(rootView, id);
      if (textViewExpensesLabel == null) {
        break missingId;
      }

      id = R.id.textViewNote;
      TextView textViewNote = ViewBindings.findChildViewById(rootView, id);
      if (textViewNote == null) {
        break missingId;
      }

      id = R.id.textViewSelectCard;
      TextView textViewSelectCard = ViewBindings.findChildViewById(rootView, id);
      if (textViewSelectCard == null) {
        break missingId;
      }

      return new FragmentCreditCardExpensesBinding((LinearLayout) rootView, backArrow,
          buttonAddExpense, editTextAmount, editTextNote, listViewExpenses, spinnerExpenseType,
          spinnerSelectCard, textViewAmount, textViewExpenseType, textViewExpensesLabel,
          textViewNote, textViewSelectCard);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}