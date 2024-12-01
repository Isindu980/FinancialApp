// Generated by view binder compiler. Do not edit!
package com.example.financialapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.financialapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAddCardBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView backButton;

  @NonNull
  public final Button btnSaveCard;

  @NonNull
  public final EditText etCardNumber;

  @NonNull
  public final EditText etCvv;

  @NonNull
  public final EditText etExpiryDate;

  @NonNull
  public final TextView tvAddCardTitle;

  private FragmentAddCardBinding(@NonNull LinearLayout rootView, @NonNull ImageView backButton,
      @NonNull Button btnSaveCard, @NonNull EditText etCardNumber, @NonNull EditText etCvv,
      @NonNull EditText etExpiryDate, @NonNull TextView tvAddCardTitle) {
    this.rootView = rootView;
    this.backButton = backButton;
    this.btnSaveCard = btnSaveCard;
    this.etCardNumber = etCardNumber;
    this.etCvv = etCvv;
    this.etExpiryDate = etExpiryDate;
    this.tvAddCardTitle = tvAddCardTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAddCardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAddCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_add_card, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAddCardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back_button;
      ImageView backButton = ViewBindings.findChildViewById(rootView, id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.btn_save_card;
      Button btnSaveCard = ViewBindings.findChildViewById(rootView, id);
      if (btnSaveCard == null) {
        break missingId;
      }

      id = R.id.et_card_number;
      EditText etCardNumber = ViewBindings.findChildViewById(rootView, id);
      if (etCardNumber == null) {
        break missingId;
      }

      id = R.id.et_cvv;
      EditText etCvv = ViewBindings.findChildViewById(rootView, id);
      if (etCvv == null) {
        break missingId;
      }

      id = R.id.et_expiry_date;
      EditText etExpiryDate = ViewBindings.findChildViewById(rootView, id);
      if (etExpiryDate == null) {
        break missingId;
      }

      id = R.id.tv_add_card_title;
      TextView tvAddCardTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvAddCardTitle == null) {
        break missingId;
      }

      return new FragmentAddCardBinding((LinearLayout) rootView, backButton, btnSaveCard,
          etCardNumber, etCvv, etExpiryDate, tvAddCardTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}