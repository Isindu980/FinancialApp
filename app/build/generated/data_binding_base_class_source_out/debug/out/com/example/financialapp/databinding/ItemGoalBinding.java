// Generated by view binder compiler. Do not edit!
package com.example.financialapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.financialapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemGoalBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonDelete;

  @NonNull
  public final Button buttonEdit;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView textViewGoalCurrentAmount;

  @NonNull
  public final TextView textViewGoalTargetAmount;

  @NonNull
  public final TextView textViewGoalType;

  private ItemGoalBinding(@NonNull LinearLayout rootView, @NonNull Button buttonDelete,
      @NonNull Button buttonEdit, @NonNull ProgressBar progressBar,
      @NonNull TextView textViewGoalCurrentAmount, @NonNull TextView textViewGoalTargetAmount,
      @NonNull TextView textViewGoalType) {
    this.rootView = rootView;
    this.buttonDelete = buttonDelete;
    this.buttonEdit = buttonEdit;
    this.progressBar = progressBar;
    this.textViewGoalCurrentAmount = textViewGoalCurrentAmount;
    this.textViewGoalTargetAmount = textViewGoalTargetAmount;
    this.textViewGoalType = textViewGoalType;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemGoalBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemGoalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_goal, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemGoalBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonDelete;
      Button buttonDelete = ViewBindings.findChildViewById(rootView, id);
      if (buttonDelete == null) {
        break missingId;
      }

      id = R.id.buttonEdit;
      Button buttonEdit = ViewBindings.findChildViewById(rootView, id);
      if (buttonEdit == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.textViewGoalCurrentAmount;
      TextView textViewGoalCurrentAmount = ViewBindings.findChildViewById(rootView, id);
      if (textViewGoalCurrentAmount == null) {
        break missingId;
      }

      id = R.id.textViewGoalTargetAmount;
      TextView textViewGoalTargetAmount = ViewBindings.findChildViewById(rootView, id);
      if (textViewGoalTargetAmount == null) {
        break missingId;
      }

      id = R.id.textViewGoalType;
      TextView textViewGoalType = ViewBindings.findChildViewById(rootView, id);
      if (textViewGoalType == null) {
        break missingId;
      }

      return new ItemGoalBinding((LinearLayout) rootView, buttonDelete, buttonEdit, progressBar,
          textViewGoalCurrentAmount, textViewGoalTargetAmount, textViewGoalType);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
